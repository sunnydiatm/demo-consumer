package com.example.consumer.democonsumer.consumer;

import com.example.consumer.democonsumer.api.Sensor;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.schema.client.EnableSchemaRegistryClient;

@EnableBinding(Sink.class)
@EnableSchemaRegistryClient
public class ConfluentAvroConsumer {
    private final Log logger = LogFactory.getLog(getClass());

    @StreamListener(Sink.INPUT)
    public void process(Sensor data) {
        System.out.println("Received Kafka message !!! "+data);
        System.out.println("Received Metadata !!! "+data.getMetadata());
        System.out.println("Received data !!! "+data.getId());
        logger.info(data);
    }
}

