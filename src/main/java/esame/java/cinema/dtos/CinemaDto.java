package esame.java.cinema.dtos;

import esame.java.cinema.archetypes.DtoArchetype;
import esame.java.cinema.models.Cinema;
import esame.java.cinema.models.SalaCinematografica;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class CinemaDto implements DtoArchetype {

    private int id;
    private List<SalaCinematografica> saleCinematografiche;

    @Override
    public Cinema toModel() {
        return Cinema.builder()
                .id(id)
                .saleCinematografiche(saleCinematografiche)
                .build();
    }
}
