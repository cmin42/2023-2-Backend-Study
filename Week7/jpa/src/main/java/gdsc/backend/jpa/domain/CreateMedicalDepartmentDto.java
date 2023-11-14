package gdsc.backend.jpa.domain;

import lombok.Getter;

@Getter
public class CreateMedicalDepartmentDto {
    private String name;
    private Long hospitalId;
}
