package main.java.com.itcast.factory.Factory;

import main.java.com.itcast.factory.ICourse;

public class FactoryTest {
    public static void main(String[] args) {
        ICourseFactory factory = new JavaCourseFactory();
        ICourse course = factory.create();
        course.record();

        factory = new PathonCourseFactory();
        course = factory.create();
        course.record();
    }
}
