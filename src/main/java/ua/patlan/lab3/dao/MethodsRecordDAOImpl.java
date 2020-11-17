package ua.patlan.lab3.dao;

import org.hibernate.Session;
import org.springframework.stereotype.Component;
import ua.patlan.lab3.entity.MethodsRecord;

import javax.transaction.Transactional;
import java.util.List;

@Component
@Transactional
public class MethodsRecordDAOImpl extends DAOImpl implements MethodsRecordDAO{
    @Override
    public List<MethodsRecord> findAll() {
        Session session = super.getCurrentSession();
        return session.createNativeQuery("SELECT * FROM records").addEntity(MethodsRecord.class).list();
    }

    @Override
    public void save(MethodsRecord book) {
        Session session=super.getCurrentSession();
        session.save(book);
    }
}
