package gdsc.backend.jpa.domain.reservation;

import gdsc.backend.jpa.domain.doctor.Doctor;
import gdsc.backend.jpa.domain.doctor.DoctorRepository;
import gdsc.backend.jpa.domain.patient.Patient;
import gdsc.backend.jpa.domain.patient.PatientRepository;
import gdsc.backend.jpa.domain.reservation.CreateReservationDto;
import gdsc.backend.jpa.domain.reservation.Reservation;
import gdsc.backend.jpa.domain.reservation.ReservationRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationService {
    private final ReservationRepository reservationRepository;
    private final DoctorRepository doctorRepository;
    private final PatientRepository patientRepository;

    public void createReservation(CreateReservationDto createReservationDto) {
        Doctor doctor = doctorRepository.findById(createReservationDto.getDoctorId()).orElseThrow(RuntimeException::new);
        Patient patient = patientRepository.findById(createReservationDto.getPatientId()).orElseThrow(RuntimeException::new);
        reservationRepository.save(new Reservation(createReservationDto.getTime(), patient, doctor));
    }

    public List<Reservation> getAllReservations() { return reservationRepository.findAll(); }

    public Reservation getReservationById(Long id) {
        return reservationRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    @Transactional
    public void updateReservation(Long id, UpdateReservationDto updateReservationDto) {
        Reservation reservation = getReservationById(id);
        reservation.updateTime(updateReservationDto.getTime());
    }
    @Transactional
    public void deleteAllReservations() {
        reservationRepository.deleteAll();
    }

    @Transactional
    public void deleteReservationById(Long id) {
        reservationRepository.deleteById(id);
    }
}
