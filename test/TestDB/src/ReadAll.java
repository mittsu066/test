
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//Test.sqliteの内容をすべて出力する
public class ReadAll {
	//git test
	
	public static void main(String[] args){
		String query = "SELECT * FROM Test";
		try{
			Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/mitsuru/Documents/Test.sqlite");
			Statement stmt = conn.createStatement();
//			stmt.executeQuery(query);
			ResultSet rs = stmt.executeQuery(query);
//			rs.absolute(0);
//			rs.previous();
			while(rs.next()){
				System.out.print("EID:"+rs.getString(1));
				System.out.print(" Name:"+rs.getString(2));
				System.out.print(" Surname:"+rs.getString(3));
				System.out.print(" Username:"+rs.getString(4));
				System.out.println();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
