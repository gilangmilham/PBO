import java.util.*;
public class unHewan{
	public static void main(String[] args){
		hewan hei = new hewan();
		Scanner masukkan = new Scanner(System.in);
		String nama, habitat, ukuran, warna, makanan, jenisKelamin, kembangBiak, Kaki, kulit, pernapasan;
		int angka;
		
		System.out.print("Input nama hewan : "); 
		nama = masukkan.nextLine();
		hei.setNamaHewan(nama);
		
		
		System.out.print("Input Habitat hewan : "); 
		habitat = masukkan.nextLine();
		hei.setHabitatHewan(habitat);
		
		System.out.print("Input Ukuran hewan : "); 
		ukuran = masukkan.nextLine();
		hei.setUkuranHewan(ukuran);
		
		
		System.out.print("Input Warna hewan : "); 
		warna = masukkan.nextLine();
		hei.setWarnaHewan(warna);
		
		System.out.print("Input Makanan hewan : "); 
		makanan = masukkan.nextLine();
		hei.setMakananHewan(makanan);
		
		
		System.out.print("Input Jenis Kelamin hewan : "); 
		jenisKelamin = masukkan.nextLine();
		hei.setJenisKelaminHewan(jenisKelamin);
		
		System.out.print("Input Cara Berkembang Biak hewan : "); 
		kembangBiak = masukkan.nextLine();
		hei.setBerkembangBiakHewan(kembangBiak);
		
		System.out.print("Input Banyak Kaki hewan : "); 
		Kaki = masukkan.nextLine();
		hei.setBanyakKakiHewan(Kaki);
		
		System.out.print("Input Jenis Kulitnya hewan : "); 
		kulit = masukkan.nextLine();
		hei.setJenisKulitHewan(kulit);
		
		System.out.print("Input Alat pernapasannya : "); 
		pernapasan = masukkan.nextLine();
		hei.setNapasHewan(pernapasan);
	
	
		System.out.println("\n\n Ciri hewan " + hei.getNama() + " yaitu :");
		System.out.println("1. Berhabitat di" + hei.getHabitat());
		System.out.println("2. Ukurannya " + hei.getUkuran());
		System.out.println("3. Berwarna " + hei.getWarna());
		System.out.println("4. Pemakan " + hei.getMakanan());
		System.out.println("5. Memiliki jenis kelamin " + hei.getJenisKelamin());
		System.out.println("6. Berkembang Biak dengan cara " + hei.getBerkembangBiak());
		System.out.println("7. Kakinya berjumlah " + hei.getBanyakKaki());
		System.out.println("8. Kulitnya " + hei.getJenisKulit());
		System.out.println("9. Bernapas menggunakan " + hei.getPernapasan());
	}
	
}