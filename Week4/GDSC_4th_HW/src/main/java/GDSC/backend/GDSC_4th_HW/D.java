package GDSC.backend.GDSC_4th_HW;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor  //롬북을 이용한 주입
public class D {
    private C c;

    public C getC() {
        return c;
    }
}
