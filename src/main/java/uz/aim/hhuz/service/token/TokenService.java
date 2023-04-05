package uz.aim.hhuz.service.token;

import uz.aim.hhuz.configs.security.UserDetails;

public interface TokenService {

    String generateToken(UserDetails userDetails);

    Boolean isValid(String token);


}
