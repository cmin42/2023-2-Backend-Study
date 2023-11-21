package gdsc.backend.jpa.domain.doctor;

import gdsc.backend.jpa.domain.department.MedicalDepartment;
import gdsc.backend.jpa.domain.department.MedicalDepartmentRepository;
import gdsc.backend.jpa.domain.doctor.CreateDoctorDto;
import gdsc.backend.jpa.domain.doctor.Doctor;
import gdsc.backend.jpa.domain.doctor.DoctorRepository;
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
