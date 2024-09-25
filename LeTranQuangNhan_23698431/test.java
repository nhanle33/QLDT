package LeTranQuangNhan_23698431;

import java.time.LocalDate;

public class test {

	public static void main(String[] args) {
		DS ql=new DS(3);
		ql.Add(new QLDT("2", "5", "Le A", LocalDate.of(2023, 1,12), 1000, 60000));
		ql.Add(new QLDT("3", "6", "Le B", LocalDate.of(2023, 2, 18), 1500, 60000));
		ql.Add(new QLDT("4", "7", "Le C", LocalDate.of(2024, 9, 27), 2000, 60000));
		ql.SapXep();
		System.out.println(ql.xuatDS());
		System.out.println(ql.TongTien());
	
		
		

		
		

	}

}
