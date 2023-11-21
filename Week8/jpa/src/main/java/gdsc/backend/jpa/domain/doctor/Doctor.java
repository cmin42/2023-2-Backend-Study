package gdsc.backend.jpa.domain.doctor;

import gdsc.backend.jpa.domain.department.MedicalDepartment;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private MedicalDepartment medicalDepartment;

    private String name;

    public Doctor(String name, MedicalDepartment medicalDepartment) {
        this.name = name;
        this.medicalDepartment = medicalDepartment;
    }
}
