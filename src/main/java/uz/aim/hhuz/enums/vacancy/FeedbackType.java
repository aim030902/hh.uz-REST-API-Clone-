package uz.aim.hhuz.enums.vacancy;

public enum FeedbackType {
    VERIFIED_ONLY,EVERYONE;

    public static FeedbackType findByFeedbackType(String feedbackType){
        for (FeedbackType value : values()) {
            if (value.name().equalsIgnoreCase(feedbackType)){
                return value;
            }
        }
        return VERIFIED_ONLY;
    }
}
