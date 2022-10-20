package esame.java.cinema.models;

import esame.java.cinema.archetypes.DtoArchetype;
import esame.java.cinema.archetypes.ModelArchetype;
import esame.java.cinema.dtos.FilmDto;
import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "film")
public class Film implements ModelArchetype {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "titolo")
    private String titolo;

    @Column(name = "regista")
    private String regista;

    @Column(name = "produttore")
    private String produttore;

    @Column(name = "eta_minima")
    private int etaMinima;

    @Column(name = "durata")
    private int durata;

    @OneToOne(mappedBy = "film")
    private SalaCinematografica salaCinematografica;

    @Override
    public FilmDto toDto() {
        return FilmDto.builder()
                .id(id)
                .titolo(titolo)
                .regista(regista)
                .produttore(produttore)
                .etaMinima(etaMinima)
                .durata(durata)
                .idSalaCinematografica(salaCinematografica.getId())
                .build();
    }
}
