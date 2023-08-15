package Section_14;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Video_115 {
    // No need to watch video 114

    @Test
    void test(){
        // Learning Java Streams, Lambada Expressions for building optimized code->
        /**
         * 1--> "Streams" are the new "concept" and introduced in JAVA 8.
         */
        // Just create a List of String to demonstrate the power of Streams that how we can optimize our code.
        List<String> nameList = new ArrayList<>();
        nameList.add("Abc");
        nameList.add("xyz");
        nameList.add("klm");
        nameList.add("aqq");
        nameList.add("Noop");
        nameList.add("aff");
        // Now we want print the name in console one by one, how to do it->
        // So we can use the for loop
        for(int i=0;i<nameList.size();i++){
           System.out.println(nameList.get(i));
        }
        // Now find the person whose name starts with "Noop"
        for(int i=0;i<nameList.size();i++){
            if(nameList.get(i).equals("Noop")){
                System.out.println(nameList.get(i));
            }
        }
        // Now find the total number of person whose name Starts with "a" or "A"
        int count=0;
        for(int i=0;i<nameList.size();i++){
            if(nameList.get(i).toUpperCase().startsWith("A")){
                count++;
            }
        }
        System.out.println("Total no of persons whose name starts with A-->"+count);

    }
}
