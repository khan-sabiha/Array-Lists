

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Sabiha Khan- B00842047
 * CSCI 2110- Assignment 2
 * Creates a storage bin and a toolbelt. Adds items to the bin, then to the tool belt if requested.
 */
public class StorageBinTester {

    public static void main(String[] args) {

        //Creating two lists for storing and removing.
        StorageBin<Tool, Integer> bin = new StorageBin<Tool, Integer>();
        ArrayList<Tool> workbelt = new ArrayList<Tool>();

        Scanner kb = new Scanner(System.in);

        System.out.println("Enter tools to be stored in the format ItemName ID: ");
        System.out.println("Enter quit to end the list of tools: ");
        //Input for inserting the tools that needs to be added to storage bin.
        String input = kb.next();

        //Loop for adding tool objects to the Storage Bin.
        while(!input.equals("quit"))
        {
            //Conditions for finding which tool has been read and setting its corresponding function.

            if (input.equals("Hammer")){
                Hammer obj;
                bin.addItem((obj = new Hammer(input)), Integer.parseInt(kb.next()));
                obj.setFunction("I hammer stuff");
            }
            else if (input.equals("Saw")){
                Saw obj;
                bin.addItem((obj = new Saw(input)), Integer.parseInt(kb.next()));
                obj.setFunction("I saw stuff");
            }
            else if (input.equals("Level")) {
                Level obj;
                bin.addItem((obj = new Level(input)), Integer.parseInt(kb.next()));
                obj.setFunction("I make sure everything is even");
            }
            input = kb.next();

        }

        //Printing items in the Storage.
        System.out.println("Items in storage:");
        bin.displayItems();

        //Input for yes/no.
        String input2;
        //Input for entering the id for the tool which needs to be removed and added to the workbelt.
        String inputID;

        boolean quit = false;

        //Loop for checking if the user wants to retrieve a tool to add to the workbelt or not.
        while (!quit){
            System.out.println("Would you like to retrieve a tool and add it to the workbelt?");
            input2 = kb.next();
            if (input2.equals("yes")) {
                System.out.println("Enter item ID");
                inputID = kb.next();
                Tool id = bin.removeItem(Integer.parseInt(inputID));
                workbelt.add(id);
                System.out.println("Adding tool to workbelt");
            }
            else{
                System.out.println("Okay, have a nice day");
                break;
            }
        }

        //Displaying the reaming items after the user removes the item from the bin and adds to the workbelt.
        System.out.println("Tools left in bin: ");
        bin.displayItems();

        //Displaying the tools that are added to the workbelt.
        System.out.println("Tools in workbelt:");
        for (int i = 0; i < workbelt.size(); i++){
            System.out.println(workbelt.get(i));
        }
    }
}

