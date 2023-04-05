package uz.aim.hhuz.enums.user;

public enum EmploymentType {
    FULL_TIME,
    PART_TIME,
    ONE_TIME,
    VOLUNTEERING,
    INTERNSHIP;


    public static EmploymentType findByEmploymentType(String employmentType){
        for (EmploymentType value : values()) {
            if (value.name().equalsIgnoreCase(employmentType)){
                return value;
            }
        }
        return FULL_TIME;
    }
}
