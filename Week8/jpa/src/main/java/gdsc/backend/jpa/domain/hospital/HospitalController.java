package gdsc.backend.jpa.domain.hospital;

import gdsc.backend.jpa.domain.hospital.CreateHospitalDto;
import gdsc.backend.jpa.domain.hospital.UpdateHospitalDto;
import gdsc.backend.jpa.domain.hospital.Hospital;
import gdsc.backend.jpa.domain.hospital.HospitalService;
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

    @GetMapping("/{id}")
    public Hospital getHospitalById(@PathVariable("id") Long id) {
        return hospitalService.getHospitalById(id);
    }

    @PostMapping()
    public void createHospital(@RequestBody CreateHospitalDto createHospitalDto) {
        hospitalService.createHospital(createHospitalDto);
    }

    @PatchMapping("/{id}")
    public void updateHospital(@PathVariable("id") Long id, @RequestBody UpdateHospitalDto updateHospitalDto) {
        hospitalService.updateHospital(id, updateHospitalDto);
    }

    @DeleteMapping("/{id}")
    public void deleteHospital(@PathVariable("id") Long id) {
        hospitalService.deleteHospital(id);
    }
}
