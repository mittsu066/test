import java.sql.*;

public class Main {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		       Connection conn = DriverManager.getConnection("jdbc:mysql://182.163.54.93:3843/pageone","mitsuru","paADqdjZaZvnv");
		       //Connection conn = DriverManager.getConnection("jdbc:mysql://182.163.54.93:3306/pageone","mitsuru","paADqdjZaZvnv");
				//Connection conn = DriverManager.getConnection("jdbc:mysql://182.163.54.93:3843/pageone","root","");
		       Statement st = conn.createStatement();
		       ResultSet rs =
		       st.executeQuery("select * from customer");
			
			while (rs.next()) {
				String content_id = rs.getString("content_id");
				String name = rs.getString("name");
				Float rates = rs.getFloat("rates");
				String agreement = rs.getString("agreement");
				System.out.println(content_id + "," + name + "," + rates + "," + agreement);
			}
			
			rs.close();
			st.close();
			conn.close();
		} catch ( SQLException e ) {
			e.printStackTrace();
		} catch ( Exception e ) {
			e.printStackTrace();
		}
	}
}