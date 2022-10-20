package esame.java.cinema.models;


import esame.java.cinema.archetypes.DtoArchetype;
import esame.java.cinema.archetypes.ModelArchetype;
import esame.java.cinema.dtos.CinemaDto;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "cinema")
public class Cinema implements ModelArchetype {

    @Id
    @Column(name = "id")
    private int id;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "cinema")
    private List<SalaCinematografica> saleCinematografiche;

    @Override
    public CinemaDto toDto() {
        return CinemaDto.builder()
                .id(this.id)
                .saleCinematograficheList(saleCinematografiche)
                .build();
    }
}
