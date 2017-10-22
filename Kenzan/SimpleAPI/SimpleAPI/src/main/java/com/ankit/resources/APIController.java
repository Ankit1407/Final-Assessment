package com.ankit.resources; 
  
import java.lang.reflect.Method;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;



@RestController
@RequestMapping(value="/")
public class APIController {
	
	@RequestMapping(value="/Fuzz/{count}", method = RequestMethod.GET)
	public String FuzzBuzz(@PathVariable("count") int count) {
		
		JsonObject json = new JsonObject();
		JsonArray attachmentArray =new JsonArray();
		ArrayList<Integer> bf =  new ArrayList<>();
		ArrayList<Integer> b =  new ArrayList<>();
		ArrayList<Integer> f =  new ArrayList<>();
		
		
		for(int i=1;i<=count;i++){
			
			if(i%15==0){
				bf.add(i);
			}else if(i%5==0){
				b.add(i);
			}
			else if(i%3==0){
				f.add(i);
			}
			
		
		}
		json.addProperty("fizz ", f.toString());
		json.addProperty("buzz ", b.toString());
		json.addProperty("fizz buzz ", bf.toString());
		attachmentArray.add(json);
		
		return attachmentArray.toString();
		
		
	}
}
