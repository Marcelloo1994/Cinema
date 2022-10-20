package esame.java.cinema.repositories;

import esame.java.cinema.models.SalaCinematografica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaCinematograficaJpaRepository extends JpaRepository<SalaCinematografica, Integer> {
}
