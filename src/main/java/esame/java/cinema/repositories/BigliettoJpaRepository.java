package esame.java.cinema.repositories;

import esame.java.cinema.models.Biglietto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BigliettoJpaRepository extends JpaRepository<Biglietto, Integer> {
}
