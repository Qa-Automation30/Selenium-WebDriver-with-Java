package Java_8_Assignments;

import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Test_153 {
    @Test
    void test() throws IOException {
        List<String> allNames = Files.readAllLines(Paths.get(System.getProperty("user.dir")+"\\src\\main\\java\\Java_8_Assignments\\Fname"));

        /**
         * ======================================================
         * 4th Problem -> (Jo-Ann) find the name containing - in it and replace it with a space; collect them into a list
         * ======================================================
         */
        List<String> test = allNames.stream().filter(name->name.contains("-")).collect(Collectors.toList());
        System.out.println(test);
        //==============================================================
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        List<String> test1 = allNames.stream().
                filter(name->name.contains("-")).
                map(name->name.replace("-","")).collect(Collectors.toList());
        System.out.println(test1);
    }
}
