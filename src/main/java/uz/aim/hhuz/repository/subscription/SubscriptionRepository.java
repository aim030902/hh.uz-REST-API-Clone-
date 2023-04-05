package uz.aim.hhuz.repository.subscription;

import uz.aim.hhuz.domains.subscription.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionRepository extends JpaRepository<Subscription,Long> {
}
