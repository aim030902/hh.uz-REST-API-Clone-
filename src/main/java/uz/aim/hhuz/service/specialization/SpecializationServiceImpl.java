package uz.aim.hhuz.service.specialization;

import uz.aim.hhuz.domains.specialization.Specialization;
import uz.aim.hhuz.exceptions.SpecializationNotFoundException;
import uz.aim.hhuz.repository.specialization.SpecializationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SpecializationServiceImpl implements SpecializationService{
    private final SpecializationRepository specializationRepository;

    @Override
    public Specialization getSpecializationById(Long id) {
        Specialization specializationNotFoundById = specializationRepository.findById(id).orElseThrow(() -> {
            throw new SpecializationNotFoundException("Specialization Not Found By Id");
        });
        return specializationNotFoundById;
    }
}
