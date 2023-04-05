package uz.aim.hhuz.domains.language;

import uz.aim.hhuz.domains.Auditable;
import lombok.*;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Language extends Auditable {
    private String name;
    private String code;

    @Builder(builderMethodName = "childBuilder")
    public Language(Long id, Boolean deleted, LocalDateTime createdAt, Long createdBy, LocalDateTime updatedAt, Long updatedBy, String name, String code) {
        super(id, deleted, createdAt, createdBy, updatedAt, updatedBy);
        this.name = name;
        this.code = code;
    }
}
