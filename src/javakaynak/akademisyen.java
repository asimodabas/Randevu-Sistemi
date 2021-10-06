/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javakaynak;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class akademisyen extends kisi {
private int sicilno;
private String anabilim;
private String unvan;

public akademisyen(String ad, String soyad , String eposta , String telefon) {
	super(ad,soyad,eposta,telefon);
}

public akademisyen(String ad,String soyad,String eposta,String telefon , int sicilno , String anabilim , String unvan) throws IOException {
	super(ad , soyad , eposta , telefon);
	this.sicilno = sicilno;
	this.anabilim = anabilim;
	this.unvan = unvan;
	
	File f = new File("akademisyen.txt"); 
	String bilgi = this.toString();
	if(!f.exists()) {
		f.createNewFile();
	}
	 FileWriter fw = new FileWriter(f , true);
	 BufferedWriter bw = new BufferedWriter(fw);
	 bw.append("\n" + bilgi);
	 bw.close();
	 
}

public int getSicilno() {
	return sicilno;
}

public void setSicilno(int sicilno) {
	this.sicilno = sicilno;
}

public String getAnabilim() {
	return anabilim;
}

public void setAnabilim(String anabilim) {
	this.anabilim = anabilim;
}

public String getUnvan() {
	return unvan;
}

public void setUnvan(String unvan) {
	this.unvan = unvan;
}

public void randevularım() throws IOException {
	FileReader fr = new FileReader("randevu.txt");
	String satır;
	BufferedReader br = new BufferedReader(fr);
	while(((satır = br.readLine()) != null)) {
		if(satır.contains(this.getAd() + this.getSoyad())) {
			System.out.println(satır);
		}
	}
	
	br.close();
}


public String toString() {
	return super.toString() + "akademisyen bilgileri  => sicilno =" + sicilno + ", Anabilim dalı =" + anabilim + ", Ünvanı =" + unvan 
			;
}

}


