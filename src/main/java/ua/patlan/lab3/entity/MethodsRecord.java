package ua.patlan.lab3.entity;

import javax.persistence.*;

@Entity
@Table(name = "records")
public class MethodsRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,name = "time")
    private Long time;

    @Column(nullable = false,name = "methodsInfo")
    private String methodsInfo;

    public MethodsRecord() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public String getMethodsInfo() {
        return methodsInfo;
    }

    public void setMethodsInfo(String nameOfMethod) {
        this.methodsInfo = nameOfMethod;
    }
}
