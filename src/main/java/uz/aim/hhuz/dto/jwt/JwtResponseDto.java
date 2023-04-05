package uz.aim.hhuz.dto.jwt;

public record JwtResponseDto(
        String accessToken,
        String refreshToken,
        String tokenType) {
}
