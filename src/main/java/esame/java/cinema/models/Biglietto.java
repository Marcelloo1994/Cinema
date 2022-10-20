package esame.java.cinema.models;


import esame.java.cinema.archetypes.DtoArchetype;
import esame.java.cinema.archetypes.ModelArchetype;
import esame.java.cinema.dtos.BigliettoDto;
import esame.java.cinema.dtos.SpettatoreDto;
import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "biglietto")
public class Biglietto implements ModelArchetype {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "posto_a_sedere")
    private int postoASedere;

    @Column(name = "prezzo")
    private int prezzo;

    @OneToOne(mappedBy = "biglietto")
    private Spettatore spettatore;

    @Override
    public BigliettoDto toDto() {
        return BigliettoDto.builder()
                .id(this.id)
                .postoASedere(this.postoASedere)
                .prezzo(this.prezzo)
                .idSpettatore(spettatore.getId())
                .build();
    }
}
