package uz.aim.hhuz.service.auth;

import uz.aim.hhuz.dto.jwt.JwtResponseDto;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public interface UserService extends UserDetailsService {

    JwtResponseDto checkOTP(String otp);

    void login(String email);
}
