package LeTranQuangNhan_23698431;

import java.time.LocalDate;

public class DS {
	private QLDT[] list;
	private int count=0;
	//
	public DS(int n) {
		list=new QLDT[n];
		count =0;
	}
	//
	public boolean Add(QLDT ql) {
		if(count < list.length) {
			list[count++]=ql;
			return true;
		}else {
			return false;
		}	
	}
	//sap xep
	public void SapXep() {
		for(int i=0;i<count-1;i++) {
			for(int j=1;j<=count-1;j++) {
				if(list[i].getMaGiaoDich().compareTo(list[j].getMaGiaoDich())>0) {
					QLDT tmp=list[i];
					list[i]=list[j];
					list[j]=tmp;
				}
			}
		}
	}
	public double TongTien() {
		double s=0;
		for(int i=0;i<count;i++) {
			s+=list[i].ThanhTien();
		}
		return s;		
	}
	public String xuatDS() {
		String ds="";
		for(int i=0;i<count;i++) {
			if(list[i].getNgayGiaoDich().isAfter(LocalDate.of(2023, 1, 1)) && list[i].getNgayGiaoDich().isBefore(LocalDate.of(2023, 2, 20))) {
				ds+=list[i].toString();
			}
		}
		return ds;
		
	}
	
	

}
