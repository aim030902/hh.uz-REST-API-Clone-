package uz.aim.hhuz.controller;

import uz.aim.hhuz.dto.subscription.SubscriptionCreateDTO;
import uz.aim.hhuz.dto.subscription.SubscriptionDTO;
import uz.aim.hhuz.service.subscription.SubscriptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subscription")
@RequiredArgsConstructor
public class SubscriptionController {
    private final SubscriptionService subscriptionService;

    @PostMapping("/create")
    public ResponseEntity<SubscriptionDTO> create(@RequestBody SubscriptionCreateDTO dto) {
        SubscriptionDTO subscriptionDTO = subscriptionService.create(dto);
        return new ResponseEntity<>(subscriptionDTO, HttpStatus.CREATED);
    }
}
