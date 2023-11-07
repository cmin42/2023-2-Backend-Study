package gdsc.backend.jpa;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private MedicalDepartment medicalDepartment;

    @OneToMany
    private List<Reservation> reservations;

    private String name;
}
