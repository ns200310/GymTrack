package ns2003.github.io.GymTrack.exercise;

import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public class ExerciseTempDB {
    private List<Exercise> exercises;

    List<Exercise> getExercises() {
        return exercises;
    }
    @PostMapping
    private void init(){
        exercises.add(new Exercise(1, "Chin Assist", 10, 3, 20));
        exercises.add(new Exercise(2, "Dip Assist", 10, 3, 15));
        exercises.add(new Exercise(3, "Bicep Curl", 10, 3, 20));

    }


}
