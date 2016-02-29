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
        System.out.println(className);
    }

    public String toString()
    {
        return className;
    }

    public static void main(String[] args)
    { //Start Main
        Scanner ui = new Scanner(System.in);

        Course offeredCourse = new Course();

        // Insert Link and add a reference to the node Link added just prior
        // to the field next

        offeredCourse.insertFirstLink("SE 330", 0);
        offeredCourse.insertFirstLink("SE 240", 0);
        offeredCourse.insertFirstLink("SE 250", 0);
        offeredCourse.insertFirstLink("HUM 401", 0);
        offeredCourse.insertFirstLink("ENG 101", 0);
        offeredCourse.insertFirstLink("ENG 102", 0);
        offeredCourse.insertFirstLink("COMM 101", 0);
        offeredCourse.insertFirstLink("HUM 101", 0);
        offeredCourse.insertFirstLink("SCI 201", 0);
        offeredCourse.insertFirstLink("SOC 201", 0);

        offeredCourse.display();
    }//end Main
}//End Class
