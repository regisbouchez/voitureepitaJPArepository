package fr.epita.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.epita.entite.Voiture;
import fr.epita.service.VoitureService;

@RestController
public class VoitureController {
	@Autowired
	private VoitureService service;
	
	@Autowired
	private JmsTemplate jmsTemplate;
	
	@RequestMapping("/")
    public String index() {
		service.showCar();
		jmsTemplate.convertAndSend("carNotification","Hello");
		System.out.println("Notification envoyée");
        return "Greetings from Spring Boot!";
    }
	
	@RequestMapping("/create")
    public String create() {
		Voiture v = new Voiture();
		v.setCouleur("rouge");
		service.create(v);
        return "SUCCESS!";
    }
}
