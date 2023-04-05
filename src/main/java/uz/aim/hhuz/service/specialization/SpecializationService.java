package uz.aim.hhuz.service.specialization;

import uz.aim.hhuz.domains.specialization.Specialization;
import org.springframework.stereotype.Service;

@Service
public interface SpecializationService {
    Specialization getSpecializationById(Long id);
}
