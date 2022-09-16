package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;

public class Config {
	
	static void generate() {
		String text = getText();
		String[] lines = text.split(System.lineSeparator());
		for (String line : lines) {
			String[] parts = line.split(";");
			ArrayList<String> pets = new ArrayList<String>();
			if (parts.length>6)
				pets.addAll(Arrays.asList(parts[6].split(",")));
			new Person(parts[0], parts[1], parts[5], Integer.parseInt(parts[2]),
					Integer.parseInt(parts[4]), parts[3], pets);
		}
	}
	
	static void seeExample() {
		System.out.println("There are " +Person.all.size()+ " total persons. Here are three of them:");
		System.out.println(Person.all.get(0));
		System.out.println(Person.all.get(1));
		System.out.println(Person.all.get(2));
	}

	private static String getText(){
		try {
			return Files.readString(Path.of("text.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "gg";
	}
	
	
}
