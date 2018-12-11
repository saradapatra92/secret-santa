package com.ritu.santa;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.gson.Gson;
import com.google.gson.JsonObject;



/*@Controller annotation as it a a request controller*/

@Controller
public class DemoController {

	
	
	@RequestMapping("/")
	String index(){
		return "index";
	}	
	@RequestMapping("/process")
	String process(HttpServletRequest request) throws FileNotFoundException {
			System.out.println("Process");
			
			
		for(Map.Entry<Integer, Integer> entry:DemoApplication.secret.entrySet()) {
			System.out.println(entry.getKey()+"==>"+entry.getValue());
		}
		
		Integer id= Integer.parseInt(request.getParameter("id"));
		System.out.println(id);
		System.out.println(request.getParameter("name"));
		System.out.println(request.getParameter("team"));
		
		String name=request.getParameter("name").toString();
		String team=request.getParameter("team").toString();
		String email=request.getParameter("email").toString();
		System.out.println(DemoApplication.dev.containsKey(id));
		if(team.toLowerCase().equals("dev") && DemoApplication.dev.containsKey(id)) {
			System.out.println("DEV");
			Integer rnd=(int) (DemoApplication.random.nextInt(DemoApplication.dev.size()));
			
			Integer match=DemoApplication.dev_array[rnd];
			if(DemoApplication.secret.containsKey(id)) {
				match=DemoApplication.secret.get(id);
			}
			System.out.println(rnd);
			System.out.println(match);
			System.out.println(id);
			System.out.println("Match:"+DemoApplication.support.get(match));
			
			while(DemoApplication.secret.containsKey(match) || id.equals(match)) {
				rnd=(int) (DemoApplication.random.nextInt(DemoApplication.dev.size()));
				System.out.println(rnd);
					
				match=DemoApplication.dev_array[rnd];
				System.out.println(match);
				
				System.out.println("Match:::"+DemoApplication.secret.containsKey(match));
				System.out.println(id);
				
				System.out.println("Match:"+DemoApplication.support.get(match));
				
			}
			//found the match
			DemoApplication.secret.put(id, match);
			saveSecret();
			String santaName=DemoApplication.dev.get(id);
			String personName=DemoApplication.dev.get(match);
			request.setAttribute("santaName", santaName);
			request.setAttribute("personName", personName);
			return "success";
			
		}else  if(team.toLowerCase().equals("support")&& DemoApplication.support.containsKey(id)) {
			Integer rnd=(int) (DemoApplication.random.nextInt(DemoApplication.support.size()));
			
			Integer match=DemoApplication.support_array[rnd];

			if(DemoApplication.secret.containsKey(id)) {
				match=DemoApplication.secret.get(id);
			}

			System.out.println("Match:"+DemoApplication.support.get(match));
			
			while(DemoApplication.secret.containsKey(match) || id.equals(match)) {
				rnd=(int) (DemoApplication.random.nextInt(DemoApplication.support.size()));
				match=DemoApplication.support_array[rnd];
				System.out.println("Match:"+DemoApplication.support.get(match));
			}
			//found the match
			DemoApplication.secret.put(id, match);
			saveSecret();
			String santaName=DemoApplication.support.get(id);
			String personName=DemoApplication.support.get(match);
			request.setAttribute("santaName", santaName);
			request.setAttribute("personName", personName);
			return "success";
		}else  if(team.toLowerCase().equals("manager")&& DemoApplication.manager.containsKey(id)) {
			Integer rnd=(int) (DemoApplication.random.nextInt(DemoApplication.manager.size()));
			
			Integer match=DemoApplication.manager_array[rnd];
			if(DemoApplication.secret.containsKey(id)) {
				match=DemoApplication.secret.get(id);
			}

			while(DemoApplication.secret.containsKey(match) || id.equals(match)) {
				rnd=(int) (DemoApplication.random.nextInt(DemoApplication.manager.size()));
				match=DemoApplication.manager_array[rnd];
			}
			//found the match
			DemoApplication.secret.put(id, match);
			saveSecret();
			String santaName=DemoApplication.manager.get(id);
			String personName=DemoApplication.manager.get(match);
			request.setAttribute("santaName", santaName);
			request.setAttribute("personName", personName);
			return "success";
			
		}else{
			return "fail";
		}
	}
	public void saveSecret() {
		
		PrintWriter writer;
		try {
			writer = new PrintWriter("secret.csv", "UTF-8");
			for(Map.Entry<Integer, Integer> entry:DemoApplication.secret.entrySet()) {
				writer.println(entry.getKey()+"\t"+entry.getValue());				
			}
			writer.close();

		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
