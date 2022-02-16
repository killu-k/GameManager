package valiit.game.result.domain.userDetail;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "user_detail")
public class UserDetail {
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


}