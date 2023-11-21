package gdsc.backend.jpa.domain.patient;

import gdsc.backend.jpa.domain.patient.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
