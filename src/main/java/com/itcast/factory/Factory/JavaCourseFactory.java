package main.java.com.itcast.factory.Factory;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import main.java.com.itcast.factory.ICourse;
import main.java.com.itcast.factory.JavaCourse;

public class JavaCourseFactory implements ICourseFactory{
    public ICourse create() {
        return new JavaCourse();
    }
}
