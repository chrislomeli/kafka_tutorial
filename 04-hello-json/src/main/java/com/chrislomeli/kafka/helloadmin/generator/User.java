package com.chrislomeli.kafka.helloadmin.generator;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @JsonAlias({"name", "userName"})
    String userName;
    String emailAddress;
    Integer age;
    Instant birthTime;
    Long id;
}
