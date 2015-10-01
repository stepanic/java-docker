/******************************************************************************
 *  Compilation:  javac HelloWorld.java
 *  Execution:    java HelloWorld
 *
 *  Prints "Hello, World". By tradition, this is everyone's first program.
 *
 *  % java HelloWorld
 *  Hello, World
 *
 *  These 17 lines of text are comments. They are not part of the program;
 *  they serve to remind us about its properties. The first two lines tell
 *  us what to type to compile and test the program. The next line describes
 *  the purpose of the program. The next few lines give a sample execution
 *  of the program and the resulting output. We will always include such
 *  lines in our programs and encourage you to do the same.
 *
 ******************************************************************************/
import java.util.Map;

public class HelloWorld {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello, World Mercury-Thorp!");
        // Thread.sleep(20000);
        // System.out.println("Thorp in middle HelloWorld!");
        // Thread.sleep(20000);
        // System.out.println("Thorp in middle second HelloWorld!");
        //
        Map<String, String> env = System.getenv();
        System.out.println(env.get("JAVA_HOME"));
        System.out.println(env.get("BLA"));
        System.out.println(env.get("PATH"));
        System.out.println(args[0]);
        System.out.println(args[1]);
        // for (String envName : env.keySet()) {
        //     System.out.format("%s=%s%n",
        //                       envName,
        //                       env.get(envName));
        // }
        Thread.sleep(20000);
        System.out.println("Thorp done HelloWorld!");


    }

}
