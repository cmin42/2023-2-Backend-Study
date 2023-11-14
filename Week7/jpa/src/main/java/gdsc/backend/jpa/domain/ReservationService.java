package gdsc.backend.jpa.domain;

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
}
