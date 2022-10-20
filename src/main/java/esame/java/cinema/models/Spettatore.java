package esame.java.cinema.models;

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
public class Spettatore {

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



}
