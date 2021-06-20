package Ex45.wordFinder;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class wordFinder {
    // main method
    public static void main(String[] args) throws IOException {

        // pass the path to the file as a parameter
        // make sure that path of file should be correct
        // Here exercise45_input.txt is located in same directory where program saved
        File file = new File("exercise45_input.txt");
        Scanner sc = new Scanner(file);

        // create another Scanner object to prompt input from user via console
        Scanner s = new Scanner(System.in);

        // prompt the name of Output File from user
        System.out.print("\nEnter the name of Output File : ");

        String outputfile = s.next();

        // create a FileWriter object to write into a file
        // outputfile will be created in same directory where your program saved
        FileWriter writer = new FileWriter(outputfile);


        // try and finally block to handle exceptions
        try
        {
            // using while loop read file
            while( sc.hasNext() )
            {
                // read whole line
                String user = sc.nextLine();

                // replace utilize by use
                user = user.replaceAll("utilize", "use");

                // write into outputfile
                writer.write(user);

                writer.write("\n");
            }
        }
        finally
        {
            sc.close();
        }

        // close the writer file
        writer.close();

        // If program executes successfully
        System.out.println("\nSuccessfully Modified!!");
    }
}



