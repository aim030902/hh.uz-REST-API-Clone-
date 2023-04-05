package uz.aim.hhuz.domains.auth;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class AuthUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String email;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private UserInfo userInfo;
}
