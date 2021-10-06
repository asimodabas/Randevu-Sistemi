package javakaynak;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ogrenci extends kisi {
	private String bolum;
	private int kayityili;
	private int numara;
	
	public ogrenci(String ad, String soyad ,String eposta ,String telefon) {
		super(ad , soyad , eposta ,telefon);
		this.bolum = "tanımlanmadı";
		this.kayityili = 0;
		this.numara = 0;
	}
	
	public ogrenci(String ad,String soyad,String eposta,String telefon ,String bolum , int kayityili , int numara) throws IOException {
		super(ad,soyad,eposta,telefon);
		this.bolum = bolum;
		this.kayityili = kayityili;
		this.numara = numara;
		
		File f = new File("öğrenci.txt");
		String bilgiogrenci = this.toString() + "\n";
		if(!f.exists()) {
			f.createNewFile();
		}
		
		else {
		FileWriter fw = new FileWriter(f,true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.append(bilgiogrenci);
		bw.close();
		}
		
		
	}

	public String getBolum() {
		return bolum;
	}

	public void setBolum(String bolum) {
		this.bolum = bolum;
	}

	public int getKayityili() {
		return kayityili;
	}

	public void setKayityili(int kayityili) {
		this.kayityili = kayityili;
	}

	public int getNumara() {
		return numara;
	}

	public void setNumara(int numara) {
		this.numara = numara;
	}
	
	public void randevual(akademisyen a,String tarih, String bassaat,String bitissaat) throws IOException {
		String info = this.getNumara() + "Randevu alınacak kişi -> "  + a.getAd().toUpperCase() +" "+ a.getSoyad().toUpperCase()+ " " + tarih + " " + bassaat + " -- "+ bitissaat + "\n";
		File f = new File("randevu.txt");
		FileReader fr = new FileReader("randevu.txt");
		String satır;
		BufferedReader br = new BufferedReader(fr);
		if(!f.exists()) {
			f.createNewFile();
		}
			while(((satır = br.readLine()) != null)) {
			if(satır.contains(a.getAd().toUpperCase()) && satır.contains(bassaat) && satır.contains(tarih)) {
				System.out.println("Randevu daha önceden alınmış");
				break;
				
			}
		}
	    br.close();
		FileWriter fw = new FileWriter(f,true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.append(info);
		
		bw.close();
	}
   
	public void randevulistele() throws IOException {
		FileReader fr = new FileReader("randevu.txt");
		String satır;
		BufferedReader br = new BufferedReader(fr);
		while(((satır = br.readLine()) != null)) {
			if(satır.contains(Integer.toString(this.getNumara()))) {
				System.out.println(satır);
			}
		}
		
		br.close();
 	
	}

		public String toString() {
		return "ogrenci bilgiler = bölüm=" + bolum + ", kayityili=" + kayityili + ", numara=" + numara + " "
				+ super.toString();
	}
	
	
	
}

