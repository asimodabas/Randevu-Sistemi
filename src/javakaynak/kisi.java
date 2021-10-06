package javakaynak;

public class kisi {
	private String ad;
	private String soyad;
	private String eposta;
	private String telefon;

public kisi(String ad,String soyad,String eposta,String telefon) {
	this.ad = ad;
	this.soyad = soyad;
	this.eposta = eposta;
	this.telefon = telefon;
}

public String getAd() {
	return ad;
}

public void setAd(String ad) {
	this.ad = ad;
}

public String getSoyad() {
	return soyad;
}

public void setSoyad(String soyad) {
	this.soyad = soyad;
}

public String getEposta() {
	return eposta;
}

public void setEposta(String eposta) {
	this.eposta = eposta;
}

public String getTelefon() {
	return telefon;
}

public void setTelefon(String telefon) {
	this.telefon = telefon;
}


public String toString() {
	return "Adı =" + ad + "  Soyadı " + soyad + "  eposta=" + eposta + "  telefon=" + telefon ;
}


}
