package JavaLambdaAndStreams;

import JavaLambdaAndStreams.course.Course;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test_14 {
    public static void main(String args[]) {
        List<Course> list = new ArrayList<>();
        list.add(new Course("Azure", "Devops", "3", "200"));
        list.add(new Course("Aws", "Devops", "2", "200"));
        list.add(new Course("Selenium", "Automation", "4", "200"));
        list.add(new Course("Cypress", "Automation", "4", "22"));
        list.add(new Course("Cucumber", "Automation", "3", "36"));
        list.add(new Course("Java", "Development", "5", "268"));
        list.add(new Course("C#", "Development", "3", "99"));

        // Find the top course as comparing by number of reviewScore
        Comparator<Course> comByCourseRating = Comparator.comparingInt(course -> Integer.parseInt(course.getReviewScore()));
        System.out.println(
                list.stream().max(comByCourseRating)
                );

        // Find the bad course as comparing by number of reviewScore
        Comparator<Course> comByCourseRating1 = Comparator.comparingInt(course -> Integer.parseInt(course.getReviewScore()));
        System.out.println(
                list.stream().min(comByCourseRating1)
        );
        /**
         * Optional[{name='Java', category='Development', reviewScore='5', noOfStudents='268'}]
         * Optional[{name='Aws', category='Devops', reviewScore='2', noOfStudents='200'}]
         */
    }
    }
