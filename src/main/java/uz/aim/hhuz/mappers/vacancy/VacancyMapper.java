package uz.aim.hhuz.mappers.vacancy;

import uz.aim.hhuz.domains.vacancy.Vacancy;
import uz.aim.hhuz.dto.vacancy.VacancyCreateDTO;
import uz.aim.hhuz.dto.vacancy.VacancyDTO;
import uz.aim.hhuz.dto.vacancy.VacancyUpdateDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface VacancyMapper {

    Vacancy toVacancy(VacancyDTO dto);
    Vacancy toVacancy(VacancyCreateDTO dto);
    Vacancy fromVacancyUpdateDTO(VacancyUpdateDTO dto);
    List<VacancyDTO> fromListVacancy(List<Vacancy> vacancyList);

    VacancyDTO fromVacancyCreateDTO(VacancyCreateDTO dto);

    VacancyDTO fromVacancy(Vacancy vacancy);
}
