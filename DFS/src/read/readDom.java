package read;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Read the 'Dom' data from the file dom.txt for getting the result 
 * of all antennas in certain domain.
 *
 */
public class readDom {
    public static void main(String[] args) {
 
        List<String[]> data = new ArrayList<>();
 
        try {
            Scanner in = new Scanner(new File("H:/mobiledisk/eclipse/projet/DFS/DFS/src/read/dom.txt")); 
            while (in.hasNextLine()) {
                String str = in.nextLine(); 
                data.add(str.split(" "));
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