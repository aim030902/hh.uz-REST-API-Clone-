package uz.aim.hhuz.dto.auth;

import uz.aim.hhuz.domains.auth.AuthRole;
import uz.aim.hhuz.enums.auth.UserStatus;
import lombok.*;

import java.util.Set;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class UserDto {

    private Long id;

    private String email;

    private Set<AuthRole> roles;


    private UserStatus status;


    private Boolean isActive;
}
