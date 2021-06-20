package Ex41.base;
import java.io.*;

/*
    defining the class NameSorter{
        defining the readNames() function to read the data from Scanner object to the ArrayList{
             reading the data till the file has nextLine;
             adding the read line to the list of names;
             }
           }


 */

import java.util.*;

public class NameSorter {


    public static void readNames(Scanner input, ArrayList<String> names) {


        while (input.hasNextLine()) {



            names.add(input.nextLine());
        }
    }



    public static void outputNames(ArrayList<String> names) throws IOException {



        FileWriter output = new FileWriter("exercise41_output.txt");



        output.write("Total of " + names.size() + " names\n");

        output.write("--------------------\n");




        for (String i : names) {

            output.write(i + "\n");

        }



        output.close();

    }

    public static void main(String[] args) throws FileNotFoundException {



        Scanner inputFile = new Scanner(new File("exercise41_input.txt"));


        ArrayList<String> names = new ArrayList<String>();


        readNames(inputFile, names);

        // sorting the list of names using sort function

        Collections.sort(names, String.CASE_INSENSITIVE_ORDER);

        // closing the scanner object after reading the file

        inputFile.close();

        // writing the required data to the output file

        try {
            outputNames(names);
        }

        // if any exception is raised in writing to the output file then printing the exception on the console

        catch (Exception e) {
            System.out.println(e);
        }
    }

}
