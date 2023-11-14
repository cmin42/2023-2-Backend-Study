package gdsc.backend.jpa.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DoctorService {
    private  final DoctorRepository doctorRepository;

    public void createDoctor(CreateDoctorDto createDoctorDto) {
        doctorRepository.save(new Doctor(createDoctorDto.getName()));
    }

    public List<Doctor> getAllDoctor() {
        return doctorRepository.findAll();
    }
}
