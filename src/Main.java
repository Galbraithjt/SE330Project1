/*
 * Created by Joshua on 2/22/16.
 */

import java.util.Scanner;
public class Main
{
    Scanner ui = new Scanner(System.in);

    // Set to public so getters & setters aren't needed

    public String nodeNumber;

    // Reference to next link made in the LinkList
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
    {
        Class theLinkedList = new Class();

        // Insert Link and add a reference to the node Link added just prior
        // to the field next

        theLinkedList.insertFirstLink("1");
        theLinkedList.insertFirstLink("2");
        theLinkedList.insertFirstLink("3");
        theLinkedList.insertFirstLink("4");

        theLinkedList.display();

        System.out.println("Value of first in LinkList " + theLinkedList.firstLink + "\n");

        // Removes the last Link entered

        System.out.println(theLinkedList.find("3").nodeNumber + " Was Found");

        theLinkedList.removeLink("2");

        System.out.println("\n2\n");

        theLinkedList.display();
    }
}
