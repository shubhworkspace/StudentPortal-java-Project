import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")


public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/addStudent")
   private ResponseEntity<Student> addStudent(@RequestBody Student student){

        studentRepository.save(student);

        return  ResponseEntity.ok(student);

    }

    @GetMapping
    public List<Student> getAllStudents(){

        return studentRepository.findAll();
    }



}
