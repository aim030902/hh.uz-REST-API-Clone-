package uz.aim.hhuz.service.address;

import uz.aim.hhuz.domains.address.Address;
import uz.aim.hhuz.exceptions.AddressNotFoundException;
import uz.aim.hhuz.repository.address.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AddressServiceImpl implements AddressService{
   private final AddressRepository addressRepository;

   @Override
   public Address getAddressById(Long id) {
      Address addressNotFoundById = addressRepository.findById(id).orElseThrow(() -> {
         throw new AddressNotFoundException("Address Not Found By Id");
      });
      return addressNotFoundById;
   }
}
