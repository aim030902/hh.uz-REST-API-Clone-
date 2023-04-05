package uz.aim.hhuz.service.otp;

import uz.aim.hhuz.domains.auth.OTP;
import org.springframework.stereotype.Service;


@Service
public interface OTPService {
    OTP getOTPByCode(String code);

    String checkOTP(OTP otp);
    String checkOTP(String otp);

    OTP generateOTP(String email);
}
