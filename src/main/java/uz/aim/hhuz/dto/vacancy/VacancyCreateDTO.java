package uz.aim.hhuz.dto.vacancy;

import uz.aim.hhuz.domains.address.City;
import uz.aim.hhuz.domains.specialization.Skill;
import uz.aim.hhuz.domains.specialization.Specialization;
import uz.aim.hhuz.domains.vacancy.ContactInfo;
import uz.aim.hhuz.enums.user.Experience;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class VacancyCreateDTO {
    private String title;
    private List<Specialization> specializations;
    private List<City> cityList;
    private Experience experience;
    private String description;
    private List<Skill> skillList;
    private ContactInfo contactInfo;
}
