package test.model;
import java.util.HashMap;

public class authenticate {

		public String authenticator(String country){
		HashMap <String,String> map=new HashMap();
		map.put("india","delhi");
		map.put("china","beijing");
		map.put("russia","moscow");
		map.put("sri lanka","columbia");
		
		System.out.println(map.get(country));
		return(map.get(country));
		}
		
		
		
		

	}


