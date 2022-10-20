package esame.java.cinema.repositories;

import esame.java.cinema.models.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CinemaJpaRepository extends JpaRepository<Cinema, Integer> {
}
