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
public class Category extends Auditable {
    private String name;
    @Builder(builderMethodName = "childBuilder")
    public Category(Long id, Boolean deleted, LocalDateTime createdAt, Long createdBy, LocalDateTime updatedAt, Long updatedBy, String name) {
        super(id, deleted, createdAt, createdBy, updatedAt, updatedBy);
        this.name = name;
    }
}
