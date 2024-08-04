import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")


public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping
    public Student createStudent(@RequestBody Student student){

        return studentRepository.save(student);
    }

    @GetMapping
    public List<Student> getAllStudents(){

        return studentRepository.findAll();
    }



}
