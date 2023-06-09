package uz.aim.hhuz.domains.vacancy;

import uz.aim.hhuz.domains.Auditable;
import uz.aim.hhuz.domains.language.Language;
import uz.aim.hhuz.enums.user.EmploymentType;
import uz.aim.hhuz.enums.user.WorkingMode;
import uz.aim.hhuz.enums.vacancy.FeedbackType;
import uz.aim.hhuz.enums.vacancy.RespondentType;
import uz.aim.hhuz.enums.vacancy.Schedule;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ContactInfo extends Auditable {
    private String descriptionOfCompany;
    private Long employerId;
    @Enumerated(EnumType.STRING)
    private EmploymentType employmentType;
    @Enumerated(EnumType.STRING)
    private WorkingMode workingMode;
    private Boolean isChatEnabled;
    @Enumerated(EnumType.STRING)
    private FeedbackType feedbackType;
    @Enumerated(EnumType.STRING)
    private Schedule schedule;
    @Enumerated(EnumType.STRING)
    private RespondentType respondentType;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Language> languages;

    @Builder(builderMethodName = "childBuilder")
    public ContactInfo(Long id, Boolean deleted, LocalDateTime createdAt, Long createdBy, LocalDateTime updatedAt, Long updatedBy, String descriptionOfCompany, Long employerId, EmploymentType employmentType, WorkingMode workingMode, Boolean isChatEnabled, FeedbackType feedbackType, Schedule schedule, RespondentType respondentType, List<Language> languages) {
        super(id, deleted, createdAt, createdBy, updatedAt, updatedBy);
        this.descriptionOfCompany = descriptionOfCompany;
        this.employerId = employerId;
        this.employmentType = employmentType;
        this.workingMode = workingMode;
        this.isChatEnabled = isChatEnabled;
        this.feedbackType = feedbackType;
        this.schedule = schedule;
        this.respondentType = respondentType;
        this.languages = languages;
    }
}
