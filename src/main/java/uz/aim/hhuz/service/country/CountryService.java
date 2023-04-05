package uz.aim.hhuz.service.country;

import uz.aim.hhuz.domains.address.Country;
import org.springframework.stereotype.Service;

@Service
public interface CountryService {
    Country getCountryById(Long id);
}
