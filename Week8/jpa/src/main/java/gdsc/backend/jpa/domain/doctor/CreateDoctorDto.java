package gdsc.backend.jpa.domain.doctor;

import lombok.Getter;

@Getter
public class CreateDoctorDto {
    private String name;
    private Long medicalDepartmentId;
}
