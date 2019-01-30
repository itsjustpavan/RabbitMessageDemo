package com.message.messagereciever;

import org.springframework.amqp.core.Queue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MessagerecieverApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessagerecieverApplication.class, args);
	}
	@Bean
    public Queue queue() {
        return new Queue("CustomerQ", false);
 
    }
}

