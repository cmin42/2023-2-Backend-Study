package gdsc.backend.jpa.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HospitalService {
    private final HospitalRepository hospitalRepository;

    public void createHospital(CreateHospitalDto createHospitalDto) {
        hospitalRepository.save(new Hospital(createHospitalDto.getName()));
    }

    public List<Hospital> getAllHospitals() {
        return hospitalRepository.findAll();
    }

    public Hospital getHospitalByName(String name) {
        return hospitalRepository.findByName(name);
    }
}
