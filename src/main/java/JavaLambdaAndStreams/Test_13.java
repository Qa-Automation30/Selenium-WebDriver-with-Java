package JavaLambdaAndStreams;

import JavaLambdaAndStreams.course.Course;
import org.checkerframework.checker.units.qual.C;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test_13 {
    public static void main(String args[]){
        List<Course> list = new ArrayList<>();
        list.add( new Course("Azure","Devops","3","200"));
        list.add( new Course("Aws","Devops","2","200"));
        list.add( new Course("Selenium","Automation","4","200"));
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

        // Sort the courses as per courseName --> This is custom Comparator. Which sorts the course name in
        // ascending order.
        Comparator<Course> compareByCourseName = Comparator.comparing(course -> course.getName());
        System.out.println(
                list.stream().
                        sorted(compareByCourseName).
                        collect(Collectors.toList())
        );
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        /**
         *  Problem is -> if courses have same numberOf students,
         *  so in that case what I want to do, it should get the course first which have high rating.
         */
        /**
         *  O/P-->
         * {name='Java', category='Development', reviewScore='4', noOfStudents='268'},
         * {name='Selenium', category='Automation', reviewScore='4', noOfStudents='200'},
         * {name='Azure', category='Devops', reviewScore='3', noOfStudents='200'},
         * {name='Aws', category='Devops', reviewScore='2', noOfStudents='200'},
         * {name='C#', category='Development', reviewScore='3', noOfStudents='99'},
         * {name='Cucumber', category='Automation', reviewScore='3', noOfStudents='36'},
         * {name='Cypress', category='Automation', reviewScore='4', noOfStudents='22'}
         */
        Comparator<Course> comByNoOfStudents = Comparator.comparingInt(course -> Integer.parseInt(course.getNoOfStudents()));
        Comparator<Course> comByCourseRating = Comparator.comparingInt(course -> Integer.parseInt(course.getReviewScore()));
        System.out.println(
                list.stream().sorted(
                        comByNoOfStudents.
                                thenComparing(comByCourseRating).
                                reversed()).
                        collect(Collectors.toList())
        );



    }
}
