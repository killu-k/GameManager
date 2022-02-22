

INSERT INTO public.user_detail (id, first_name, last_name) VALUES (DEFAULT, 'Killu', 'Kaareste');
INSERT INTO public.user_detail (id, first_name, last_name) VALUES (DEFAULT, 'Kärt', 'Vajakas');
INSERT INTO public.user_detail (id, first_name, last_name) VALUES (DEFAULT, 'Timo', 'Kallaste');
INSERT INTO public.user_detail (id, first_name, last_name) VALUES (DEFAULT, 'Rain', 'Tüür');

INSERT INTO public.role (id, name) VALUES (DEFAULT, 'admin');
INSERT INTO public.role (id, name) VALUES (DEFAULT, 'referee');
INSERT INTO public.role (id, name) VALUES (DEFAULT, 'team_lead');
INSERT INTO public.role (id, name) VALUES (DEFAULT, 'player');

INSERT INTO public.game_type (id, name) VALUES (DEFAULT, 'timed');
INSERT INTO public.game_type (id, name) VALUES (DEFAULT, 'scored');
INSERT INTO public.game_type (id, name) VALUES (DEFAULT, 'tournament');

INSERT INTO public.player (id, first_name, last_name, age) VALUES (DEFAULT, 'Martin', 'Mets', 12);
INSERT INTO public.player (id, first_name, last_name, age) VALUES (DEFAULT, 'Kalle', 'Karu', 11);
INSERT INTO public.player (id, first_name, last_name, age) VALUES (DEFAULT, 'Laura', 'Lind', 13);
INSERT INTO public.player (id, first_name, last_name, age) VALUES (DEFAULT, 'Helen', 'Harakas', 14);
INSERT INTO public.player (id, first_name, last_name, age) VALUES (DEFAULT, 'Tiit', 'Tihane', 16);
INSERT INTO public.player (id, first_name, last_name, age) VALUES (DEFAULT, 'Kaarel', 'Kullerkupp', 18);
INSERT INTO public.player (id, first_name, last_name, age) VALUES (DEFAULT, 'Susanna', 'Sipelgas', 17);
INSERT INTO public.player (id, first_name, last_name, age) VALUES (DEFAULT, 'Maiu', 'Maasikas', 15);
INSERT INTO public.player (id, first_name, last_name, age) VALUES (DEFAULT, 'Kaupo', 'Kaasik', 11);
INSERT INTO public.player (id, first_name, last_name, age) VALUES (DEFAULT, 'Siim', 'Suslik', 12);
INSERT INTO public.player (id, first_name, last_name, age) VALUES (DEFAULT, 'Tiina', 'Tuvi', 13);
INSERT INTO public.player (id, first_name, last_name, age) VALUES (DEFAULT, 'Britta', 'Piiritaja', 14);
INSERT INTO public.player (id, first_name, last_name, age) VALUES (DEFAULT, 'Oleg', 'Orav', 15);
INSERT INTO public.player (id, first_name, last_name, age) VALUES (DEFAULT, 'Kalev', 'Kits', 16);
INSERT INTO public.player (id, first_name, last_name, age) VALUES (DEFAULT, 'Luule', 'Luik', 17);
INSERT INTO public.player (id, first_name, last_name, age) VALUES (DEFAULT, 'Malle', 'Musi', 18);

INSERT INTO public.competition (id, name) VALUES (DEFAULT, 'mai2022');

INSERT INTO public."user" (id, user_detail_id, user_name, password) VALUES (DEFAULT, 1, 'killu', '123');
INSERT INTO public."user" (id, user_detail_id, user_name, password) VALUES (DEFAULT, 2, 'kärt', '123');
INSERT INTO public."user" (id, user_detail_id, user_name, password) VALUES (DEFAULT, 3, 'timo', '123');
INSERT INTO public."user" (id, user_detail_id, user_name, password) VALUES (DEFAULT, 4, 'rain', '123');

INSERT INTO public.status (id, name) VALUES (DEFAULT, 'registered');
INSERT INTO public.status (id, name) VALUES (DEFAULT, 'added');
INSERT INTO public.status (id, name) VALUES (DEFAULT, 'confirmed');
INSERT INTO public.status (id, name) VALUES (DEFAULT, 'historical');

