package uz.aim.hhuz.domains.address;

import uz.aim.hhuz.domains.Auditable;
import lombok.*;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class City extends Auditable {

    private Long countryId;
    private String cityName;
    @Builder(builderMethodName = "childBuilder")
    public City(Long id, Boolean deleted, LocalDateTime createdAt, Long createdBy, LocalDateTime updatedAt, Long updatedBy, Long countryId, String cityName) {
        super(id, deleted, createdAt, createdBy, updatedAt, updatedBy);
        this.countryId = countryId;
        this.cityName = cityName;
    }
}
