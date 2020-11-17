package ua.patlan.lab3.service;

import ua.patlan.lab3.entity.MethodsRecord;

import java.util.List;

public interface MethodsRecordService {
    List<MethodsRecord> findAll();
    void save(MethodsRecord book);
}
