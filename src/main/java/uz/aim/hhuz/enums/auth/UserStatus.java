package uz.aim.hhuz.enums.auth;

public enum UserStatus {
    ACTIVE,
    IN_ACTIVE;

    public static UserStatus findByUserStatus(String status){
        for (UserStatus userStatus : values()) {
            if (userStatus.name().equalsIgnoreCase(status)){
                return userStatus;
            }
        }
        return IN_ACTIVE;
    }
}
