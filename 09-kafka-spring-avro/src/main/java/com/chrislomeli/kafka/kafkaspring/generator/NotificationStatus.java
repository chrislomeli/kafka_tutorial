package com.chrislomeli.kafka.kafkaspring.generator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NotificationStatus {
    private static final long serialVersionUID = 9188160226931610406L;

    /**
     * unique id for this request, this user, and this channel (concat request_id + user_notification_id)
     */
    public String send_id;

    /**
     * UTC time in milliseconds when this service began processing this record
     */
    public java.time.Instant start_time;

    /**
     * The time in UTC millseconds when this service existed
     */
    public java.time.Instant end_time;

    /**
     * UTC time in milliseconds that this service received this request
     */
    public java.time.Instant received_time;

    /**
     * UTC time in milliseconds that this service published its output
     */
    public java.time.Instant publish_time;

    /**
     * API version number
     */
    public String api_version;

    /**
     * The service creating this record
     */
    public String app;

    /**
     * The service creating this record
     */
    public String application;

    /**
     * application team
     */
    public String appteam;

    /**
     * The host where the service was running
     */
    public String awshost;

    /**
     * test com_id
     */
    public String comm_id;

    /**
     * test cp_code
     */
    public String cp_code;

    /**
     * EMAIL,PUSH,SMS,INBOX
     */
    public String delivery_channel;

    /**
     * destination is null before transporter and the phone or email or wechatid - depending on the channel
     */
    public String destination;

    /**
     * The environment .e.g perf, prod, etc
     */
    public String environment;

    /**
     * Descriptive event class
     */
    public String eventtype;

    /**
     * Locale e.g. US, UK...
     */
    public String locale_country;

    /**
     * Language e.g. en, fr, ja...
     */
    public String locale_language;

    /**
     * TBD
     */
    public int metric;

    /**
     * test notification type
     */
    public String notification_type;

    /**
     * The lifecycle state this record is in
     */
    public String record_type;

    /**
     * test request Id
     */
    public String request_id;

    /**
     * App team and service name string
     */
    public String short_name;

    /**
     * The status of this record
     */
    public String status;

    /**
     * failure reason, but should just call it message in case it gets used for non failures in future
     */
    public String message;

    /**
     * accept_request, gather_data, determine_target, render, transport
     */
    public String step;

    /**
     * The time in milliseconds that this record took to process within this application
     */
    public long time_taken;


    public String tag;

    /**
     * test user identifier
     */
    public String upmid;

    /**
     * test user notification identity
     */
    public String user_notification_id;

    /**
     * vendor that this notification is directed to - this is null before determine_target
     */
    public String vendor;

    /**
     * version number .e.g. v2
     */
    public String version;

    @Override
    public String toString() {
        return "NotificationStatus{" +
                "send_id='" + send_id + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }
}
