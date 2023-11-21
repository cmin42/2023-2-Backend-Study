package gdsc.backend.jpa.domain.doctor;

import gdsc.backend.jpa.domain.doctor.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
