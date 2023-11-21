package gdsc.backend.jpa.domain.department;

import gdsc.backend.jpa.domain.department.MedicalDepartment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalDepartmentRepository extends JpaRepository<MedicalDepartment, Long> {
}
