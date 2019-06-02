package tr.com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tr.com.example.dao.IStudentDao;
import tr.com.example.enums.DatabaseTypeEnum;
import tr.com.example.factory.DatabaseFactory;
import tr.com.example.helper.DatabaseFactoryHelper;
import tr.com.example.model.Student;

@Service
public class StudentService {

    @Autowired
    IStudentDao iStudentDao;

    @Autowired
    DatabaseFactory databaseFactory;

    @Autowired
    DatabaseFactoryHelper databaseFactoryHelper;

    public StudentService(IStudentDao iStudentDao) {
        this.iStudentDao = iStudentDao;
    }

    public void save(Student student, DatabaseTypeEnum databaseTypeEnum) throws IllegalAccessException, InstantiationException {
        setIStudentDao(databaseTypeEnum);
        iStudentDao.saveStudent(student);
    }

    public void setIStudentDao(DatabaseTypeEnum databaseTypeEnum) throws InstantiationException, IllegalAccessException {
        Class iStudenDaoClass = databaseFactoryHelper.determineDbClassByDbType(databaseTypeEnum);
        iStudentDao = databaseFactory.createDatabaseInstance(iStudenDaoClass);
    }
}
