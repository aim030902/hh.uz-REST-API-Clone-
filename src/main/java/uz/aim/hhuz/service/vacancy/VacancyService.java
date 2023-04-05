package uz.aim.hhuz.service.vacancy;

import uz.aim.hhuz.domains.vacancy.Vacancy;
import uz.aim.hhuz.dto.vacancy.VacancyCreateDTO;
import uz.aim.hhuz.dto.vacancy.VacancyDTO;
import uz.aim.hhuz.dto.vacancy.VacancyUpdateDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VacancyService {
    VacancyDTO create(VacancyCreateDTO dto);

    VacancyDTO update(VacancyUpdateDTO dto);

    void delete(Long id);

    VacancyDTO getOne(Long id);

    List<VacancyDTO> findAll();
    Vacancy getVacancyById(Long id);
}
