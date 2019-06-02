package tr.com.example.factory;

import org.springframework.stereotype.Service;
import tr.com.example.dao.IStudentDao;

@Service
public class DatabaseFactory {

    public IStudentDao createDatabaseInstance(Class iStudenDaoClass) throws IllegalAccessException, InstantiationException {
        return (IStudentDao) iStudenDaoClass.newInstance();
    }
}
