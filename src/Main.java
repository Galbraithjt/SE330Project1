/*
 * Created by Joshua on 2/23/16.
 */
public class Main
{ //start Main Class
    // Set to public so getters & setters aren't needed
    public String nodeNumber;

    // Reference to next link made in the SLList
    // Holds the reference to the Link that was created before it
    // Set to null until it is connected to other links

    public Main next;

    public Main (String nodeNumber)
    {
        this.nodeNumber = nodeNumber;
    }

    public void display()
    {
        System.out.println(nodeNumber);
    }

    public String toString()
    {
        return nodeNumber;
    }
    public static void main(String[] args)
    { //Start Main
        Course theLinkedList = new Course();

        // Insert Link and add a reference to the node Link added just prior
        // to the field next

        theLinkedList.insertFirstLink("1");
        theLinkedList.insertFirstLink("2");
        theLinkedList.insertFirstLink("3");
        theLinkedList.insertFirstLink("4");

        theLinkedList.display();

        System.out.println("Value of first node in Link List " + theLinkedList.firstLink + "\n");

        System.out.println(theLinkedList.find("3").nodeNumber + " Was Found");//finds node 3

        theLinkedList.removeLink("2");//removes node 2

        System.out.println("\n2\n");

        theLinkedList.display();
    }//end Main
}//End Class
