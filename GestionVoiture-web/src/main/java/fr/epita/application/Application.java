package fr.epita.application;

import javax.jms.ConnectionFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jms.DefaultJmsListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;

@SpringBootApplication(scanBasePackages = {"fr.epita.controller","fr.epita.service","fr.epita.persistance","fr.epita.consumer"})
@EnableJms
public class Application {
	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
	
	@Bean
	public JmsListenerContainerFactory<?> myFactory(ConnectionFactory connectionFactory,
													DefaultJmsListenerContainerFactoryConfigurer configurer){
	DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
	configurer.configure(factory, connectionFactory);
	return factory;
	}
}
