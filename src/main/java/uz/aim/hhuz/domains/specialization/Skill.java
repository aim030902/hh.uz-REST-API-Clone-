package uz.aim.hhuz.domains.specialization;

import uz.aim.hhuz.domains.Auditable;
import lombok.*;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Skill extends Auditable {

    private String name;
    @Builder(builderMethodName = "childBuilder")
    public Skill(Long id, boolean deleted, LocalDateTime createdAt, Long createdBy, LocalDateTime updatedAt, Long updatedBy) {
        super(id, deleted, createdAt, createdBy, updatedAt, updatedBy);
    }
}
