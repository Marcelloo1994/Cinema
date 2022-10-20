package esame.java.cinema.models;


import esame.java.cinema.archetypes.DtoArchetype;
import esame.java.cinema.archetypes.ModelArchetype;
import esame.java.cinema.dtos.SalaCinematograficaDto;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "salaCinematografica")
public class SalaCinematografica implements ModelArchetype {


    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "posti_totali")
    private int postiTotali;

    @OneToOne
    @JoinColumn(name = "id_film", referencedColumnName = "id")
    private Film film;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "salaCinematografica")
    private List<Spettatore> spettatori;

    @ManyToOne
    @JoinColumn(name = "id_cinema")
    private Cinema cinema;

    @Override
    public SalaCinematograficaDto toDto() {
            return SalaCinematograficaDto.builder()
                    .id(id)
                    .postiTotali(postiTotali)
                    .idFilm(film.getId())
                    .idCinema(cinema.getId())
                    .build();
    }
}
