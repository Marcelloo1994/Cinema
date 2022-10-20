package esame.java.cinema.models;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "film")
public class Film {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "titolo")
    private String titolo;

    @Column(name = "regista")
    private String regista;

    @Column(name = "produttore")
    private String produttore;

    @Column(name = "eta_minima")
    private int etaMinima;

    @Column(name = "durata")
    private int durata;

    @OneToOne(mappedBy = "film")
    private SalaCinematografica salaCinematografica;

}
