package uz.aim.hhuz.domains.vacancy;

import uz.aim.hhuz.domains.Auditable;
import uz.aim.hhuz.enums.vacancy.PublicationType;
import lombok.*;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Publication extends Auditable {

    private PublicationType publicationType;
    private LocalDateTime publicationTime;

    @Builder(builderMethodName = "childBuilder")
    public Publication(Long id, Boolean deleted, LocalDateTime createdAt, Long createdBy, LocalDateTime updatedAt, Long updatedBy, PublicationType publicationType, LocalDateTime publicationTime) {
        super(id, deleted, createdAt, createdBy, updatedAt, updatedBy);
        this.publicationType = publicationType;
        this.publicationTime = publicationTime;
    }
}
