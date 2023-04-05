package uz.aim.hhuz.domains.address;

import uz.aim.hhuz.domains.Auditable;
import lombok.*;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Address extends Auditable {

    @Builder(builderMethodName = "childBuilder")
    public Address(Long id, boolean deleted, LocalDateTime createdAt, Long createdBy, LocalDateTime updatedAt, Long updatedBy) {
        super(id, deleted, createdAt, createdBy, updatedAt, updatedBy);
    }
}
