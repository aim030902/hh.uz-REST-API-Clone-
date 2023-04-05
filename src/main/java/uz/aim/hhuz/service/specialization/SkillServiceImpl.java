package uz.aim.hhuz.service.specialization;

import uz.aim.hhuz.domains.specialization.Skill;
import uz.aim.hhuz.exceptions.SkillNotFoundException;
import uz.aim.hhuz.repository.specialization.SkillRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SkillServiceImpl implements SkillService{
    private final SkillRepository skillRepository;

    @Override
    public Skill getSkillById(Long id) {
        Skill skillNotFoundById = skillRepository.findById(id).orElseThrow(() -> {
            throw new SkillNotFoundException("Skill Not Found By Id");
        });
        return skillNotFoundById;
    }
}
