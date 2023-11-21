package gdsc.backend.jpa.domain.reservation;

import gdsc.backend.jpa.domain.reservation.CreateReservationDto;
import gdsc.backend.jpa.domain.reservation.Reservation;
import gdsc.backend.jpa.domain.reservation.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservations")
@RequiredArgsConstructor
public class ReservationController {
    private final ReservationService reservationService;

    @GetMapping()
    public List<Reservation> getAllReservations() {
        return reservationService.getAllReservations();
    }

    @GetMapping("/{id}")
    public Reservation getReservationById(@PathVariable("id") Long id) {
        return reservationService.getReservationById(id);
    }

    @PostMapping()
    public void createReservation(@RequestBody CreateReservationDto createReservationDto) {
        reservationService.createReservation(createReservationDto);
    }

    @PatchMapping("/{id}")
    public void updateReservation(@PathVariable("id") Long id, @RequestBody UpdateReservationDto updateReservationDto) {
        reservationService.updateReservation(id, updateReservationDto);
    }

    @DeleteMapping()
    public void deleteAllReservations() {
        reservationService.deleteAllReservations();
    }

    @DeleteMapping("/{id}")
    public void deleteReservationById(@PathVariable("id") Long id) {
        reservationService.deleteReservationById(id);
    }
}
