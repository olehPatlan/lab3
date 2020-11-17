package ua.patlan.lab3;

public class MyMethods {

    public Object obj(Object o){
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return o;
    }

    public void m3(String s){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(s);
    }
}
