package uz.aim.hhuz.service.specialization;

import uz.aim.hhuz.domains.specialization.Category;
import org.springframework.stereotype.Service;

@Service
public interface CategoryService {
    Category getCategoryById(Long id);
}
