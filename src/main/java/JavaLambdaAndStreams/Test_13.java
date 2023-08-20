package JavaLambdaAndStreams;

import JavaLambdaAndStreams.course.Course;

import java.util.ArrayList;
import java.util.List;

public class Test_13 {
    public static void main(String args[]){
        List<Course> list = new ArrayList<>();
        list.add( new Course("Azure","Devops","3","101"));
        list.add( new Course("Aws","Devops","2","114"));
        list.add( new Course("Selenium","Automation","4","125"));
        list.add( new Course("Cypress","Automation","4","22"));
        list.add( new Course("Cucumber","Automation","3","36"));
        list.add( new Course("Java","Development","4","268"));
        list.add( new Course("C#","Development","3","99"));

        // allMatch, nonMatch, anyMatch

        // Problem 1-> I want the courses whose score is greater than 3
        list.stream().filter(course->Integer.parseInt(course.getReviewScore())>3).
                map(course -> course.getName()+"--"+course.getReviewScore()).
                forEach(System.out::println);

        // This will return a boolean value based on matches. [allMatch]
        System.out.println(
                list.stream().allMatch(course -> Integer.parseInt(course.getReviewScore())>2)
        );
        // This will return a boolean value based on matches. [nonMatch]
        System.out.println(
                list.stream().noneMatch(course -> Integer.parseInt(course.getReviewScore())<1)
        );
        // This will return a boolean value based on matches. [anyMatch]
        System.out.println(
                list.stream().anyMatch(course -> Integer.parseInt(course.getReviewScore())>=4)
        );
    }
}
