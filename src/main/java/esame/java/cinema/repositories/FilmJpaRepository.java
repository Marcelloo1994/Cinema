package esame.java.cinema.repositories;

import esame.java.cinema.models.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmJpaRepository extends JpaRepository<Film, Integer> {
}
