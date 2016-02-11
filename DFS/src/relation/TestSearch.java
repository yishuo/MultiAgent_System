package relation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestSearch {
	
	static int[][] freq = new int[49][3];
	
	static int[] frequence = {6,142,170,240,380,408,478};

	public static void cout(){
		int index_row=0;
		for(int index_time = 0;index_time<7;index_time++){
			for(int index_fre=0;index_fre<7;index_fre++){
				freq[index_row][1]=frequence[index_fre];
				index_row++;
			}
		}
		index_row=0;
		int index_fre2=0;
		for(int index_time = 0;index_time<7;index_time++){
			for(int index_fre=0;index_fre<7;index_fre++){
				freq[index_row][0]=frequence[index_fre2];
				index_row++;
			}
			index_fre2++;
		}
		
		for(int index_time=0; index_time<49; index_time++){
			int result = freq[index_time][0]-freq[index_time][1];
				if((result==238) || (result==-238)){
					int cost = 0;
					cost+=1;
					freq[index_time][2] = cost;
				}
		}
		
		for(int i=0;i<freq.length;i++){
			for(int j=0;j<freq[i].length;j++)
				System.out.println(freq[i][j]);
			
		}
	}

    public static void main(String args[]) {

    	Agent agent1=new Agent("141",0);
    	Agent agent2=new Agent("142",1);
    	Agent agent3=new Agent("251",2);
    	Agent agent4=new Agent("252",3);
    	Agent agent5=new Agent("293",4);
    	Agent agent6=new Agent("294",5);
    	
    	agent1.set_voisinlist("142");
    	agent1.set_voisinlist("251");
    	agent1.set_voisinlist("252");
    	
    	agent2.set_voisinlist("141");    	
    	agent2.set_voisinlist("251");
    	agent2.set_voisinlist("252");
    	
    	agent3.set_voisinlist("141");
    	agent3.set_voisinlist("142");
    	agent3.set_voisinlist("252");

    	agent4.set_voisinlist("141");
    	agent4.set_voisinlist("142");
    	agent4.set_voisinlist("251");

    	agent5.set_voisinlist("294");

    	agent6.set_voisinlist("293");

    	ArrayList<Agent> AgentList= new ArrayList<Agent>();
    	AgentList.add(agent1);
    	AgentList.add(agent2);
    	AgentList.add(agent3);
    	AgentList.add(agent4);
    	AgentList.add(agent5);
    	AgentList.add(agent6);


    	
        int n=6,e=7;    
        String labels[]={"141","142","251","252","293","294"};
        Main graph=new Main(n);
        for(String label:labels) {
            graph.insertVertex(label);
        }
        graph.insertEdge(0, 1, 1);
        graph.insertEdge(0, 2, 1);
        graph.insertEdge(0, 3, 1);
        graph.insertEdge(1, 2, 1);
        graph.insertEdge(1, 3, 1);
        graph.insertEdge(2, 3, 1);
        graph.insertEdge(4, 5, 1);

        System.out.println("娣卞害浼樺厛鎼滅储搴忓垪涓猴�?");
        graph.depthFirstSearch();
        System.out.println("娣卞害浼樺厛鎼滅储搴忓垪涓猴�?");

        List<String> resultList=new ArrayList<String>();
        resultList=graph.get_resultList();
        
        for(int i=0; i<resultList.size();i++){       	
        		for(Agent j: AgentList){
        			if(resultList.get(i)==j.get_label()){
        				for(int i2=i-1;i2>=0;i2--){
        					for(String index_voisin : j.get_voisinList()){
        						if((index_voisin.equals(resultList.get(i2)))&&(i2==(i-1))){
        							j.set_parent(index_voisin);
        							for(Agent j2: AgentList){
        								if(j2.get_label().equals(index_voisin))
        									j2.set_enfant(j.get_label());
        							}
        						}
        						else if((index_voisin.equals(resultList.get(i2)))&&(i2!=(i-1))){
        							if(j.get_parent()==null){
        								j.set_parent(index_voisin);
        								for(Agent j2: AgentList){
            								if(j2.get_label().equals(index_voisin))
            									j2.set_enfant(j.get_label());
            							}	
        							}       	
        							else{
        								j.set_pseudoparent(index_voisin);
        								for(Agent j2: AgentList){
            								if(j2.get_label().equals(index_voisin))
            									j2.set_pseudoenfant(j.get_label());
            							}
        							}
        						}else{				
        						}
        					}
        				}
        			}
    			}
        	}
        
        for(Agent aaa :AgentList){
        	System.out.println("agent: "+aaa.get_label());       	
        	System.out.println("parent: "+aaa.get_parent());
        	System.out.println("pseudoparent: "+aaa.get_pseudoparent());
        	System.out.println("enfant: "+aaa.get_enfant());       	
        	System.out.println("pseudoenfant: "+aaa.get_pseudoenfant()); 
        	System.out.println("...........");

        }

		Scanner sc = new Scanner(System.in);
		System.out.println("Please input the label: ");
		String yourfreq = sc.nextLine();
		System.out.println("The frequence inputed is: " + yourfreq);

		for(Agent aaa :AgentList){
			if (aaa.get_label().equals(yourfreq)){
				System.out.println("agent: "+aaa.get_label());       	
	        	System.out.println("parent: "+aaa.get_parent());
	        	System.out.println("pseudoparent: "+aaa.get_pseudoparent());
	        	System.out.println("enfant: "+aaa.get_enfant());       	
	        	System.out.println("pseudoenfant: "+aaa.get_pseudoenfant()); 
			}else{
//				System.out.println("There isn't the label you inputed.");
				TestSearch test = new TestSearch();
				
			}
		}
    }
}



