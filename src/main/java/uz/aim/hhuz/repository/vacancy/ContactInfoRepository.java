package uz.aim.hhuz.repository.vacancy;

import uz.aim.hhuz.domains.vacancy.ContactInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactInfoRepository extends JpaRepository<ContactInfo,Long> {

}