INSERT INTO public.user_role (id, user_id, role_id) VALUES (DEFAULT, 1, 1);
INSERT INTO public.user_role (id, user_id, role_id) VALUES (DEFAULT, 1, 2);
INSERT INTO public.user_role (id, user_id, role_id) VALUES (DEFAULT, 2, 2);
INSERT INTO public.user_role (id, user_id, role_id) VALUES (DEFAULT, 2, 3);
INSERT INTO public.user_role (id, user_id, role_id) VALUES (DEFAULT, 3, 2);
INSERT INTO public.user_role (id, user_id, role_id) VALUES (DEFAULT, 3, 3);
INSERT INTO public.user_role (id, user_id, role_id) VALUES (DEFAULT, 4, 4);

INSERT INTO public.game (id, game_type_id, name, date, status_id) VALUES (DEFAULT, 2, 'Köievedu', '2022-02-15', '2');
INSERT INTO public.game (id, game_type_id, name, date, status_id) VALUES (DEFAULT, 1, 'Teatejooks', '2022-02-15', '2');
INSERT INTO public.game (id, game_type_id, name, date, status_id) VALUES (DEFAULT, 2, 'Lauluvõistlus', '2022-02-15', '3');
INSERT INTO public.game (id, game_type_id, name, date, status_id) VALUES (DEFAULT, 3, 'Korvpall', '2022-02-15', '2');
INSERT INTO public.game (id, game_type_id, name, date, status_id) VALUES (DEFAULT, 1, 'Ujumine', '2022-02-15', '4');
INSERT INTO public.game (id, game_type_id, name, date, status_id) VALUES (DEFAULT, 1, 'Orienteerumine', '2022-02-15', '2');
INSERT INTO public.game (id, game_type_id, name, date, status_id) VALUES (DEFAULT, 1, 'Munajooks', '2022-02-15', '2');
INSERT INTO public.game (id, game_type_id, name, date, status_id) VALUES (DEFAULT, 2, 'Luulekonkurss', '2022-02-15', '2');
INSERT INTO public.game (id, game_type_id, name, date, status_id) VALUES (DEFAULT, 3, 'Jalgpall', '2022-02-15', '1');
INSERT INTO public.game (id, game_type_id, name, date, status_id) VALUES (DEFAULT, 2, 'Maalimine', '2022-02-15', '4');
INSERT INTO public.game (id, game_type_id, name, date, status_id) VALUES (DEFAULT, 2, 'Noolevise', '2022-02-15', '2');

INSERT INTO public.team (id, name, average_age, status_id) VALUES (DEFAULT, 'Marjamaa', 13, 2);
INSERT INTO public.team (id, name, average_age, status_id) VALUES (DEFAULT, 'Karjamaa', 13, 1);
INSERT INTO public.team (id, name, average_age, status_id) VALUES (DEFAULT, 'Soomaa', 15, 2);
INSERT INTO public.team (id, name, average_age, status_id) VALUES (DEFAULT, 'Liivamaa', 16, 2);

INSERT INTO public.tournament_setup (id, game_id, number_of_groups, points_per_round) VALUES (DEFAULT, 1, 4, 2);
INSERT INTO public.tournament_setup (id, game_id, number_of_groups, points_per_round) VALUES (DEFAULT, 2, 4, 2);
INSERT INTO public.tournament_setup (id, game_id, number_of_groups, points_per_round) VALUES (DEFAULT, 3, 4, 2);
INSERT INTO public.tournament_setup (id, game_id, number_of_groups, points_per_round) VALUES (DEFAULT, 4, 4, 2);
INSERT INTO public.tournament_setup (id, game_id, number_of_groups, points_per_round) VALUES (DEFAULT, 5, 4, 2);
INSERT INTO public.tournament_setup (id, game_id, number_of_groups, points_per_round) VALUES (DEFAULT, 6, 4, 2);
INSERT INTO public.tournament_setup (id, game_id, number_of_groups, points_per_round) VALUES (DEFAULT, 7, 4, 2);
INSERT INTO public.tournament_setup (id, game_id, number_of_groups, points_per_round) VALUES (DEFAULT, 8, 4, 2);
INSERT INTO public.tournament_setup (id, game_id, number_of_groups, points_per_round) VALUES (DEFAULT, 9, 4, 2);
INSERT INTO public.tournament_setup (id, game_id, number_of_groups, points_per_round) VALUES (DEFAULT, 10, 4, 2);
INSERT INTO public.tournament_setup (id, game_id, number_of_groups, points_per_round) VALUES (DEFAULT, 11, 4, 2);

