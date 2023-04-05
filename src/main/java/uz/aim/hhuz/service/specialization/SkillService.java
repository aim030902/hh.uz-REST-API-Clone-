package uz.aim.hhuz.service.specialization;

import uz.aim.hhuz.domains.specialization.Skill;
import org.springframework.stereotype.Service;

@Service
public interface SkillService {
    Skill getSkillById(Long id);
}
