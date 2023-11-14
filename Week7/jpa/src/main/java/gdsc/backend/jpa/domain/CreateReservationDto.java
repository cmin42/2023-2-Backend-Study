package gdsc.backend.jpa.domain;

import lombok.Getter;

@Getter
public class CreateReservationDto {
    private String time;
    private Long patientId;
    private Long doctorId;
}
