package gdsc.backend.jpa.domain.doctor;

import gdsc.backend.jpa.domain.doctor.CreateDoctorDto;
import gdsc.backend.jpa.domain.doctor.Doctor;
import gdsc.backend.jpa.domain.doctor.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctors")
@RequiredArgsConstructor
public class DoctorController {
    private final DoctorService doctorService;

    @GetMapping()
    public List<Doctor> getAllDoctors() {
        return doctorService.getAllDoctors();
    }

    @PostMapping()
    public void createDoctor(@RequestBody CreateDoctorDto createDoctorDto) {
        doctorService.createDoctor(createDoctorDto);
    }
}
