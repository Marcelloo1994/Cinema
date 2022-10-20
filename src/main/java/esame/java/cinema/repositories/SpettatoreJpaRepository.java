package esame.java.cinema.repositories;

import esame.java.cinema.models.Spettatore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpettatoreJpaRepository extends JpaRepository<Spettatore, Integer> {
}
