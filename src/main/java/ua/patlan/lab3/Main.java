package ua.patlan.lab3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ua.patlan.lab3.config.SpringConfig;

public class Main {
    public static AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

    public static void main(String[] args) {
        MyMethods methods = new MyMethods();
        Object result = methods.obj(2);
        System.out.println(result);
        methods.m3("123");
    }
}