package uz.aim.hhuz.service.vacancy;

import uz.aim.hhuz.domains.vacancy.ContactInfo;
import uz.aim.hhuz.exceptions.ContactInfoNotFoundException;
import uz.aim.hhuz.repository.vacancy.ContactInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ContactInfoServiceImpl implements ContactInfoService {
    private final ContactInfoRepository contactInfoRepository;

    @Override
    public ContactInfo getContactInfoById(Long id) {
        ContactInfo contactInfoNotFoundById = contactInfoRepository.findById(id).orElseThrow(() -> {
            throw new ContactInfoNotFoundException("ContactInfo Not Found By Id");
        });
        return contactInfoNotFoundById;
    }

}
