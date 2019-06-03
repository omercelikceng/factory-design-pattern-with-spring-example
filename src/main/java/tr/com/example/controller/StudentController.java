package tr.com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tr.com.example.enums.DatabaseTypeEnum;
import tr.com.example.model.Student;
import tr.com.example.service.StudentService;

@RestController
@RequestMapping("/rest/controller")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/saveStudent")
    public void saveStudent(@RequestBody Student student, @RequestParam DatabaseTypeEnum databaseTypeEnum)
            throws InstantiationException, IllegalAccessException {
        studentService.save(student, databaseTypeEnum);
    }
}
