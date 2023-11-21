package gdsc.backend.jpa.domain.hospital;

import gdsc.backend.jpa.domain.hospital.CreateHospitalDto;
import gdsc.backend.jpa.domain.hospital.Hospital;
import gdsc.backend.jpa.domain.hospital.HospitalRepository;
import jakarta.transaction.Transactional;
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


    public Hospital getHospitalById(Long id) {
        return hospitalRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    @Transactional
    public void updateHospital(Long id, UpdateHospitalDto updateHospitalDto) {
        Hospital hospital = getHospitalById(id);
        hospital.updateName(updateHospitalDto.getName());
    }

    @Transactional
    public void deleteHospital(Long id) {
        hospitalRepository.deleteById(id);
    }
}
