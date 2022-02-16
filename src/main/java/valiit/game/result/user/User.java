package valiit.game.result.user;

import lombok.Getter;
import lombok.Setter;
import valiit.game.result.userDetail.UserDetail;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "\"user\"")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_detail_id", nullable = false)
    private UserDetail userDetail;

    @Lob
    @Column(name = "user_name", nullable = false)
    private String userName;

    @Lob
    @Column(name = "password", nullable = false)
    private String password;


}