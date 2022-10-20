package esame.java.cinema.models;


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
public class SalaCinematografica {


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

}
