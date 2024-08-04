
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/subjects")

public class SubjectController {
    @Autowired
    private SubjectRepository subjectRepository;


    @GetMapping
    public List<Subject> getAllSubjects(){

        return subjectRepository.findAll();
    }


}
