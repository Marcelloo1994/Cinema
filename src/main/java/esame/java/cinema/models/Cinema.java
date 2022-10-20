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
@Table(name = "cinema")
public class Cinema {

    @Id
    @Column(name = "id")
    private int id;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "cinema")
    private List<SalaCinematografica> saleCinematografiche;

}
