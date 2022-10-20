package esame.java.cinema.models;

import esame.java.cinema.archetypes.DtoArchetype;
import esame.java.cinema.archetypes.ModelArchetype;
import esame.java.cinema.dtos.SpettatoreDto;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "spettatore")
public class Spettatore implements ModelArchetype {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cognome")
    private String cognome;

    @Column(name = "data_nascita")
    private LocalDate dataNascita;

    @ManyToOne
    @JoinColumn(name = "id_salaCinematografica")
    private SalaCinematografica salaCinematografica;

    @OneToOne
    @JoinColumn(name = "id_biglietto", referencedColumnName = "id")
    private Biglietto biglietto;

    @Override
    public SpettatoreDto toDto() {
        return SpettatoreDto.builder()
                .id(id)
                .nome(nome)
                .cognome(cognome)
                .dataNascita(dataNascita)
                .idBiglietto(biglietto.getId())
                .build();
    }
}
