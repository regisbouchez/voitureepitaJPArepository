package fr.epita.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.epita.entite.Voiture;
import fr.epita.persistance.VoitureDao;

@Service
public class VoitureServiceImpl implements VoitureService {
	@Autowired
	private VoitureDao voitureDao;

	@Override
	public void showCar() {
		// TODO Auto-generated method stub
		System.out.println("Je suis dans le service");
		
	}

	@Override
	public void create(Voiture v) {
		// TODO Auto-generated method stub
		voitureDao.save(v);
		
	}

}
