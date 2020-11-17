package ua.patlan.lab3.dao;

import ua.patlan.lab3.entity.MethodsRecord;

import java.util.List;

public interface MethodsRecordDAO extends DAO{
    List<MethodsRecord> findAll();
    void save(MethodsRecord book);
}
