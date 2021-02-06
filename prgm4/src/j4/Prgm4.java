package j4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;
public class  Prgm4{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3310/lab4","root","");
		
			
			//execute and display results
			
			Statement st = (Statement) con.createStatement();
			ResultSet rs = st.executeQuery("select * from details");
			
			System.out.println("name\t\tbranch\t\tnative\t\tmobilenum");
		
			while(rs.next()) {
				System.out.println(rs.getString(1) + "\t\t" + rs.getString(2) + "\t\t" + rs.getString(3) + "\t\t" + rs.getString(4));
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