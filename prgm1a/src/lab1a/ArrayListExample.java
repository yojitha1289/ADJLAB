package lab1a;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Yojitha");
		arr.add("Mani");
		arr.add("Tejaswini");
		arr.add("Jayasankar");
		arr.add("Lakshmi");
		System.out.println("Currently the array list has following elements:"+arr);
		arr.add(0,"Ramesh");
		arr.add(1,"Rani");
		arr.remove("Mani");
		arr.remove("Lakshmi");
		System.out.println("Currently array list is:"+arr);
		arr.remove(1);
		System.out.println("Currently the array list is:"+arr);
		

	}

}
