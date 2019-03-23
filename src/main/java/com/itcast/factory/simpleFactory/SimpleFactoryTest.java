package main.java.com.itcast.factory.simpleFactory;

import main.java.com.itcast.factory.ICourse;

public class SimpleFactoryTest
{
    public static void main(String[] args) {
        ICourse course = new SimpleFactory().create("java");
        course.record();
    }
}
