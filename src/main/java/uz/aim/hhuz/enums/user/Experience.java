package uz.aim.hhuz.enums.user;

public enum Experience {

    NO_EXPERIENCE,
    FROM_1_TO_3,
    FROM_3_TO_6,
    OVER_6;

    public static Experience findByExperience(String experience){
        for (Experience value : values()) {
            if (value.name().equalsIgnoreCase(experience)){
                return value;
            }
        }
        return NO_EXPERIENCE;
    }
}
