package uz.aim.hhuz.enums.vacancy;

public enum Schedule {
    FULL_DAY,
    SHIFT_WORK,
    FLEXIBLE_SCHEDULE,
    DISTANT_WORK,
    SHIFT_METHOD;

    public static Schedule findBySchedule(String schedule){
        for (Schedule value : values()) {
            if (value.name().equalsIgnoreCase(schedule)){
                return value;
            }
        }
        return FULL_DAY;
    }
}
