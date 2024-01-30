
public class Lab4Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SanPham sp1 = new SanPham("iPhone 13 Pro Max", 30000000, 10);
        SanPham sp2 = new SanPham("Samsung Galaxy S23", 25000000);

        sp1.setTenSp("iPhone 13 Pro Max 2023");
        sp1.setDonGia(35000000);
        sp1.setGiamGia(20);

        sp2.setTenSp("Samsung Galaxy S23 2023");
        sp2.setDonGia(30000000);

        sp1.Xuat();
        sp2.Xuat();
	}

}
