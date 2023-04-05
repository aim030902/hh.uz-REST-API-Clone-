package uz.aim.hhuz.service.subscription;

import uz.aim.hhuz.dto.subscription.SubscriptionCreateDTO;
import uz.aim.hhuz.dto.subscription.SubscriptionDTO;
import org.springframework.stereotype.Service;

/**
 * @author "Tojaliyev Asliddin"
 * @since 23/10/22 00:04 (Sunday)
 * hh.uz_analog/IntelliJ IDEA
 */

@Service
public interface SubscriptionService {
    SubscriptionDTO create(SubscriptionCreateDTO dto);
}
