package uz.aim.hhuz.service.mail;

import uz.aim.hhuz.domains.auth.OTP;
import org.springframework.stereotype.Service;


@Service
public interface MailService {

    void send(OTP otp);

    void send(String receiver, String subject, String text);
}
