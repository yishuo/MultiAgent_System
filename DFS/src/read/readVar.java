package read;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * 
 * Read the 'Var' data from the file var.txt
 * You can input the name of domain and then 'Enter' for getting
 * all antennas in this domain.
 *
 */
public class readVar {
    public static void main(String[] args) {

 
        List<String[]> data = new ArrayList<>();
 
        try {
            Scanner in = new Scanner(new File("H:/mobiledisk/eclipse/projet/DFS/DFS/src/read/var.txt")); 
            while (in.hasNextLine()) {
                String str = in.nextLine(); 
//                str = str.split(" ").trim();
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
        
        List<String> test = new ArrayList<>();
        String last = null;
        for (String[] strings : result) {
            for (String string : strings) {
            	string = string.trim();
            	if(string.equals("")){}
            	else{
            		test.add(string);
            	}
            	

            }
       
        }
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input the domain: ");
		int domain = sc.nextInt();
        for(String a : test){
        	if((Integer.parseInt(a)==domain)&&(Integer.parseInt(last)>domain)){
        		System.out.println(last);
        	}
        	last = a;
        	
        }

    }
}