package labs_examples.fundamentals.labs;


/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";
        // please declare an int variable below, and set it to the value of the length of "str"
        int length = str.length();
        System.out.println(length);

        String str2 = "hello";
        // please initialize a boolean variable and test whether str is equal to str2
        boolean isEquals = str.equals(str2);
        System.out.println(isEquals);

        // please concatenate str & str2 and set the result to a new String variable below
        String str3 = str + str2;
        System.out.println(str3);

        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc
        String replace = str.replace("hello", "world");
        System.out.println(replace);

        String sub = str.substring(0, 2);
        System.out.println(sub);

        boolean con = str.contains("hello");
        System.out.println(con);

        String concat = str.concat("world");
        System.out.println(concat);

        int index = str.indexOf("o");
        System.out.println(index);

    }


}