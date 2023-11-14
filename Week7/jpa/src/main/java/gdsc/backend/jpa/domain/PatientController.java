package gdsc.backend.jpa.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
@RequiredArgsConstructor
public class PatientController {
    private final PatientService patientService;

    @GetMapping()
    public List<Patient> getAllPatients() {
        return patientService.getAllPatients();
    }

    @PostMapping()
    public void createPatient(@RequestBody CreatePatientDto createPatientDto) {
        patientService.CreatePatient(createPatientDto);
    }
}
