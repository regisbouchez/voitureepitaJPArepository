package fr.epita.persistance;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.epita.entite.Voiture;

@Repository
public class VoitureDaoImpl  {
	@Autowired
	VoitureDao voitureDAO;
//	EntityManagerFactory emf=Persistence.createEntityManagerFactory("voiturePU");
//	EntityManager em;

	public void creerVoiture(Voiture v) {
	//	// TODO Auto-generated method stub
		voitureDAO.save(v);

	}
}
