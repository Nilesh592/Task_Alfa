import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Studentarray {
    // to handle exceptions include throws
    public static void main(String[] args) throws IOException {
        // list that holds strings of a file
        List<String> listOfStrings = new ArrayList<String>();

        // load data from file
        BufferedReader bf = new BufferedReader(
                new FileReader("Studentlist.txt"));

        // read entire line as string
        String line = bf.readLine();

        // checking for end of file
        while (line != null) {
            listOfStrings.add(line);
            line = bf.readLine();
        }

        // closing bufferreader object
        bf.close();

        // storing the data in arraylist to array
        String[] arrayStudent = listOfStrings.toArray(new String[0]);

        // printing each line of file
        System.out.println("Contents of the array are - " + Arrays.toString(arrayStudent));

        Arrays.sort(arrayStudent);
        // prints array in ascending order
        System.out.println("Elements of array sorted in ascending order - " + Arrays.toString(arrayStudent));
        // prints array using the for loop
        List<String> nameList = new ArrayList<>(Arrays.asList(arrayStudent));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter student - ");
        // reading a string from the user
        String no = scanner.nextLine();
        boolean a = nameList.contains(no);
        if (a == true) {
            System.out.println("Present");
        } else {
            System.out.println("Absent");
        }
    }
}