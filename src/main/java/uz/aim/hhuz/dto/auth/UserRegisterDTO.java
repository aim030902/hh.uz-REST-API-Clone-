package uz.aim.hhuz.dto.auth;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


public record UserRegisterDTO(@Pattern(regexp = "^[A-Z\\d._%+-]+@[A-Z\\d.-]+\\\\.[A-Z]{2,6}$") String email,
                              @Size(min = 8) String password) {
}
