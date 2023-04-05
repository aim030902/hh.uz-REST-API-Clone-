package uz.aim.hhuz.service.address;

import uz.aim.hhuz.domains.address.Address;
import org.springframework.stereotype.Service;

@Service
public interface AddressService {

    Address getAddressById(Long id);
}
