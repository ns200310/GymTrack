package ns2003.github.io.GymTrack.exercise;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExerciseController
{
    @GetMapping("/api/exercises")
    String home(){
        return "Hello World";
    }

}
