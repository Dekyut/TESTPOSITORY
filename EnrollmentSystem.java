import java.io.*;
import java.util.Scanner;
import java.io.FileWriter; 

class EnrollmentSystem {
   int BSIT = 0;
   static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
   int choice;

    public static void main(String[] args) throws Exception {
        while (true) {
            System.out.println("Welcome to XYZ University Enrollment System!");
            System.out.println("1. Admin/Faculty Module");
            System.out.println("2. Student Module");
            System.out.println("3. Registration Module");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(reader.readLine());

            switch (choice) {
                case 1:
                    adminModule();
                    break;
                case 2:
                    studentModule();
                    break;
                case 3:
                    registrationModule();
                    break;
                case 4:
                    System.out.println("Exiting Enrollment System. Goodbye!");
                    System.exit(choice);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    return;
            }
        }
    }

    public static void adminModule() throws Exception {
        System.out.println("Admin/Faculty Module");
        System.out.println("1. View courses");
        System.out.println("2. Add Courses");
        System.out.print("Enter your choice: ");
        int choice = Integer.parseInt(reader.readLine());

        switch (choice) {
            case 1:
                viewCourses();
                break;
            case 2:
                addCourses();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    public static void viewCourses() throws Exception {
        System.out.println("Courses:");
        char[] array = new char[100];

    try {
      FileReader input = new FileReader("courses.txt");

      // Reads characters
      input.read(array);
      System.out.println("These are the available courses: ");
      System.out.println(array);

      // Closes the reader
      input.close();
    }

    catch(Exception e) {
      e.getStackTrace();
    }
  

        
    }

    public static void addCourses() throws Exception {
        Scanner scanner = new Scanner(System.in); // create Scanner object to read user input
        try {
            FileWriter WriteCourse = new FileWriter("courses.txt", true);
            System.out.println("Enter course you want to add: ");
            String addedCourse = scanner.nextLine();
            WriteCourse.write(addedCourse + "\n");
            WriteCourse.close();
            System.out.println("Successfully added the course.");
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
        }


     

   public static void studentModule() throws Exception {
        System.out.println("Student Module");
        System.out.println();

        System.out.println("Available Courses:");

        System.out.println("1. BSIT");
        System.out.println("2. BSCS");
        System.out.println("3. BSN");
        System.out.println("4. BSBA");
        System.out.println("5. BSE");
        System.out.println("6. BSTM");
      
        System.out.println("Enter course: ");
        Scanner courses = new Scanner(System.in);
        int course;
        course = courses.nextInt();
      switch(course){
        case 1:
            System.out.println("You are now enrolled!");
            System.out.println("Course name: Bachelor of Science in Information Technnology");
            System.out.println("Course ID: 6354" );
            System.out.println("Instructor name: Prof. Angelica Dela Cruz");
            System.exit(course);
            break;
        case 2:
            System.out.println("You are now enrolled!");
            System.out.println("Course name: Bachelor of Science in Computer Science");
            System.out.println("Course ID: 1162" );
            System.out.println("Instructor name: Prof. Elizer Ponio");
            System.exit(course);
            break;
        case 3:
            System.out.println("You are now enrolled!");
            System.out.println("Course name: Bachelor of Science in Nursing");
            System.out.println("Course ID: 8609" );
            System.out.println("Instructor name: Prof. Eliseo Ramirez");
            System.exit(course);
            break;
        case 4:
            System.out.println("You are now enrolled!");
            System.out.println("Course name: Bachelor of Science in Business Administration");
            System.out.println("Course ID: 4023" );
            System.out.println("Instructor name: Prof. Jhoanna De Leon");
            System.exit(course);
            break;
        case 5:
            System.out.println("You are now enrolled!");
            System.out.println("Course name: Bachelor of Science in Education");
            System.out.println("Course ID: 3502" );
            System.out.println("Instructor name: Prof. Adrian Somido");
            System.exit(course);
            break;
        case 6:
            System.out.println("You are now enrolled!");
            System.out.println("Course name: Bachelor of Science in Tourism Management");
            System.out.println("Course ID: 8362" );
            System.out.println("Instructor name: Prof. Elaine Masangya");
            System.exit(course);
            break;
            default:
            System.out.println("Invalid input.");
            return;
        }
        }

    public static void registrationModule() throws Exception {
        System.out.println("Registration Module");
        System.out.println("1. Register as Student");
        System.out.println("2. Register as Admin/Faculty");
        System.out.print("Enter your choice: ");
        int choice = Integer.parseInt(reader.readLine());

        switch (choice) {
            case 1:
                registerStudent();
                break;
            case 2:
                registerAdmin();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                return;
        }
    }

    public static void registerStudent() throws Exception {
        System.out.println("Register as Student");
        System.out.print("Enter your name: ");
        String name = reader.readLine();
        System.out.print("Enter your username: ");
        String username = reader.readLine();
        System.out.print("Enter your password: ");
        String password = reader.readLine();

        FileWriter writer = new FileWriter("students.txt", true);
        writer.write(name + "," + username + "," + password + "\n");
        writer.close();

        System.out.println("Registration successful.");
    }

    public static void registerAdmin() throws Exception {
        System.out.println("Register as Admin/Faculty");
        System.out.print("Enter your name: ");
        String name = reader.readLine();
        System.out.print("Enter your username: ");
        String username = reader.readLine();
        System.out.print("Enter your password: ");
        String password = reader.readLine();

        FileWriter writer = new FileWriter("admins.txt", true);
        writer.write(name + "," + username + "," + password + "\n");
        writer.close();

        System.out.println("Registration successful.");
    }
}