INSERT INTO public.competition_score (id, competition_id, team_id, points) VALUES (DEFAULT, 1, 1, 90);
INSERT INTO public.competition_score (id, competition_id, team_id, points) VALUES (DEFAULT, 1, 2, 70);
INSERT INTO public.competition_score (id, competition_id, team_id, points) VALUES (DEFAULT, 1, 3, 50);
INSERT INTO public.competition_score (id, competition_id, team_id, points) VALUES (DEFAULT, 1, 4, 40);

INSERT INTO public.game_in_competition (id, competition_id, game_id) VALUES (DEFAULT, 1, 1);
INSERT INTO public.game_in_competition (id, competition_id, game_id) VALUES (DEFAULT, 1, 2);
INSERT INTO public.game_in_competition (id, competition_id, game_id) VALUES (DEFAULT, 1, 3);
INSERT INTO public.game_in_competition (id, competition_id, game_id) VALUES (DEFAULT, 1, 4);


INSERT INTO public.tournament_group (id, game_id, round_number, team_a_id, team_b_id, group_number) VALUES (DEFAULT, 1, 1, 1, 2, 1);
INSERT INTO public.tournament_group (id, game_id, round_number, team_a_id, team_b_id, group_number) VALUES (DEFAULT, 1, 1, 1, 3, 1);
INSERT INTO public.tournament_group (id, game_id, round_number, team_a_id, team_b_id, group_number) VALUES (DEFAULT, 1, 1, 1, 4, 1);
INSERT INTO public.tournament_group (id, game_id, round_number, team_a_id, team_b_id, group_number) VALUES (DEFAULT, 1, 1, 2, 3, 1);
INSERT INTO public.tournament_group (id, game_id, round_number, team_a_id, team_b_id, group_number) VALUES (DEFAULT, 1, 1, 2, 4, 1);
INSERT INTO public.tournament_group (id, game_id, round_number, team_a_id, team_b_id, group_number) VALUES (DEFAULT, 1, 1, 3, 4, 1);


INSERT INTO public.team_player (id, team_id, player_id) VALUES (DEFAULT, 1, 2);
INSERT INTO public.team_player (id, team_id, player_id) VALUES (DEFAULT, 1, 3);
INSERT INTO public.team_player (id, team_id, player_id) VALUES (DEFAULT, 1, 4);
INSERT INTO public.team_player (id, team_id, player_id) VALUES (DEFAULT, 1, 8);
INSERT INTO public.team_player (id, team_id, player_id) VALUES (DEFAULT, 2, 1);
INSERT INTO public.team_player (id, team_id, player_id) VALUES (DEFAULT, 2, 9);
INSERT INTO public.team_player (id, team_id, player_id) VALUES (DEFAULT, 2, 10);
INSERT INTO public.team_player (id, team_id, player_id) VALUES (DEFAULT, 2, 11);
INSERT INTO public.team_player (id, team_id, player_id) VALUES (DEFAULT, 3, 12);
INSERT INTO public.team_player (id, team_id, player_id) VALUES (DEFAULT, 3, 14);
INSERT INTO public.team_player (id, team_id, player_id) VALUES (DEFAULT, 3, 13);
INSERT INTO public.team_player (id, team_id, player_id) VALUES (DEFAULT, 3, 5);
INSERT INTO public.team_player (id, team_id, player_id) VALUES (DEFAULT, 4, 7);
INSERT INTO public.team_player (id, team_id, player_id) VALUES (DEFAULT, 4, 15);
INSERT INTO public.team_player (id, team_id, player_id) VALUES (DEFAULT, 4, 6);
INSERT INTO public.team_player (id, team_id, player_id) VALUES (DEFAULT, 4, 16);

