package com.ritu.santa;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


@SpringBootApplication
public class DemoApplication extends SpringBootServletInitializer {

	public static Map<Integer, Integer> secret = new HashMap<Integer, Integer>();
	public static Integer[] dev_array;
	public static Integer[] support_array;
	public static Integer[] manager_array;

	public static Map<Integer, String> dev = new HashMap<Integer, String>();
	public static Map<Integer, String> support = new HashMap<Integer, String>();
	public static Map<Integer, String> manager = new HashMap<Integer, String>();

	public static Random random = new Random(System.currentTimeMillis());
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DemoApplication.class);
	}

	public static void main(String[] args) throws Exception {

		SpringApplication.run(DemoApplication.class, args);
		readData();

	}

	public static void readData() {
		try {
			Scanner in = new Scanner(new File("support.csv"));
			while (in.hasNextLine()) {
				Integer id = in.nextInt();
				String name = in.nextLine().trim();
				support.put(id, name);
			}
			if (support != null)
				support_array = (Integer[]) support.keySet().toArray(new Integer[support.size()]);

			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {

			Scanner in = new Scanner(new File("dev.csv"));
			while (in.hasNextLine()) {
				Integer id = in.nextInt();
				String name = in.nextLine().trim();
				dev.put(id, name);
			}
			dev_array = (Integer[]) dev.keySet().toArray(new Integer[dev.size()]);

			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			Scanner in = new Scanner(new File("manager.csv"));
			while (in.hasNextLine()) {
				Integer id = in.nextInt();
				String name = in.nextLine().trim();
				manager.put(id, name);
			}
			manager_array = (Integer[]) manager.keySet().toArray(new Integer[manager.size()]);

			in.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			Scanner in = new Scanner(new File("secret.csv"));
			while (in.hasNextLine()) {
				Integer key = in.nextInt();
				Integer value = in.nextInt();
				secret.put(key, value);
			}

			in.close();
		    
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
