package gdsc.backend.jpa.domain.hospital;

import gdsc.backend.jpa.domain.hospital.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalRepository extends JpaRepository<Hospital, Long> {
    public Hospital findByName(String name);
}
