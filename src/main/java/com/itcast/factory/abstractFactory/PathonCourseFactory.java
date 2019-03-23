package main.java.com.itcast.factory.abstractFactory;

public class PathonCourseFactory implements CourseFactory{
    public INode createNode() {
        return new PathonNode();
    }

    public IVideo createVideo() {
        return new PathonVideo();
    }
}
