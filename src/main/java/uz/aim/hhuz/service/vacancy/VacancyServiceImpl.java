package uz.aim.hhuz.service.vacancy;

import uz.aim.hhuz.domains.vacancy.Vacancy;
import uz.aim.hhuz.dto.vacancy.VacancyCreateDTO;
import uz.aim.hhuz.dto.vacancy.VacancyDTO;
import uz.aim.hhuz.dto.vacancy.VacancyUpdateDTO;
import uz.aim.hhuz.enums.user.Experience;
import uz.aim.hhuz.exceptions.VacancyNotFoundException;
import uz.aim.hhuz.mappers.vacancy.VacancyMapper;
import uz.aim.hhuz.repository.vacancy.VacancyRepository;
import uz.aim.hhuz.service.country.CityService;
import uz.aim.hhuz.service.specialization.CategoryService;
import uz.aim.hhuz.service.specialization.SkillService;
import uz.aim.hhuz.service.specialization.SpecializationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@RequiredArgsConstructor
@Service
public class VacancyServiceImpl implements VacancyService {

    private final VacancyRepository vacancyRepository;
    private final SpecializationService specializationService;
    private final SkillService skillService;
    private final CityService cityService;
    private final ContactInfoService contactInfoService;
    private final CategoryService categoryService;
    private final VacancyMapper vacancyMapper;


    @Override
    public VacancyDTO create(VacancyCreateDTO dto) {
        dto.getSpecializations().forEach(specialization -> specializationService.getSpecializationById(specialization.getId()));
        dto.getCityList().forEach(city -> cityService.getCityById(city.getId()));
        Experience.findByExperience(dto.getExperience().name());
        dto.getSkillList().forEach(skill -> skillService.getSkillById(skill.getId()));
        contactInfoService.getContactInfoById(dto.getContactInfo().getId());
        Vacancy vacancy = vacancyMapper.toVacancy(dto);
        vacancy.setCreatedAt(LocalDateTime.now());
        vacancy.setCreatedBy(1L);
        Vacancy save = vacancyRepository.save(vacancy);
        return vacancyMapper.fromVacancy(save);
    }

    @Override
    public VacancyDTO update(VacancyUpdateDTO dto) {
        Vacancy vacancy = getVacancyById(dto.getId());
        vacancy.setUpdatedAt(LocalDateTime.now());
        vacancy.setUpdatedBy(1L);
        if (!Objects.isNull(dto.getCityList())) {
            vacancy.setCityList(dto.getCityList());
        }
        if (!Objects.isNull(dto.getContactInfo())) {
            vacancy.setContactInfo(dto.getContactInfo());
        }
        if (!Objects.isNull(dto.getDescription())) {
            vacancy.setDescription(dto.getDescription());
        }
        if (!Objects.isNull(dto.getExperience())) {
            vacancy.setExperience(dto.getExperience());
        }
        if (!Objects.isNull(dto.getSkillList())) {
            vacancy.setSkillList(dto.getSkillList());
        }
        if (!Objects.isNull(dto.getSpecializations())) {
            vacancy.setSpecializations(dto.getSpecializations());
        }
        if (!Objects.isNull(dto.getTitle())) {
            vacancy.setTitle(dto.getTitle());
        }
        return vacancyMapper.fromVacancy(vacancy);
    }

    @Override
    public void delete(Long id) {
        Vacancy vacancyById = getVacancyById(id);
        if (vacancyById.getDeleted().equals(Boolean.TRUE)) {
            throw new RuntimeException("Vacancy deleted");
        }
        vacancyById.setDeleted(Boolean.TRUE);
        vacancyRepository.save(vacancyById);
    }


    @Override
    public VacancyDTO getOne(Long id) {
        Vacancy vacancy = getVacancyById(id);
        VacancyDTO vacancyDTO = vacancyMapper.fromVacancy(vacancy);
        return vacancyDTO;
    }

    @Override
    public List<VacancyDTO> findAll() {
        List<Vacancy> vacancyList = vacancyRepository.findAll();
        List<VacancyDTO> vacancyDTOS = vacancyMapper.fromListVacancy(vacancyList);
        return vacancyDTOS;
    }

    @Override
    public Vacancy getVacancyById(Long id) {
        Vacancy vacancyNotFoundById = vacancyRepository.findById(id).orElseThrow(() -> {
            throw new VacancyNotFoundException("Vacancy Not Found By Id");
        });
        return vacancyNotFoundById;
    }
}
