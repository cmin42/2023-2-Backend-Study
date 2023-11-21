package gdsc.backend.jpa.domain.patient;

import gdsc.backend.jpa.domain.patient.CreatePatientDto;
import gdsc.backend.jpa.domain.patient.Patient;
import gdsc.backend.jpa.domain.patient.PatientService;
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
