package esame.java.cinema.dtos;

import esame.java.cinema.archetypes.DtoArchetype;
import esame.java.cinema.archetypes.ModelArchetype;
import esame.java.cinema.models.Film;
import esame.java.cinema.models.SalaCinematografica;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class FilmDto implements DtoArchetype {

    private int id;
    private String titolo;
    private String regista;
    private String produttore;
    private int etaMinima;
    private int durata;
    private int idSalaCinematografica;

    @Override
    public Film toModel() {
        return Film.builder()
                .id(id)
                .titolo(titolo)
                .regista(regista)
                .produttore(produttore)
                .durata(durata)
                .etaMinima(etaMinima)
                .salaCinematografica(SalaCinematografica.builder().id(id).build())
                .build();
    }
}
