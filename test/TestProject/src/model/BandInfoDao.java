package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class BandInfoDao {

	public ObservableList<UserInfo> getBandInfo() {
		ObservableList<UserInfo> bandInfo = FXCollections.observableArrayList();
		try {
			try (Connection con = DriverManager.getConnection("jdbc:sqlite:/Users/mitsuru/Documents/Test.sqlite");
					Statement pstmt = con.createStatement();
					ResultSet rs = pstmt.executeQuery("SELECT * FROM Test");) {

				while (rs.next()) {
					UserInfo tmp = new UserInfo(rs.getInt(1), rs.getString(2), rs.getString(3),
							rs.getString(4), rs.getString(5), rs.getInt(6));
					bandInfo.add(tmp);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bandInfo;
	}
}