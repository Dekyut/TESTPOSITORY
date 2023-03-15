import java.io.*;

public class viewCourses {

    public static void viewCourses() throws Exception {
        System.out.println("Courses:");
        char[] array = new char[100];

    try {
      FileReader input = new FileReader("courses.txt");
      input.read(array);
      System.out.println("These are the available courses: ");
      System.out.println(array);
      input.close();
    }

    catch(Exception e) {
      e.getStackTrace();
    }
  
}
}
