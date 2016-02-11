package read;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Read the 'Ctr' data from the file ctr.txt for getting the restrictions 
 * of two antennas.
 *
 */
public class readCtr {
    public static void main(String[] args) {
 
        List<String[]> data = new ArrayList<>();
 
        try {
            Scanner in = new Scanner(new File("H:/mobiledisk/eclipse/projet/DFS/DFS/src/read/ctr.txt")); 
            while (in.hasNextLine()) {
                String str = in.nextLine(); 
//                str = str.split(regex);
                data.add(str.split(" |D|C|F|P|L"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        String[][] result = data.toArray(new String[][] {});

        for (String[] strings : result) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }
}