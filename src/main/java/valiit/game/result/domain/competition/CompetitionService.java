package valiit.game.result.domain.competition;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CompetitionService {

    @Resource
    private CompetitionRepository competitionRepository;

    public List<Competition> findAllCompetitions() {
        return competitionRepository.findAll();
    }
}
