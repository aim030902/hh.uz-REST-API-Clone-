package uz.aim.hhuz.service.subscription;

import uz.aim.hhuz.domains.subscription.Subscription;
import uz.aim.hhuz.dto.subscription.SubscriptionCreateDTO;
import uz.aim.hhuz.dto.subscription.SubscriptionDTO;
import uz.aim.hhuz.mappers.subscription.SubscriptionMapper;
import uz.aim.hhuz.repository.subscription.SubscriptionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SubscriptionServiceImpl implements SubscriptionService{

    private final SubscriptionRepository subscriptionRepository;
    private final SubscriptionMapper subscriptionMapper;

    @Override
    public SubscriptionDTO create(SubscriptionCreateDTO dto) {
        Subscription subscription = subscriptionMapper.fromSubscriptionCreateDTO(dto);
        Subscription save = subscriptionRepository.save(subscription);
        SubscriptionDTO subscriptionDTO = subscriptionMapper.toSubscription(save);
        return subscriptionDTO;
    }
}
