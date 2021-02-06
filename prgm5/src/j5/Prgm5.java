package j5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class Prgm5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3310/lab4","root","");
			
			Scanner ob = new Scanner(System.in);
			System.out.println("Enter name: ");
			String name = ob.nextLine();
			System.out.println("Enter Mobile num: ");
			String mobilenum = ob.nextLine();
			
			//update
			
			String q = "update details set name = ? where mobilenum = ?";
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(q);
			
			//for ? values
			
			ps.setString(1,name);
			ps.setString(2, mobilenum);
			
			int up = ps.executeUpdate();
			
			System.out.println("total number of updated rows = " +up);
			
			System.out.println("after updating the table looks like");
			
				//you can thik already befoore updating we print the table there we used statement and resultset so no need to declare twice
			
			//its wrong because there rs pointer is at last if you use the same pointer it wont print any table as boolean value is false
			
			Statement stat = (Statement) con.createStatement();
			ResultSet rse = stat.executeQuery("select * from details");
			
			System.out.println("name\t\tbranch\t\tnative\t\tmobilenum");
			
			while(rse.next()) {
				System.out.println(rse.getString(1) + "\t\t" + rse.getString(2) + "\t\t" + rse.getString(3) + "\t\t" + rse.getString(4) + "\t" );
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}



