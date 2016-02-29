/*
 * Created by Joshua on 2/23/16.
 */
public class Student
{
    //Declarations
    private String studentName = "";
    private String studentNumber="";

    //Full Constructor
    public Student (String name, String number)
    {
        name = studentName;
        number = studentNumber;
    }//end full constructor

    //Setters and Getters
    public String getStudentName()//Student Name getter
    {
        return studentName;
    }

    public void setStudentName(String name)//Student Name setter
    {
        studentName = name;
    }

    public String getStudentNumber()//Student Number getter
    {
        return studentNumber;
    }

    public void setLocationY(String number)//Student Number setter
    {
        studentNumber = number;
    }
}
