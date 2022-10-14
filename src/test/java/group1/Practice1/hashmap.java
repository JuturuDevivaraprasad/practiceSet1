package collections2;

import java.util.HashMap;
import java.util.Map;

public class hashmap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();    
	      System.out.println("Initial list of elements: "+hm);  
	      hm.put(100,"Amit");//duplicate asssigned at 102 key    
	      hm.put(101,"Vijay");    
	      hm.put(102,"Amit");   
	      hm.put(0,"yoga"); //one null key
	      hm.put(103,"");//multiple null values
	      hm.put(104,"");//put means insert/add
           
		//for(String s:list)  {}         
	      for(Map.Entry m:hm.entrySet())
		{    
	       System.out.println(m.getKey() +" "+ m.getValue());    
	      }  

	     //conditional insertion in hashmap        
	      hm.putIfAbsent(105, "yoganand");  //conditional insertion 
	      System.out.println("After invoking/Insert putIfAbsent() method ");  
	      for(Map.Entry m:hm.entrySet()){    
	           System.out.println(m.getKey()+" "+m.getValue());    
	          }  

		//creating one more hashmap
	     // HashMap<Integer,String> map=new HashMap<Integer,String>();  
	     // map.put(104,"Ravi"); //add 
	      //map.putAll(hm);  //addaLL--list   //al.addAll(al2); //bulk insertion  

	     // System.out.println("After invoking putAll() method ");  
	      //for(Map.Entry m:map.entrySet()){    
	         //  System.out.println(m.getKey()+" "+m.getValue());    //
	         // }  



}


}
