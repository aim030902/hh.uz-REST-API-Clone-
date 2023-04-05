package uz.aim.hhuz.repository.address;

import uz.aim.hhuz.domains.address.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country,Long> {
}
