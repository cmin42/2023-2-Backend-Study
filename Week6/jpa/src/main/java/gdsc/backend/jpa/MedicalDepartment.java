package gdsc.backend.jpa;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MedicalDepartment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Hospital hospital;

    @OneToMany
    private List<Doctor> doctor;

    private String name;
}
