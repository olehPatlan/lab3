package ua.patlan.lab3.aspect;
import org.springframework.stereotype.Component;
import ua.patlan.lab3.Main;
import ua.patlan.lab3.entity.MethodsRecord;
import ua.patlan.lab3.service.MethodsRecordService;

@Component
public aspect MyMethodsAspect {
    pointcut myMethodsAspect():call(public * ua.patlan.lab3.MyMethods.*(..));

    Object around():myMethodsAspect(){
        MethodsRecord methodsRecord = new MethodsRecord();
        System.out.println("hahah");
        long timeBefore = System.currentTimeMillis();
        Object res = proceed();
        long execTime = System.currentTimeMillis() - timeBefore;
        methodsRecord.setTime(execTime);
        methodsRecord.setMethodsInfo(thisJoinPoint.toString());
        MethodsRecordService methodsRecordService = (MethodsRecordService) Main.context.getBean("methodsRecordServiceImpl");
        methodsRecordService.save(methodsRecord);
        return res;
    }
}