package uz.aim.hhuz.service.country;

import uz.aim.hhuz.domains.address.Country;
import uz.aim.hhuz.exceptions.CountryNotFoundException;
import uz.aim.hhuz.repository.address.CountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CountryServiceImpl implements CountryService{
    private final CountryRepository countryRepository;

    @Override
    public Country getCountryById(Long id) {
        Country countyNotFoundById = countryRepository.findById(id).orElseThrow(() -> {
            throw new CountryNotFoundException("County Not Found By Id");
        });
        return countyNotFoundById;
    }
}
