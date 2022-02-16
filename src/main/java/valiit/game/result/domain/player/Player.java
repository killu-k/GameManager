package valiit.game.result.domain.player;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "player")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Lob
    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Lob
    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "age", nullable = false, precision = 131089)
    private BigDecimal age;


}