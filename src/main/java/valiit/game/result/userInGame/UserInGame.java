package valiit.game.result.userInGame;

import lombok.Getter;
import lombok.Setter;
import valiit.game.result.game.Game;
import valiit.game.result.user.User;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "user_in_game")
public class UserInGame {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "game_id", nullable = false)
    private Game game;


}