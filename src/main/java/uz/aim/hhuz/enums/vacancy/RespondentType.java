package uz.aim.hhuz.enums.vacancy;

public enum RespondentType {
    APPLICANT_WITH_DISABILITIES,
    APPLICANT_WITH_INCOMPLETE_RESUME,
    ONLY_WITH_COVER_LETTER;

    public static RespondentType findByRespondentType(String respondentType){
        for (RespondentType value : values()) {
            if (value.name().equalsIgnoreCase(respondentType)){
                return value;
            }
        }
        return null;
    }
}
