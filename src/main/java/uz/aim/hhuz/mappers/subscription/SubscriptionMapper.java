package uz.aim.hhuz.mappers.subscription;

import uz.aim.hhuz.domains.subscription.Subscription;
import uz.aim.hhuz.dto.subscription.SubscriptionCreateDTO;
import uz.aim.hhuz.dto.subscription.SubscriptionDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SubscriptionMapper {
    SubscriptionDTO toSubscription(Subscription subscription);

    Subscription fromSubscriptionCreateDTO(SubscriptionCreateDTO dto);
}
