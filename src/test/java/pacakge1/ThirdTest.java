package test.java.pacakge1;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ThirdTest {
    @Test
    public void func1() {

       String s = " Welcome CoderJava to the Java world";

       Pattern p = Pattern.compile("(?=)Java");
       Matcher m = p.matcher(s);

       while (m.find()) {
           System.out.println("Found at: " + m.start() + " - " + m.end());
           System.out.println("Found: " + m.group());
            }


}
