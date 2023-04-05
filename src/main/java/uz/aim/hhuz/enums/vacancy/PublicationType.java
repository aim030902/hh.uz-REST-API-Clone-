package uz.aim.hhuz.enums.vacancy;

public enum PublicationType {
    PREMIUM,STANDARD_PLUS_AUTO_UPDATE,STANDARD_NO_UPDATE,ANONYMOUS_HIDDEN_SELECTION;

    public static PublicationType findByPublicationType(String publicationType){
        for (PublicationType value : values()) {
            if (value.name().equalsIgnoreCase(publicationType)){
                return value;
            }
        }
        return STANDARD_PLUS_AUTO_UPDATE;
    }
}
