package JavaLambdaAndStreams;

import JavaLambdaAndStreams.course.Course;

import java.util.ArrayList;
import java.util.List;

public class Test_13 {
    public static void main(String args[]){
        List<Course> list = new ArrayList<>();
        list.add( new Course("Azure","Devops","3","101"));
        list.add( new Course("Aws","Devops","2.5","114"));
        list.add( new Course("Selenium","Automation","3.9","125"));
        list.add( new Course("Cypress","Automation","3.5","22"));
        list.add( new Course("Cucumber","Automation","3","36"));
        list.add( new Course("Java","Development","4.1","268"));
        list.add( new Course("C#","Development","3.9","99"));
    }
}