INSERT INTO public.team_in_game (id, game_id, team_id) VALUES (DEFAULT, 1, 1);
INSERT INTO public.team_in_game (id, game_id, team_id) VALUES (DEFAULT, 1, 2);
INSERT INTO public.team_in_game (id, game_id, team_id) VALUES (DEFAULT, 1, 3);
INSERT INTO public.team_in_game (id, game_id, team_id) VALUES (DEFAULT, 1, 4);
INSERT INTO public.team_in_game (id, game_id, team_id) VALUES (DEFAULT, 2, 1);
INSERT INTO public.team_in_game (id, game_id, team_id) VALUES (DEFAULT, 2, 2);
INSERT INTO public.team_in_game (id, game_id, team_id) VALUES (DEFAULT, 2, 3);
INSERT INTO public.team_in_game (id, game_id, team_id) VALUES (DEFAULT, 2, 4);
INSERT INTO public.team_in_game (id, game_id, team_id) VALUES (DEFAULT, 3, 1);
INSERT INTO public.team_in_game (id, game_id, team_id) VALUES (DEFAULT, 3, 2);
INSERT INTO public.team_in_game (id, game_id, team_id) VALUES (DEFAULT, 3, 3);
INSERT INTO public.team_in_game (id, game_id, team_id) VALUES (DEFAULT, 3, 4);
INSERT INTO public.team_in_game (id, game_id, team_id) VALUES (DEFAULT, 4, 1);
INSERT INTO public.team_in_game (id, game_id, team_id) VALUES (DEFAULT, 4, 2);
INSERT INTO public.team_in_game (id, game_id, team_id) VALUES (DEFAULT, 4, 3);
INSERT INTO public.team_in_game (id, game_id, team_id) VALUES (DEFAULT, 4, 4);
INSERT INTO public.team_in_game (id, game_id, team_id) VALUES (DEFAULT, 6, 1);
INSERT INTO public.team_in_game (id, game_id, team_id) VALUES (DEFAULT, 6, 2);
INSERT INTO public.team_in_game (id, game_id, team_id) VALUES (DEFAULT, 6, 3);
INSERT INTO public.team_in_game (id, game_id, team_id) VALUES (DEFAULT, 6, 4);
INSERT INTO public.team_in_game (id, game_id, team_id) VALUES (DEFAULT, 7, 1);
INSERT INTO public.team_in_game (id, game_id, team_id) VALUES (DEFAULT, 7, 2);
INSERT INTO public.team_in_game (id, game_id, team_id) VALUES (DEFAULT, 7, 3);
INSERT INTO public.team_in_game (id, game_id, team_id) VALUES (DEFAULT, 7, 4);
INSERT INTO public.team_in_game (id, game_id, team_id) VALUES (DEFAULT, 8, 1);
INSERT INTO public.team_in_game (id, game_id, team_id) VALUES (DEFAULT, 8, 2);
INSERT INTO public.team_in_game (id, game_id, team_id) VALUES (DEFAULT, 8, 3);
INSERT INTO public.team_in_game (id, game_id, team_id) VALUES (DEFAULT, 8, 4);
INSERT INTO public.team_in_game (id, game_id, team_id) VALUES (DEFAULT, 11, 1);
INSERT INTO public.team_in_game (id, game_id, team_id) VALUES (DEFAULT, 11, 2);
INSERT INTO public.team_in_game (id, game_id, team_id) VALUES (DEFAULT, 11, 3);
INSERT INTO public.team_in_game (id, game_id, team_id) VALUES (DEFAULT, 11, 4);

