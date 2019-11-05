package fr.epita.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class VoitureConsumer {
	
	@JmsListener(destination = "carNotification", containerFactory = "myFactory")
	public void receiveMessage(String msg) {
		System.out.println("notification recue <" + msg + ">");
	}
}
