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
public class Specialization extends Auditable {
    private String name;
    private Long categoryId;

    @Builder(builderMethodName = "childBuilder")
    public Specialization(Long id, Boolean deleted, LocalDateTime createdAt, Long createdBy, LocalDateTime updatedAt, Long updatedBy, String name, Long categoryId) {
        super(id, deleted, createdAt, createdBy, updatedAt, updatedBy);
        this.name = name;
        this.categoryId = categoryId;
    }
}
