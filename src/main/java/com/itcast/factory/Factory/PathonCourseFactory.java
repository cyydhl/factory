package main.java.com.itcast.factory.Factory;

import main.java.com.itcast.factory.ICourse;
import main.java.com.itcast.factory.JavaCourse;
import main.java.com.itcast.factory.PathonCourse;

public class PathonCourseFactory implements ICourseFactory{
    public ICourse create() {
        return new PathonCourse();
    }
}
