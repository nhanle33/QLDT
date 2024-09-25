package LeTranQuangNhan_23698431;

import java.time.LocalDate;


public class QLDT {
	private String MaGiaoDich;
	private String SoLo;
	private String HoTen;
	private LocalDate NgayGiaoDich;
	private int DienTich;
	private double DonGia;
	//
	public QLDT() {
		// TODO Auto-generated constructor stub
		MaGiaoDich="";
		SoLo="chua cap nhat";
		HoTen="";
		DienTich=0;
		DonGia=0;
	}
	public QLDT(String mgd,String sl,String ht, LocalDate ngd, int dt, double dg) {
		this.MaGiaoDich=mgd;
		setSoLo(sl);
		this.HoTen=ht;
		this.NgayGiaoDich=ngd;
		setDienTich(dt);
		setDonGia(dg);

		
	}
	public String getMaGiaoDich() {
		return MaGiaoDich;
	}
	public void setMaGiaoDich(String maGiaoDich) {
		MaGiaoDich = maGiaoDich;
	}
	public String getSoLo() {
		return SoLo;
	}
	public void setSoLo(String soLo) {
		if((soLo==null)||(soLo.length()==0)) {
			this.SoLo="chua cap nhat";
		}else {
			this.SoLo=soLo;
		}
	}
	public String getHoTen() {
		return HoTen;
	}
	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}
	public LocalDate getNgayGiaoDich() {
		return NgayGiaoDich;
	}
	public void setNgayGiaoDich(LocalDate ngayGiaoDich) {
		NgayGiaoDich = ngayGiaoDich;
	}
	public int getDienTich() {
		return DienTich;
	}
	public void setDienTich(int dienTich) {
		if(dienTich<0) {
			this.DienTich=1;
		}else {
			this.DienTich=dienTich;
		}
	}
	public double getDonGia() {
		return DonGia;
	}
	public void setDonGia(double donGia) {
		if(donGia<0) {
			this.DonGia=1;
		}else {
			this.DonGia=donGia;
		}
	}


	//
	public double Thue() {
		return (0.1*DonGia)*DienTich;
	}
	public double ThanhTien() {
		return DienTich*DonGia+Thue();
	}
	//
	public String toString() {
		return "Ma Giao dich:"+this.MaGiaoDich+"\tSo Lo:"+this.SoLo+
				"\tHo ten nguoi mua:"+this.HoTen+"\tNgay giao dich:"+this.NgayGiaoDich+
				"\tDien tich:"+this.DienTich+"\tDon gia:"+this.DonGia+"\tThanh tien:"+ThanhTien()+"\n";
	}
	
	
	


}
