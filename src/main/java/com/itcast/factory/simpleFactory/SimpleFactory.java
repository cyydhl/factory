package main.java.com.itcast.factory.simpleFactory;

import main.java.com.itcast.factory.ICourse;
import main.java.com.itcast.factory.JavaCourse;
import main.java.com.itcast.factory.PathonCourse;

/**
 * 简单工厂模式
 */
public class SimpleFactory {
    public ICourse create(String name){
        if("java".equals(name)){
            return new JavaCourse();
        }else if ("pathon".equals(name)){
            return new PathonCourse();
        }else {
            return null;
        }
    }
}
