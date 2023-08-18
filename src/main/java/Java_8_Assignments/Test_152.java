package Java_8_Assignments;

import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

// Covered 152 and 153, 154,155
public class Test_152 {
    @Test
    void test() throws IOException {
        int count=0;
        List<String> allNames = Files.readAllLines(Paths.get(System.getProperty("user.dir")+"\\src\\main\\java\\Java_8_Assignments\\Fname"));

        // 1st Problem -> print the count of names start with "B"
        // 2nd Problem -> create a list of names  which start with "C" and contains 'S' in it
        // 3rd -> Print the total no of characters for all the names Start with "M"
        // 4th-> (Jo-Ann) find the name containing - in it and replace it with a space; collect them into a list
        // 5th-> find the name which has number of chars
        /**
         * ======================================================
         * 1st Problem -> print the count of names start with "B"
         * ======================================================
         */
        // Traditional way to do this
        for(int i=0;i<allNames.size();i++){
            if(allNames.get(i).startsWith("B")){
               count++;
            }
        }
        System.out.println(count);
        // Using Streams to do this-->
       long tCount = allNames.stream().filter(name->name.startsWith("B")).count();
       System.out.println(tCount);
        /**
         * ======================================================
         * 2nd Problem -> create a list of names  which start with "C" and contains 's' in it
         * ======================================================
         */
        List<String> list = allNames.
                stream().
                filter(names->names.startsWith("C") && names.contains("s")).
                collect(Collectors.toList());
        System.out.println(list);
        /**
         * ======================================================
         * 3rd Problem -> Print the total no of characters for all the names Start with "M"
         * ======================================================
         */
        allNames.stream().filter(names->names.startsWith("M")).
                map(name->name.trim().length()).
                forEach(name->System.out.println(name));

    }
}
