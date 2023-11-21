package gdsc.backend.jpa.domain.reservation;

import gdsc.backend.jpa.domain.reservation.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
