package tr.com.example.dao;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import tr.com.example.model.Student;

@Primary
@Service
public class EntityFrameworkStudentDaoImpl implements  IStudentDao {

    public void saveStudent(Student student) {
        System.out.println("Entity Framework kullanılarak student kaydedildi. " +
                "Burada repository siniflari cagrilarak save yapilabilir.");
    }
}
