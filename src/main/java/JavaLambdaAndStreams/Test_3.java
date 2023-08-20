package JavaLambdaAndStreams;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Test_3 {
    @Test
    void test() {
        List<String> list = new ArrayList<>();
        list.add("spring");
        list.add("spring boot");
        list.add("API");
        list.add("Microservices");
        list.add("AWS");
        list.add("PCF");
        list.add("Azure");
        list.add("DOCKER");
        list.add("PostMan");

        // print only those courses which having the word like spring
        list.stream().filter(w->w.contains("spring")).forEach(w->System.out.println(w));
        // Print courses whose name has at least 4 letters.
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        list.stream().filter(w->w.length()>=4).forEach(w->System.out.println(w));
    }


}
