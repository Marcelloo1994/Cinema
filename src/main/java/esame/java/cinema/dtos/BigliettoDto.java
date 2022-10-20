package esame.java.cinema.dtos;

import esame.java.cinema.archetypes.DtoArchetype;
import esame.java.cinema.archetypes.ModelArchetype;
import esame.java.cinema.models.Biglietto;
import esame.java.cinema.models.Spettatore;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class BigliettoDto implements DtoArchetype {

    private int id;
    private int postoASedere;
    private int prezzo;
    private int idSpettatore;

    @Override
    public Biglietto toModel() {
        return Biglietto.builder()
                .id(id)
                .spettatore(Spettatore.builder().id(idSpettatore).build())
                .postoASedere(postoASedere)
                .prezzo(prezzo)
                .build();
    }
}
