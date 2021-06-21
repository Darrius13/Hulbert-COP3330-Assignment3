package Ex41.base;
import java.io.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
 */

/*
    Pseudo Code
   NameSorter.java

make a public class named NameSorter
add a public method readNames with Scanner and arrayList as arguments
while Scanner has next line
add name in arraylist
add a public method outputNames with arraylist as argument
make a new FileWriter object to write output file
write file information as number of names in output file
add all names from arraylist to output file
close output file
add main method
make a scanner object that reads from exercise41_input.txt file
make a new arraylist of string
class readNames method with this scanner object and this arraylist
sort the arraylist in case insensitive order using collections
close scanner
call the function outputNames for writing all names from arraylist in file
if any exception found with try catch then print the exception
wordFinder.java

import all the classes needed
make a public class named wordFinder
make a main method
make a scanner object of input file named exercise45_input.txt
make a new scanner to take input from console
take output filename from user using scanner
use try catch to handle exception
while scanner from file has next line
take a line from scanner as string
replace all "utilize" with "use" in line
write this modified line in output file
close the filewriter and scanner objects
print confirmation of success on console



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
