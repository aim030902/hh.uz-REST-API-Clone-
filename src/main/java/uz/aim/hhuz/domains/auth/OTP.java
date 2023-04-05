package uz.aim.hhuz.domains.auth;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Getter
@Setter
public class OTP {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    @Builder.Default
    private Boolean isUsed = false;
    private LocalDateTime validTill;

    @Column(nullable = false)
    private String email;
}
