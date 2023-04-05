package uz.aim.hhuz.service.vacancy;

import uz.aim.hhuz.domains.vacancy.ContactInfo;
import org.springframework.stereotype.Service;

@Service
public interface ContactInfoService {

    ContactInfo getContactInfoById(Long id);
}
