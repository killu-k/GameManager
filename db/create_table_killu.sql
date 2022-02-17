-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2022-02-17 13:54:20.173

-- tables
-- Table: competition
CREATE TABLE competition (
                             id serial  NOT NULL,
                             name varchar(255)  NOT NULL,
                             CONSTRAINT competition_pk PRIMARY KEY (id)
);

-- Table: competition_score
CREATE TABLE competition_score (
                                   id serial  NOT NULL,
                                   competition_id int  NOT NULL,
                                   team_id int  NOT NULL,
                                   points int  NOT NULL,
                                   CONSTRAINT competition_score_pk PRIMARY KEY (id)
);

-- Table: game
CREATE TABLE game (
                      id serial  NOT NULL,
                      game_type_id int  NOT NULL,
                      status_id int  NOT NULL,
                      name varchar(255)  NOT NULL,
                      date date  NOT NULL,
                      CONSTRAINT game_pk PRIMARY KEY (id)
);

-- Table: game_in_competition
CREATE TABLE game_in_competition (
                                     id serial  NOT NULL,
                                     name varchar(255)  NOT NULL,
                                     competition_id int  NOT NULL,
                                     game_id int  NOT NULL,
                                     CONSTRAINT game_in_competition_pk PRIMARY KEY (id)
);

-- Table: game_type
CREATE TABLE game_type (
                           id serial  NOT NULL,
                           name varchar(255)  NOT NULL,
                           CONSTRAINT game_type_pk PRIMARY KEY (id)
);

-- Table: player
CREATE TABLE player (
                        id serial  NOT NULL,
                        first_name varchar(255)  NOT NULL,
                        last_name varchar(255)  NOT NULL,
                        age decimal(4,1)  NOT NULL,
                        CONSTRAINT player_pk PRIMARY KEY (id)
);

-- Table: role
CREATE TABLE role (
                      id serial  NOT NULL,
                      name varchar(255)  NOT NULL,
                      CONSTRAINT role_pk PRIMARY KEY (id)
);

-- Table: score
CREATE TABLE score (
                       id serial  NOT NULL,
                       game_id int  NOT NULL,
                       team_id int  NOT NULL,
                       time_in_seconds bigint  NULL,
                       referee_score int  NULL,
                       points int  NOT NULL,
                       CONSTRAINT score_pk PRIMARY KEY (id)
);

-- Table: status
CREATE TABLE status (
                        id serial  NOT NULL,
                        name varchar(255)  NOT NULL,
                        CONSTRAINT status_pk PRIMARY KEY (id)
);

-- Table: team
CREATE TABLE team (
                      id serial  NOT NULL,
                      name varchar(255)  NOT NULL,
                      average_age decimal(4,1)  NULL,
                      status_id int  NOT NULL,
                      CONSTRAINT team_pk PRIMARY KEY (id)
);

-- Table: team_in_game
CREATE TABLE team_in_game (
                              id serial  NOT NULL,
                              game_id int  NOT NULL,
                              team_id int  NOT NULL,
                              CONSTRAINT team_in_game_pk PRIMARY KEY (id)
);

-- Table: team_player
CREATE TABLE team_player (
                             id serial  NOT NULL,
                             team_id int  NOT NULL,
                             player_id int  NOT NULL,
                             CONSTRAINT team_player_pk PRIMARY KEY (id)
);

-- Table: tournament_group
CREATE TABLE tournament_group (
                                  id serial  NOT NULL,
                                  game_id int  NOT NULL,
                                  round_number int  NOT NULL,
                                  team_a_id int  NOT NULL,
                                  team_b_id int  NOT NULL,
                                  group_number int  NOT NULL,
                                  CONSTRAINT tournament_group_pk PRIMARY KEY (id)
);

-- Table: tournament_result
CREATE TABLE tournament_result (
                                   id serial  NOT NULL,
                                   points int  NOT NULL,
                                   team_id int  NOT NULL,
                                   CONSTRAINT tournament_result_pk PRIMARY KEY (id)
);

-- Table: tournament_round_score
CREATE TABLE tournament_round_score (
                                        id serial  NOT NULL,
                                        team_a_result int  NULL,
                                        team_b_result int  NULL,
                                        tournament_group_id int  NOT NULL,
                                        CONSTRAINT tournament_round_score_pk PRIMARY KEY (id)
);

-- Table: tournament_setup
CREATE TABLE tournament_setup (
                                  id serial  NOT NULL,
                                  game_id int  NOT NULL,
                                  number_of_groups int  NOT NULL,
                                  points_per_round int  NOT NULL,
                                  CONSTRAINT tournament_setup_pk PRIMARY KEY (id)
);

-- Table: user
CREATE TABLE "user" (
                        id serial  NOT NULL,
                        user_detail_id int  NOT NULL,
                        user_name varchar(255)  NOT NULL,
                        password varchar(255)  NOT NULL,
                        CONSTRAINT user_pk PRIMARY KEY (id)
);

