package fr.epita.persistance;

import java.util.List;

import fr.epita.entite.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoitureDao extends JpaRepository<Voiture, Long> {

}
