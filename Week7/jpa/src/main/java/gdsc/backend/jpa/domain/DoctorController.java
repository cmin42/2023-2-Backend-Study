package gdsc.backend.jpa.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctors")
@RequiredArgsConstructor
public class DoctorController {
    private final  DoctorService doctorService;

    @GetMapping()
    public List<Doctor> getAllDoctors() {
        return doctorService.getAllDoctor();
    }

    @PostMapping()
    public void createDoctor(@RequestBody CreateDoctorDto createDoctorDto) {
        doctorService.createDoctor(createDoctorDto);
    }
}
