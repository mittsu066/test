package DtoSample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BandInfoDao {

	public List<BandInfoDto> getBandInfo() {
		List<BandInfoDto> bandInfo = new ArrayList<BandInfoDto>();
		/*
		 * TODO データベースに接続してselect Bandname, BandBirthDay, BandType from...
		 * とかでバンドの情報をとってきてListにaddしていく。
		 * 
		 * (ex) BandInfoDto tmp = new BandInfoDto(rs.getString(1), rs.getInt(2),
		 * rs.getInt(3)); bandInfo.add(tmp);
		 */
		try {
			try (Connection con = DriverManager.getConnection("jdbc:sqlite:/Users/mitsuru/Documents/Test.sqlite");
					Statement pstmt = con.createStatement();
					ResultSet rs = pstmt.executeQuery("SELECT * FROM Test");) {

				while (rs.next()) {
					BandInfoDto tmp = new BandInfoDto(rs.getString(1), rs.getString(2), rs.getString(3),
							rs.getString(4), rs.getString(5), rs.getString(6));
					bandInfo.add(tmp);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bandInfo;
	}
}