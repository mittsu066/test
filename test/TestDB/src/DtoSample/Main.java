package DtoSample;

import java.util.List;

public class Main {
	public static void main(String[] args){
		BandInfoDao band_info_dao = new BandInfoDao();
		List<BandInfoDto> list = band_info_dao.getBandInfo();
		list.forEach(e -> System.out.println(e));
	}
}
