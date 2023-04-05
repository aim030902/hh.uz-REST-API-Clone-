package uz.aim.hhuz.controller;

import uz.aim.hhuz.dto.vacancy.VacancyCreateDTO;
import uz.aim.hhuz.dto.vacancy.VacancyDTO;
import uz.aim.hhuz.dto.vacancy.VacancyUpdateDTO;
import uz.aim.hhuz.service.vacancy.VacancyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vacancy")
public class VacancyController {

    private final VacancyService vacancyService;

    public VacancyController(VacancyService vacancyService) {
        this.vacancyService = vacancyService;
    }

    @PostMapping("/create")
    public ResponseEntity<VacancyDTO> createVacancy(@RequestBody VacancyCreateDTO dto) {
        VacancyDTO vacancyDTO = vacancyService.create(dto);
        return new ResponseEntity<>(vacancyDTO,HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<VacancyDTO> updateVacancy(@RequestBody VacancyUpdateDTO dto){
        VacancyDTO vacancyDTO=vacancyService.update(dto);
        return new ResponseEntity<>(vacancyDTO,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteVacancy(@PathVariable Long id){
       vacancyService.delete(id);
       return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/{id}")
    public ResponseEntity<VacancyDTO> getOne(@PathVariable Long id){
        VacancyDTO vacancyDTO=vacancyService.getOne(id);
        return new ResponseEntity<>(vacancyDTO,HttpStatus.OK);
    }
    @GetMapping("/findAll")
    public ResponseEntity<List<VacancyDTO>> findAll(){
        List<VacancyDTO> vacancyDTOS = vacancyService.findAll();
        return new ResponseEntity<>(vacancyDTOS,HttpStatus.OK);
    }
}
