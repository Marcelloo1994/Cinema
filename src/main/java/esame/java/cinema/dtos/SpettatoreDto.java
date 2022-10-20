package esame.java.cinema.dtos;


import esame.java.cinema.archetypes.DtoArchetype;
import esame.java.cinema.archetypes.ModelArchetype;
import esame.java.cinema.models.Biglietto;
import esame.java.cinema.models.SalaCinematografica;
import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class SpettatoreDto implements DtoArchetype {

    private int id;
    private String nome;
    private String cognome;
    private LocalDate dataNascita;
    private int idSalaCinematografica;
    private int idBiglietto;

    @Override
    public ModelArchetype toModel() {
        return null;
    }
}
