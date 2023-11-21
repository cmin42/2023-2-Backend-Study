package gdsc.backend.jpa.domain.department;

import gdsc.backend.jpa.domain.department.CreateMedicalDepartmentDto;
import gdsc.backend.jpa.domain.department.MedicalDepartment;
import gdsc.backend.jpa.domain.department.MedicalDepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicalDepartments")
@RequiredArgsConstructor
public class MedicalDepartmentController {
    private final MedicalDepartmentService medicalDepartment;

    @GetMapping()
    public List<MedicalDepartment> getAllMedicalDepartment() {
        return medicalDepartment.getAllMedicalDepartment();
    }

    @PostMapping()
    public void createHospital(@RequestBody CreateMedicalDepartmentDto createMedicalDepartment) {
        medicalDepartment.createMedicalDepartment(createMedicalDepartment);
    }
}
