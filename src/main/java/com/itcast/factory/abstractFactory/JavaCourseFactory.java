package main.java.com.itcast.factory.abstractFactory;

import main.java.com.itcast.factory.Factory.ICourseFactory;
import main.java.com.itcast.factory.ICourse;

public class JavaCourseFactory implements CourseFactory{
    public INode createNode() {
        return new JavaNode();
    }

    public IVideo createVideo() {
        return new JavaVideo();
    }
}
