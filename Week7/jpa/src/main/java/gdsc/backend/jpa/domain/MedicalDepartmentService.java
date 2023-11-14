package gdsc.backend.jpa.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MedicalDepartmentService {
    private final MedicalDepartmentRepository medicalDepartmentRepository;
    private final HospitalRepository hospitalRepository;

    public void createHospital(CreateMedicalDepartmentDto createMedicalDepartmentDto) {
        Hospital hospital = hospitalRepository.findById(createMedicalDepartmentDto.getHospitalId())
                .orElseThrow(RuntimeException::new);
        medicalDepartmentRepository.save(new MedicalDepartment(hospital, createMedicalDepartmentDto.getName()));
    }

    public List<MedicalDepartment> getAllHospitals() {
        return medicalDepartmentRepository.findAll();
    }
}
