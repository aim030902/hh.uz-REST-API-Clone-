package uz.aim.hhuz.dto.contactInfo;

import uz.aim.hhuz.domains.language.Language;
import uz.aim.hhuz.enums.user.EmploymentType;
import uz.aim.hhuz.enums.user.WorkingMode;
import uz.aim.hhuz.enums.vacancy.FeedbackType;
import uz.aim.hhuz.enums.vacancy.RespondentType;
import uz.aim.hhuz.enums.vacancy.Schedule;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ContactInfoDTO {
    private String descriptionOfCompany;
    private Long employerId;
    private EmploymentType employmentType;
    private WorkingMode workingMode;
    private Boolean isChatEnabled;
    private FeedbackType feedbackType;
    private Schedule schedule;
    private RespondentType respondentType;
    private List<Language> languages;
}
