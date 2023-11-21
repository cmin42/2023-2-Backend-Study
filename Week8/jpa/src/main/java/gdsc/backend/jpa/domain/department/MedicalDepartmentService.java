package gdsc.backend.jpa.domain.department;

import gdsc.backend.jpa.domain.department.CreateMedicalDepartmentDto;
import gdsc.backend.jpa.domain.department.MedicalDepartment;
import gdsc.backend.jpa.domain.department.MedicalDepartmentRepository;
import gdsc.backend.jpa.domain.hospital.Hospital;
import gdsc.backend.jpa.domain.hospital.HospitalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MedicalDepartmentService {
    private final MedicalDepartmentRepository medicalDepartmentRepository;
    private final HospitalRepository hospitalRepository;

    public void createMedicalDepartment(CreateMedicalDepartmentDto createMedicalDepartmentDto) {
        Hospital hospital = hospitalRepository.findById(createMedicalDepartmentDto.getHospitalId())
                .orElseThrow(RuntimeException::new);
        medicalDepartmentRepository.save(new MedicalDepartment(hospital, createMedicalDepartmentDto.getName()));
    }

    public List<MedicalDepartment> getAllMedicalDepartment() {
        return medicalDepartmentRepository.findAll();
    }
}
