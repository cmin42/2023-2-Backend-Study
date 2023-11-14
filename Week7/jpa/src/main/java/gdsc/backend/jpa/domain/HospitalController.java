package gdsc.backend.jpa.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hospitals")
@RequiredArgsConstructor
public class HospitalController {
    private final HospitalService hospitalService;

    @GetMapping()
    public List<Hospital> getAllHospitals() {
        return hospitalService.getAllHospitals();
    }

    @GetMapping("/{name}")
    public Hospital getHospitalByName(@PathVariable("name") String name) {
        return hospitalService.getHospitalByName(name);
    }

    @PostMapping()
    public void createHospital(@RequestBody CreateHospitalDto createHospitalDto) {
        hospitalService.createHospital(createHospitalDto);
    }
}
