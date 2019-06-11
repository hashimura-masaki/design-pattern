package Adapter;

import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		FileIO f = new FileProperties();
		try {
			f.readFromFile("file.txt");
			f.setValue("key","2004");
			f.setValue("month", "4");
			f.setValue("day", "21");
			f.writeToFile("newfile.txt");
			System.out.println(f.getValue("year"));
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
