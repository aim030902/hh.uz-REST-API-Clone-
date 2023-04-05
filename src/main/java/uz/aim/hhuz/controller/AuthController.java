package uz.aim.hhuz.controller;

import uz.aim.hhuz.dto.jwt.JwtResponseDto;
import uz.aim.hhuz.service.auth.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserService userService;

    @PostMapping(value = "/login")
    @ResponseStatus(HttpStatus.OK)
    public String login(@RequestParam String email) {
        userService.login(email);
        return "email sent successfully";
    }

    @PostMapping(value = "/checkOTP", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseEntity<JwtResponseDto> checkOTP(@RequestParam String otp) {
        return new ResponseEntity<>(userService.checkOTP(otp), HttpStatus.OK);
    }



}
