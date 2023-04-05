package uz.aim.hhuz.service.country;

import uz.aim.hhuz.domains.address.City;
import org.springframework.stereotype.Service;

@Service
public interface CityService {
    City getCityById(Long id);
}
