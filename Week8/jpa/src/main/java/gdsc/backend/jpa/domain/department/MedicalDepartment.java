package gdsc.backend.jpa.domain.department;

import gdsc.backend.jpa.domain.hospital.Hospital;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MedicalDepartment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Hospital hospital;

    private String name;

    public MedicalDepartment(Hospital hospital, String name) {
        this.hospital = hospital;
        this.name = name;
    }
}
