package tn.esprit.anis_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.anis_project.entities.Piste;
@Repository
public interface IPisteRepo extends JpaRepository<Piste,Long> {
}
