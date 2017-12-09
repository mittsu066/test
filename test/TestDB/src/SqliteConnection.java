import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SqliteConnection {
	static Connection conn = null;
	static Statement stmt = null;
	static ResultSet rs = null;
	static int col = 0;
	
	public static void main(String[] args){
		try{
			conn = dbConnector();
			stmt =conn.createStatement();
			String sql = "SELECT * FROM Test";
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				System.out.println("EID:"+rs.getInt(1));
				System.out.println("Name:"+rs.getString(2));
				System.out.println("Surname:"+rs.getString(3));
				System.out.println("Username:"+rs.getString(4));
			}
				sql = "INSERT INTO Test VALUES (2,'Mitsuru','takahashi','3','3',34)";
				//sql = "DELETE FROM Test where EID=2";
				col = stmt.executeUpdate(sql);
				System.out.println("col:"+col);
		}catch(Exception e){
				System.out.println("col:"+col);
		}
	}
	public static Connection dbConnector(){
		try{
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/mitsuru/Documents/Test.sqlite");
			return conn;
		}catch(Exception e){
			return null;
		}
	}
}
