package gdsc.backend.jpa.domain.reservation;

import gdsc.backend.jpa.domain.doctor.Doctor;
import gdsc.backend.jpa.domain.patient.Patient;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Patient patient;

    @ManyToOne
    private Doctor doctor;

    private String time;

    public Reservation(String time, Patient patient, Doctor doctor) {
        this.time = time;
        this.patient = patient;
        this.doctor = doctor;
    }

    public void updateTime(String time) {
        this.time = time;
    }
}
