package esame.java.cinema.models;


import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "biglietto")
public class Biglietto {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "posto_a_sedere")
    private int postoASedere;

    @Column(name = "prezzo")
    private int prezzo;

    @OneToOne(mappedBy = "biglietto")
    private Spettatore spettatore;
}
