package uz.aim.hhuz.service.country;

import uz.aim.hhuz.domains.address.City;
import uz.aim.hhuz.exceptions.CityNotFoundException;
import uz.aim.hhuz.repository.address.CityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CityServiceImpl implements CityService{
      private final CityRepository cityRepository;

    @Override
    public City getCityById(Long id) {
        City cityNotFoundById = cityRepository.findById(id).orElseThrow(() -> {
            throw new CityNotFoundException("City Not Found By Id");
        });
        return cityNotFoundById;
    }
}