INSERT INTO public.user_in_game (id, user_id, game_id) VALUES (DEFAULT, 1, 1);
INSERT INTO public.user_in_game (id, user_id, game_id) VALUES (DEFAULT, 1, 2);
INSERT INTO public.user_in_game (id, user_id, game_id) VALUES (DEFAULT, 1, 3);
INSERT INTO public.user_in_game (id, user_id, game_id) VALUES (DEFAULT, 1, 4);
INSERT INTO public.user_in_game (id, user_id, game_id) VALUES (DEFAULT, 1, 5);
INSERT INTO public.user_in_game (id, user_id, game_id) VALUES (DEFAULT, 1, 6);
INSERT INTO public.user_in_game (id, user_id, game_id) VALUES (DEFAULT, 1, 7);
INSERT INTO public.user_in_game (id, user_id, game_id) VALUES (DEFAULT, 1, 8);
INSERT INTO public.user_in_game (id, user_id, game_id) VALUES (DEFAULT, 1, 9);
INSERT INTO public.user_in_game (id, user_id, game_id) VALUES (DEFAULT, 1, 10);
INSERT INTO public.user_in_game (id, user_id, game_id) VALUES (DEFAULT, 1, 11);
INSERT INTO public.user_in_game (id, user_id, game_id) VALUES (DEFAULT, 2, 1);
INSERT INTO public.user_in_game (id, user_id, game_id) VALUES (DEFAULT, 2, 2);
INSERT INTO public.user_in_game (id, user_id, game_id) VALUES (DEFAULT, 2, 3);
INSERT INTO public.user_in_game (id, user_id, game_id) VALUES (DEFAULT, 2, 4);
INSERT INTO public.user_in_game (id, user_id, game_id) VALUES (DEFAULT, 2, 5);
INSERT INTO public.user_in_game (id, user_id, game_id) VALUES (DEFAULT, 2, 6);
INSERT INTO public.user_in_game (id, user_id, game_id) VALUES (DEFAULT, 2, 7);
INSERT INTO public.user_in_game (id, user_id, game_id) VALUES (DEFAULT, 2, 8);
INSERT INTO public.user_in_game (id, user_id, game_id) VALUES (DEFAULT, 2, 9);
INSERT INTO public.user_in_game (id, user_id, game_id) VALUES (DEFAULT, 2, 10);
INSERT INTO public.user_in_game (id, user_id, game_id) VALUES (DEFAULT, 2, 11);

INSERT INTO public.score (id, game_id, team_id, time_in_seconds, referee_score, points) VALUES (DEFAULT, 2, 1, 300, null, 4);
INSERT INTO public.score (id, game_id, team_id, time_in_seconds, referee_score, points) VALUES (DEFAULT, 2, 2, 500, null, 2);
INSERT INTO public.score (id, game_id, team_id, time_in_seconds, referee_score, points) VALUES (DEFAULT, 3, 1, null, 28, 2);
INSERT INTO public.score (id, game_id, team_id, time_in_seconds, referee_score, points) VALUES (DEFAULT, 3, 2, null, 56, 4);
INSERT INTO public.score (id, game_id, team_id, time_in_seconds, referee_score, points) VALUES (DEFAULT, 3, 3, null, 88, 8);
INSERT INTO public.score (id, game_id, team_id, time_in_seconds, referee_score, points) VALUES (DEFAULT, 3, 4, null, 68, 6);
INSERT INTO public.score (id, game_id, team_id, time_in_seconds, referee_score, points) VALUES (DEFAULT, 2, 3, 389, null, 4);
INSERT INTO public.score (id, game_id, team_id, time_in_seconds, referee_score, points) VALUES (DEFAULT, 2, 4, 189, null, 8);

INSERT INTO public.tournament_round_score (id, team_a_result, team_b_result, tournament_group_id) VALUES (DEFAULT, 1, 0, 1);
INSERT INTO public.tournament_round_score (id, team_a_result, team_b_result, tournament_group_id) VALUES (DEFAULT, 0, 1, 2);
INSERT INTO public.tournament_round_score (id, team_a_result, team_b_result, tournament_group_id) VALUES (DEFAULT, 1, 0, 3);
INSERT INTO public.tournament_round_score (id, team_a_result, team_b_result, tournament_group_id) VALUES (DEFAULT, 0, 1, 4);

INSERT INTO public.tournament_result (id, points, team_id) VALUES (DEFAULT, 10, 1);
