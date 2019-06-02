package tr.com.example.helper;

import org.springframework.stereotype.Service;
import tr.com.example.dao.EntityFrameworkStudentDaoImpl;
import tr.com.example.dao.NHibernateStudentDaoImpl;
import tr.com.example.enums.DatabaseTypeEnum;

@Service
public class DatabaseFactoryHelper {

    public Class determineDbClassByDbType(DatabaseTypeEnum databaseTypeEnum) {
        switch (databaseTypeEnum){
            case SqlServer:
                return EntityFrameworkStudentDaoImpl.class;
            case NHibernate:
                return NHibernateStudentDaoImpl.class;
        }
        return null;
    }
}
