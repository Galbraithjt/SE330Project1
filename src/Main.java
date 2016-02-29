/*
 * Created by Joshua on 2/23/16.
 */
import java.util.Scanner;

public class Main
{ //start Main Class
    // Set to public so getters & setters aren't needed
    public String className;
    public int enrolledStudents;

    // Reference to next link made in the SLList
    // Holds the reference to the Link that was created before it
    // Set to null until it is connected to other links

    public Main next;

    public Main (String className, int enrolledStudents)
    {
        this.className = className;
        this.enrolledStudents = enrolledStudents;
    }

    public void display()
    {
        System.out.println(className + " Total Students Enrolled: " + enrolledStudents);
    }

    public String toString()
    {
        return className;
    }

    public static void main(String[] args) { //Start Main
        Scanner ui = new Scanner(System.in);
        int classChoice =0;
        String classNameChoice;

        Course offeredCourse = new Course();

        // Insert Link and add a reference to the node Link added just prior
        // to the field next

        offeredCourse.insertFirstLink("SE330", 0);
        offeredCourse.insertFirstLink("SE240", 0);
        offeredCourse.insertFirstLink("SE250", 0);
        offeredCourse.insertFirstLink("HUM401", 0);
        offeredCourse.insertFirstLink("ENG101", 0);
        offeredCourse.insertFirstLink("ENG102", 0);
        offeredCourse.insertFirstLink("COMM101", 0);
        offeredCourse.insertFirstLink("HUM101", 0);
        offeredCourse.insertFirstLink("SCI201", 0);
        offeredCourse.insertFirstLink("SOC201", 0);

        offeredCourse.display();
        System.out.println("Enter the number of classes you would like to register for'Must be less than 4 if" +
                "more then 4 is entered number will automatically be set to 4'");
        classChoice = ui.nextInt();

        if (classChoice > 4)
        {
            classChoice = 4;
        }

        for (int flc =0; classChoice > flc; flc++)
        {
            System.out.println("Enter the course name you would like to register for:");
            classNameChoice = ui.nextLine();

            offeredCourse.set(classNameChoice);
        }

        offeredCourse.display();
    }//end Main
}//End Class
