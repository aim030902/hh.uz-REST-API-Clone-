package uz.aim.hhuz.domains.subscription;

import uz.aim.hhuz.domains.Auditable;
import lombok.*;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Subscription extends Auditable {

    private String title;


    @Builder(builderMethodName = "childBuilder")
    public Subscription(Long id, Boolean deleted, LocalDateTime createdAt, Long createdBy, LocalDateTime updatedAt, Long updatedBy, String title) {
        super(id, deleted, createdAt, createdBy, updatedAt, updatedBy);
        this.title = title;
    }
}
