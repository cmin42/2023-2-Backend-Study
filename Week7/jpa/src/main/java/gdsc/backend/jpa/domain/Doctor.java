package gdsc.backend.jpa.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.print.Doc;

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

    public Doctor(String name) {
        this.name = name;
    }
}
