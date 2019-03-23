package main.java.com.itcast.factory.abstractFactory;


public class AbstractFactoryTest {
    public static void main(String[] args) {
        JavaCourseFactory factory = new JavaCourseFactory();
        factory.createNode().edit();
        factory.createVideo().record();
    }
}
