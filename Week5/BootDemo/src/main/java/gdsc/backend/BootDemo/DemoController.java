package gdsc.backend.BootDemo;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/demo")
public class DemoController {
    private final DemoService demoService;

    @GetMapping("/demoEntities")
    public ResponseEntity<List<DemoDto>> getDemoEntities() {
        return ResponseEntity.ok().body(demoService.getDemoEntities());
    }

    @GetMapping("/demoEntities/{id}")
    public ResponseEntity<DemoDto> getDemoEntityById(@PathVariable Long id) {
        if (demoService.getDemoEntityById(id) != null) {
            return ResponseEntity.ok().body(demoService.getDemoEntityById(id));
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/demoEntities")
    public void getDemoEntities(@RequestBody DemoDto demoDto) {
        demoService.addDemoEntity(demoDto);
    }
}
