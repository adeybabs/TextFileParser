package CFG;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import java.io.FileReader;
import java.util.Scanner;

public class CFG {
    // include throws to handle some file handling exceptions
    public static void main(String[] args)
            throws IOException
    {
        // arraylist to store strings
        List<String> listOfStringscd
                = new ArrayList<String>();

        // load content of file based on specific delimiter
        Scanner sc = new Scanner(new FileReader("EP720N.TXT"));
        String str;

        // checking end of file
        while (sc.hasNext()) {

            str = sc.next().toString();
            if(str == "Destination")
                System.out.println(str);


            // adding each string to arraylist
            // listOfStrings.add(str);
        }

        // convert any arraylist to array
        String[] array
                = listOfStrings.toArray(new String[0]);

        // print each string in array
        // for (String eachString : array) {
        //     System.out.println(eachString);
        // }
    }
}
