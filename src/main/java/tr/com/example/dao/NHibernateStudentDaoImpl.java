package tr.com.example.dao;


import org.springframework.stereotype.Service;
import tr.com.example.model.Student;

@Service
public class NHibernateStudentDaoImpl implements IStudentDao {

    public void saveStudent(Student student) {
        System.out.println("NHibernate ile Student kaydedildi." +
                "Burada repository siniflari cagrilarak save yapilabilir.");
    }
}
