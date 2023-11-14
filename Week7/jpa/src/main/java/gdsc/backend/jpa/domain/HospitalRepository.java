package gdsc.backend.jpa.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalRepository extends JpaRepository<Hospital, Long> {
    public Hospital findByName(String name);
}
