package Section_14_IsVeryImp;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Video_115 {
    // No need to watch video 114
    // Video 115 is very IMp to watch again and again

    @Test(enabled = false)
    // This test is without using of Stream
    void withOutUsingStreams(){
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
        // Now find the person whose name is "Noop"
        for(int i=0;i<nameList.size();i++){
            if(nameList.get(i).equals("Noop")){
                System.out.println(nameList.get(i));
            }
        }
        // 3rd-> Now find the total number of person whose name Starts with "a" or "A"
        int count=0;
        for(int i=0;i<nameList.size();i++){
            if(nameList.get(i).toUpperCase().startsWith("A")){
                count++;
            }
        }
        System.out.println("Total no of persons whose name starts with A-->"+count);
    }

    @Test(enabled = false)
    void usingStreams(){
        // Using Streams here to optimize our code
        List<String> nameList = new ArrayList<>();
        nameList.add("Abc");
        nameList.add("xyz");
        nameList.add("klm");
        nameList.add("aqq");
        nameList.add("Noop");
        nameList.add("aff");
        // This is the concept of Streams and you can reduce your code like below .[Compare with above testCases 3rd step]
       long count = nameList.stream().filter(s->s.toUpperCase().startsWith("A")).count();
       System.out.println(count);
       // Now find the person whose name is "Noop" using Streams
        nameList.stream().filter(name->name.equals("Noop")).forEach(name->System.out.println(name));
    }
    @Test
    void usingStreams_1(){
        // Using Streams here to optimize our code
        List<String> nameList = new ArrayList<>();
        nameList.add("Abc");
        nameList.add("xyzzz");
        nameList.add("klmmm");
        nameList.add("aqq");
        nameList.add("Noop");
        nameList.add("aff");

        // Now to select only those names having more than length is 4 and also converts into upperCase
        nameList.stream().filter(s->s.length()>4).forEach(s->System.out.println(s.toUpperCase()));
    }
}
