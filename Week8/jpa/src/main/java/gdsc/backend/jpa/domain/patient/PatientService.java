package gdsc.backend.jpa.domain.patient;

import gdsc.backend.jpa.domain.patient.CreatePatientDto;
import gdsc.backend.jpa.domain.patient.Patient;
import gdsc.backend.jpa.domain.patient.PatientRepository;
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