-- Table: user_detail
CREATE TABLE user_detail (
                             id serial  NOT NULL,
                             first_name varchar(255)  NOT NULL,
                             last_name varchar(255)  NOT NULL,
                             CONSTRAINT user_detail_pk PRIMARY KEY (id)
);

-- Table: user_in_game
CREATE TABLE user_in_game (
                              id serial  NOT NULL,
                              user_id int  NOT NULL,
                              game_id int  NOT NULL,
                              CONSTRAINT user_in_game_pk PRIMARY KEY (id)
);

-- Table: user_role
CREATE TABLE user_role (
                           id serial  NOT NULL,
                           user_id int  NOT NULL,
                           role_id int  NOT NULL,
                           CONSTRAINT user_role_pk PRIMARY KEY (id)
);

-- foreign keys
-- Reference: competition_score_competition (table: competition_score)
ALTER TABLE competition_score ADD CONSTRAINT competition_score_competition
    FOREIGN KEY (competition_id)
        REFERENCES competition (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: competition_score_team (table: competition_score)
ALTER TABLE competition_score ADD CONSTRAINT competition_score_team
    FOREIGN KEY (team_id)
        REFERENCES team (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: game_game_type (table: game)
ALTER TABLE game ADD CONSTRAINT game_game_type
    FOREIGN KEY (game_type_id)
        REFERENCES game_type (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: game_in_competition_competition (table: game_in_competition)
ALTER TABLE game_in_competition ADD CONSTRAINT game_in_competition_competition
    FOREIGN KEY (competition_id)
        REFERENCES competition (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: game_in_competition_game (table: game_in_competition)
ALTER TABLE game_in_competition ADD CONSTRAINT game_in_competition_game
    FOREIGN KEY (game_id)
        REFERENCES game (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: game_status (table: game)
ALTER TABLE game ADD CONSTRAINT game_status
    FOREIGN KEY (status_id)
        REFERENCES status (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: score_game (table: score)
ALTER TABLE score ADD CONSTRAINT score_game
    FOREIGN KEY (game_id)
        REFERENCES game (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: team_in_game_game (table: team_in_game)
ALTER TABLE team_in_game ADD CONSTRAINT team_in_game_game
    FOREIGN KEY (game_id)
        REFERENCES game (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: team_in_game_team (table: team_in_game)
ALTER TABLE team_in_game ADD CONSTRAINT team_in_game_team
    FOREIGN KEY (team_id)
        REFERENCES team (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: team_player_player (table: team_player)
ALTER TABLE team_player ADD CONSTRAINT team_player_player
    FOREIGN KEY (player_id)
        REFERENCES player (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: team_player_team (table: team_player)
ALTER TABLE team_player ADD CONSTRAINT team_player_team
    FOREIGN KEY (team_id)
        REFERENCES team (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: team_status (table: team)
ALTER TABLE team ADD CONSTRAINT team_status
    FOREIGN KEY (status_id)
        REFERENCES status (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: timed_score_team (table: score)
ALTER TABLE score ADD CONSTRAINT timed_score_team
    FOREIGN KEY (team_id)
        REFERENCES team (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: tournament_group_game (table: tournament_group)
ALTER TABLE tournament_group ADD CONSTRAINT tournament_group_game
    FOREIGN KEY (game_id)
        REFERENCES game (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: tournament_group_team (table: tournament_group)
ALTER TABLE tournament_group ADD CONSTRAINT tournament_group_team
    FOREIGN KEY (team_a_id)
        REFERENCES team (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: tournament_result_team (table: tournament_result)
ALTER TABLE tournament_result ADD CONSTRAINT tournament_result_team
    FOREIGN KEY (team_id)
        REFERENCES team (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: tournament_round_score_tournament_group (table: tournament_round_score)
ALTER TABLE tournament_round_score ADD CONSTRAINT tournament_round_score_tournament_group
    FOREIGN KEY (tournament_group_id)
        REFERENCES tournament_group (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: tournament_setup_game (table: tournament_setup)
ALTER TABLE tournament_setup ADD CONSTRAINT tournament_setup_game
    FOREIGN KEY (game_id)
        REFERENCES game (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: user_in_game_game (table: user_in_game)
ALTER TABLE user_in_game ADD CONSTRAINT user_in_game_game
    FOREIGN KEY (game_id)
        REFERENCES game (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: user_in_game_user (table: user_in_game)
ALTER TABLE user_in_game ADD CONSTRAINT user_in_game_user
    FOREIGN KEY (user_id)
        REFERENCES "user" (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: user_role_role (table: user_role)
ALTER TABLE user_role ADD CONSTRAINT user_role_role
    FOREIGN KEY (role_id)
        REFERENCES role (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: user_role_user (table: user_role)
ALTER TABLE user_role ADD CONSTRAINT user_role_user
    FOREIGN KEY (user_id)
        REFERENCES "user" (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: user_user_detail (table: user)
ALTER TABLE "user" ADD CONSTRAINT user_user_detail
    FOREIGN KEY (user_detail_id)
        REFERENCES user_detail (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- End of file.

