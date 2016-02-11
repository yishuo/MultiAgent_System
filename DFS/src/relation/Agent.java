package relation;

import java.util.ArrayList;
import java.util.List;

public class Agent {
	String label;
	int index;
	String parent;
	List <String> voisinList=new ArrayList<String>();
	List <String> pseudoparent=new ArrayList<String>();
	List <String> enfant=new ArrayList<String>();
	List <String> pseudoenfant=new ArrayList<String>();
	
	public Agent(){		
	}
	
	public Agent(String label,int index){
		this.label=label;
		this.index=index;
		this.parent=null;
		
	}
	
	public void set_label(String label){
		this.label=label;		
	}
	public String get_label(){
		return this.label;		
	}
	
	public void set_index(int index){
		this.index=index;		
	}
	public int get_index(){
		return this.index;		
	}
	
	public void set_parent(String parent){
		this.parent=parent;		
	}
	public String get_parent(){
		return this.parent;		
	}
	
	public void set_pseudoparent(String pseudoparent){
		this.pseudoparent.add(pseudoparent);		
	}
	public List<String> get_pseudoparent(){
		return this.pseudoparent;		
	}
	
	public void set_enfant(String enfant){
		this.enfant.add(enfant);		
	}
	public List<String> get_enfant(){
		return this.enfant;		
	}
	
	public void set_pseudoenfant(String pseudoenfant){
		this.pseudoenfant.add(pseudoenfant);		
	}
	public List<String> get_pseudoenfant(){
		return this.pseudoenfant;		
	}
	public void set_voisinlist(String voisin){
		this.voisinList.add(voisin);
//		System.out.println(voisinList);
	}
	public List<String> get_voisinList(){
		return this.voisinList;		
	}

}
