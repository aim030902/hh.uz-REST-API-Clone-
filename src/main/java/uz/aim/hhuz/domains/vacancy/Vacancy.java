package uz.aim.hhuz.domains.vacancy;

import uz.aim.hhuz.domains.Auditable;
import uz.aim.hhuz.domains.specialization.Skill;
import uz.aim.hhuz.domains.address.City;
import uz.aim.hhuz.domains.specialization.Specialization;
import uz.aim.hhuz.enums.user.Experience;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Vacancy extends Auditable {

    private String title;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Specialization> specializations;
    @OneToMany(cascade = CascadeType.ALL)
    private List<City> cityList;

    @Enumerated(EnumType.STRING)
    private Experience experience;
    private String description;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Skill> skillList;

    @OneToOne
    private ContactInfo contactInfo;

    @Builder(builderMethodName = "childBuilder")
    public Vacancy(Long id, Boolean deleted, LocalDateTime createdAt, Long createdBy, LocalDateTime updatedAt, Long updatedBy, String title, List<Specialization> specializations, List<City> cityList, Experience experience, String description, List<Skill> skillList, ContactInfo contactInfo) {
        super(id, deleted, createdAt, createdBy, updatedAt, updatedBy);
        this.title = title;
        this.specializations = specializations;
        this.cityList = cityList;
        this.experience = experience;
        this.description = description;
        this.skillList = skillList;
        this.contactInfo = contactInfo;
    }
}
