package uz.aim.hhuz.service.specialization;

import uz.aim.hhuz.domains.specialization.Category;
import uz.aim.hhuz.exceptions.CategoryNotFoundException;
import uz.aim.hhuz.repository.specialization.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService{
    private final CategoryRepository categoryRepository;
    @Override
    public Category getCategoryById(Long id) {
        Category categoryNotFoundById = categoryRepository.findById(id).orElseThrow(() -> {
            throw new CategoryNotFoundException("Category Not Found By Id");
        });
        return categoryNotFoundById;
    }
}
