package valiit.game.result.service.score;

import lombok.Data;

import java.util.List;

@Data
public class TimedScoreResponse {

    private final String gameName;
    private final List<String> teamName;
    private final List<Long> timeInSeconds;
    private final List<Integer> points;
}