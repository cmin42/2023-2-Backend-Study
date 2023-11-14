package gdsc.backend.jpa.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DoctorService {
    private final DoctorRepository doctorRepository;
    private final MedicalDepartmentRepository medicalDepartmentRepository;

    public void createDoctor(CreateDoctorDto createDoctorDto) {
        MedicalDepartment medicalDepartment = medicalDepartmentRepository.findById(createDoctorDto.getMedicalDepartmentId()).orElseThrow(RuntimeException::new);
        doctorRepository.save(new Doctor(createDoctorDto.getName(), medicalDepartment));
    }

    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }
}
