package esame.java.cinema.dtos;


import esame.java.cinema.archetypes.DtoArchetype;
import esame.java.cinema.archetypes.ModelArchetype;
import esame.java.cinema.models.Film;
import esame.java.cinema.models.SalaCinematografica;
import esame.java.cinema.models.Spettatore;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class SalaCinematograficaDto implements DtoArchetype {

    private int id;
    private int postiTotali;
    private int idFilm;
    private int idCinema;


    @Override
    public SalaCinematografica toModel() {
        return SalaCinematografica.builder()
                .id(id)
                .postiTotali(postiTotali)
                .film(Film.builder().id(id).build())
                .build();
    }
}
