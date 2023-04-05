package uz.aim.hhuz.utils.jwt;

import uz.aim.hhuz.service.token.AccessTokenService;
import uz.aim.hhuz.service.token.RefreshTokenService;



// TODO: 8/20/22 we wanted it to be factory for token services
public class JwtUtils {
    public static final AccessTokenService accessTokenService = new AccessTokenService();
    public static final RefreshTokenService refreshTokenService = new RefreshTokenService();
}
