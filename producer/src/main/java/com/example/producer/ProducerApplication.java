package com.example.producer;

import com.example.channel.Producer;
import com.example.web.ProducerController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.ComponentScan;


@EnableBinding(Producer.class)
@EnableAutoConfiguration
@ComponentScan(basePackages={
		"com.example.web", "com.example.publisher"})
@SpringBootApplication
public class ProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProducerApplication.class, args);
	}
}
