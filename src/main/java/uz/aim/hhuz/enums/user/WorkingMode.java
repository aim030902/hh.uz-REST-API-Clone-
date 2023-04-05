package uz.aim.hhuz.enums.user;

public enum WorkingMode {
    SAT_SUN,
    PER_DAY_4_6,
    AFTER_16;

    public static WorkingMode findByWorkingMode(String workingMode){
        for (WorkingMode mode : values()) {
            if (mode.name().equalsIgnoreCase(workingMode)){
                return mode;
            }
        }
        return SAT_SUN;
    }
}
