package gdsc.backend.jpa;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    private List<MedicalDepartment> medicalDepartment;

    private String name;
}
