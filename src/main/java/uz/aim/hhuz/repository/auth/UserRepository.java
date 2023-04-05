package uz.aim.hhuz.repository.auth;

import uz.aim.hhuz.domains.auth.AuthUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<AuthUser, Long> {

    Optional<AuthUser> findByEmail(String email);
}
