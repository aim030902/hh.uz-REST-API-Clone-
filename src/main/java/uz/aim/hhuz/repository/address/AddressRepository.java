package uz.aim.hhuz.repository.address;

import uz.aim.hhuz.domains.address.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Long> {
}
