package uz.aim.hhuz.domains;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@MappedSuperclass
public class Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Boolean deleted = Boolean.FALSE;
    @CreationTimestamp
    @CreatedDate
    @Column(nullable = false)
    private LocalDateTime createdAt = LocalDateTime.now();
    @CreatedBy
    @Column(nullable = false, updatable = false)
    private Long createdBy;
    //@LastModifiedDate
    private LocalDateTime updatedAt;
    @LastModifiedBy
    private Long updatedBy;
}
