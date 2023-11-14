package gdsc.backend.jpa.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicalDepartments")
@RequiredArgsConstructor
public class MedicalDepartmentController {
    private final MedicalDepartmentService medicalDepartment;

    @GetMapping()
    public List<MedicalDepartment> getAllHospitals() {
        return medicalDepartment.getAllHospitals();
    }

    @PostMapping()
    public void createHospital(@RequestBody CreateMedicalDepartmentDto createMedicalDepartment) {
        medicalDepartment.createHospital(createMedicalDepartment);
    }
}
