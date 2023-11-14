package gdsc.backend.jpa.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientService {
    private  final PatientRepository patientRepository;

    public void CreatePatient(CreatePatientDto createPatientDto) {
        patientRepository.save(new Patient(createPatientDto.getName()));
    }

    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }
}
