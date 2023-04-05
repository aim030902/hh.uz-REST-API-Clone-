package uz.aim.hhuz.repository.vacancy;

import uz.aim.hhuz.domains.vacancy.Vacancy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VacancyRepository extends JpaRepository<Vacancy,Long> {
      Optional<Vacancy> findById(Long id);
}
