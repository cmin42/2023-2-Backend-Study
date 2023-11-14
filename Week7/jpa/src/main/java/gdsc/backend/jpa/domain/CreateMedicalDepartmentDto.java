package gdsc.backend.jpa.domain;

import lombok.Getter;

@Getter
public class CreateMedicalDepartmentDto {
    private String name;
    private Hospital hospital;
    private Long hospitalId = hospital.getId();
}
