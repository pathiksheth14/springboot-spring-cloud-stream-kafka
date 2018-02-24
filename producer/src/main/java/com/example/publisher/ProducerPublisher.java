package com.example.publisher;

import com.example.channel.Producer;
import org.springframework.integration.annotation.Publisher;
import org.springframework.stereotype.Component;

@Component
public class ProducerPublisher {

    @Publisher(channel = Producer.OUTPUTCHANNEL)
    public String send(final String content){
      return content;
    }
}
