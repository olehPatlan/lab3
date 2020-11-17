package ua.patlan.lab3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.patlan.lab3.dao.MethodsRecordDAO;
import ua.patlan.lab3.entity.MethodsRecord;

import java.util.List;

@Component
public class MethodsRecordServiceImpl implements MethodsRecordService {
    @Autowired
    MethodsRecordDAO methodsRecordDAO;

    public void setMethodsRecordDAO(MethodsRecordDAO methodsRecordDAO) {
        this.methodsRecordDAO = methodsRecordDAO;
    }

    @Override
    public List<MethodsRecord> findAll() {
        methodsRecordDAO.openCurrentSession();
        List<MethodsRecord> books = methodsRecordDAO.findAll();
        methodsRecordDAO.closeCurrentSession();
        return books;
    }

    @Override
    public void save(MethodsRecord book) {
        methodsRecordDAO.openCurrentSession();
        methodsRecordDAO.save(book);
        methodsRecordDAO.closeCurrentSession();
    }
}
