package section_5;

import org.testng.annotations.Test;

public class Video_30 {
    // No need to watch again video 30, 31, 32, 33, 34,35,36,37
    @Test
    void test(){
        // ways to create a CssSelector->
        // <input type="text" placeholder="UserName",id="inputUserName" value="name" class="nameClass">
        /**
         * If you have a className then you can create cssSelector like this--->
         *
         *  tagName.className -> input.nameClass -> So this is cssSelector
         */
        /**
         * If you have an id then you can create cssSelector like this--->
         *
         *  tagName#id -> input#inputUserName -> So this is cssSelector
         */
        /**
         * If you don't have an id or class then you can create cssSelector like this--->
         *
         * <input type="text" placeholder="UserName" value="name">
         *
         *  tagName[attribute='value'] -> input[placeholder='userName'] -> So this is CssSelector
         */
    }

}
