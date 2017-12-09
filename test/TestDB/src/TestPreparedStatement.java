

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestPreparedStatement {

	public static void main(String[] args){
		
		String sql = "SELECT * FROM Test WHERE EID = ?";
		
		try{
			Connection con = DriverManager.getConnection("jdbc:sqlite:/Users/mitsuru/Documents/Test.sqlite");
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			//第二引数に出力するIDを入力する
			pstmt.setInt(1,1);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()){
				System.out.print("EID:"+rs.getString(1));
				System.out.print(" Name:"+rs.getString(2));
				System.out.print(" Surname:"+rs.getString(3));
				System.out.print(" Username:"+rs.getString(4));
				System.out.println();
			}
			rs.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
