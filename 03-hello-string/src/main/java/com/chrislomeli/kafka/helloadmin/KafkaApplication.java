package com.chrislomeli.kafka.helloadmin;

import com.chrislomeli.kafka.helloadmin.admin.AdminExample;
import com.chrislomeli.kafka.helloadmin.config.MyConfiguration;
import com.chrislomeli.kafka.helloadmin.consumer.ConsumerExample;
import com.chrislomeli.kafka.helloadmin.producer.HelloProducerExample;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * In this example we are:
 * (1) Breaking the producer code into configuration (factory) classes and run classes - especially for the producer
 * (2) Adding AdminClient functionality
 * Admin
 * We are adding some admin client commands that
 * work with every Kafka implementation
 * Why show them?  Because we want to evaluate our options with respect to the Kafka environment and

 */
@Slf4j
@SpringBootApplication
public class KafkaApplication implements ApplicationRunner {

    public void examples(String profile, int recordCount) {

        MyConfiguration.initializeConfiguration(profile);

        String topic = MyConfiguration.topic;

        /*
          Read the list of topics and create my topic if it does not already exist.
           this only works with Confluent or native Kafka.
         */
        if (MyConfiguration.admin_client) AdminExample.doExample(topic);

        HelloProducerExample.doExample(topic, recordCount);

        ConsumerExample.doExample(topic, "my-user-group");
    }

    public static void main(String... args) throws Exception {
        SpringApplication.run(KafkaApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        String profile = "local.string.properties";
        int recordCount = 10;
        if (args.getOptionNames().contains("properties")) {
            profile = args.getOptionValues("properties").get(0);
        }
        if (args.getOptionNames().contains("records")) {
            recordCount = Integer.parseInt(args.getOptionValues("records").get(0));
        }

        examples(profile, recordCount);

        System.exit(0);
    }
}
