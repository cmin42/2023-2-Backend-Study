package gdsc.backend.jpa.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservations")
@RequiredArgsConstructor
public class ReservationController {
    private final ReservationService reservationService;

    @GetMapping()
    public List<Reservation> getAllReservations() { return reservationService.getAllReservations(); }

    @PostMapping()
    public void createReservation(@RequestBody CreateReservationDto createReservationDto) {
        reservationService.createReservation(createReservationDto);
    }
}
