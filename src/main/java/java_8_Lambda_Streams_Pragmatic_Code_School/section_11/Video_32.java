package java_8_Lambda_Streams_Pragmatic_Code_School.section_11;

import java_8_Lambda_Streams_Pragmatic_Code_School.consumerRealExample.Student;
import java_8_Lambda_Streams_Pragmatic_Code_School.consumerRealExample.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Video_32 {
    // User case 1 -> I want student name and their activities in a map
    public static void main(String[] args){
       List<Student> students = StudentDataBase.getAllStudents();
       Map<String,List<String>> studentMap = students.stream().collect(Collectors.toMap(Student::getName, Student::getActivities));
       System.out.println(studentMap);

        // User case 2 -> I want student name and their activities in a map whose grade level is equal to 4 and above
       Map<String, List<String>> studMap = StudentDataBase.
                getAllStudents().
                stream().
                filter(student -> student.getGradeLevel()>=4).
                collect(Collectors.toMap(Student::getName,Student::getActivities));
       System.out.println(studMap);
    }
}
