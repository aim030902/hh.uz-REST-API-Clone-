package uz.aim.hhuz.domains.address;

import uz.aim.hhuz.domains.Auditable;
import lombok.*;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Country extends Auditable {

    private String name;
    @Builder(builderMethodName = "childBuilder")
    public Country(Long id, Boolean deleted, LocalDateTime createdAt, Long createdBy, LocalDateTime updatedAt, Long updatedBy, String name) {
        super(id, deleted, createdAt, createdBy, updatedAt, updatedBy);
        this.name = name;
    }
}
