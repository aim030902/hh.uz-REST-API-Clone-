package uz.aim.hhuz.repository.auth;

import uz.aim.hhuz.domains.auth.OTP;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface OTPRepository extends JpaRepository<OTP, Long> {

    Optional<OTP> findOTPByCode(String code);
}
