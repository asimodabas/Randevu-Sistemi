
package javakaynak;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class Ders {

	public static void main(String[] args) throws IOException {
		
		akademisyen akademisyen1 = new akademisyen("Geçici","akademisyen","Bellek","Objesi");
		
		ogrenci ogrenci1 = new ogrenci("Geçici" , "Öğrenci" , "Bellek" , "Objesi");
		  
		
		System.out.println("Lütfen Yapacağınız işlemi Seçiniz");
		System.out.println(" 1 - Akademisyen randevu sorgu");
		System.out.println(" 2 - Öğrenci randevu al");
		System.out.println(" 3 - Öğrenci kayıt");
		System.out.println(" 4 - Akademisyen kayıt");
		
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        System.out.println("Yapmak istediğiniz işlemin menü numarasını tuşlayınız");
        
        int sayı = sc.nextInt();
        
        while(sayı < 6) {
        	if(sayı == 1) {
        		System.out.println("Lütfen sırasıyla istenen bilgileri giriniz");
        		System.out.println("AD GİRİNİZ");
        		String adsc = sc.nextLine();
        		akademisyen1.setAd(adsc);
        		sc.nextLine();
          		System.out.println("SOYAD GİRİNİZ");
        		String soyadsc = sc.nextLine();
        		akademisyen1.setSoyad(soyadsc);
              	System.out.println("Randevularınız listeleniyor ....");
                akademisyen1.randevularım();
        		
        		break;
        		
        		
        	}
        		
        		else if(sayı == 2) {
        			sc.nextLine();
        			
        			System.out.println("AD GİRİNİZ");
             		String ogrenciad = sc.nextLine();
             		ogrenci1.setAd(ogrenciad);
             		
             		
             		System.out.println("SOYAD GİRİNİZ");
             		String ogrencisoyad = sc.nextLine();
             		ogrenci1.setSoyad(ogrencisoyad);
             		
             		System.out.println("E-POSTA GİRİNİZ");
             		String ogrencieposta = sc.nextLine();
             		ogrenci1.setEposta(ogrencieposta);
             		System.out.println("TELEFON NUMARASI GİRİNİZ");
             		String ogrencitelefon = sc.nextLine();
             		ogrenci1.setTelefon(ogrencitelefon);
             		
             		System.out.println("ANABİLİM DALINIZI GİRİNİZ");
             		String ogrencibolum = sc.nextLine();
             		ogrenci1.setBolum(ogrencibolum);
             		
             		System.out.println("KAYIT YILINIZI GİRİNİZ");
             		int ogrencikayıtyılı = sc.nextInt();
             		ogrenci1.setKayityili(ogrencikayıtyılı);
             		
             		System.out.println("Öğrenci numaranızı giriniz");
             		int ogrencino = sc.nextInt();
             		ogrenci1.setNumara(ogrencino);
             		
             		sc.nextLine();
             		
                    System.out.println("Randevu almak için alttaki değerleri giriniz");
        			System.out.println("1 - Randevu tarihini giriniz");
        			String tarih = sc.nextLine();
        		    System.out.println("2 - Randevu baslangıc saatini giriniz");
        			String saat = sc.nextLine();
        			System.out.println("3 - Randevu bitiş saatini giriniz");
        			String bitissaat = sc.nextLine();
        			 
        			 ogrenci1.randevual(akademisyen1, tarih, saat, bitissaat);
        			 break;
        		 
        		 }
        	
        		else if(sayı == 3) {
        			sc.nextLine();
        			
        			System.out.println("AD GİRİNİZ");
             		String ogrenciad = sc.nextLine();
             		
             		
             		System.out.println("SOYAD GİRİNİZ");
             		String ogrencisoyad = sc.nextLine();
             		
                    System.out.println("E-POSTA GİRİNİZ");
             		String ogrencieposta = sc.nextLine();
             		
             		System.out.println("TELEFON NUMARASI GİRİNİZ");
             		String ogrencitelefon = sc.nextLine();
             		
             		
             		System.out.println("ANABİLİM DALINIZI GİRİNİZ");
             		String ogrencibolum = sc.nextLine();
             		
             		
             		System.out.println("KAYIT YILINIZI GİRİNİZ");
             		int ogrencikayıtyılı = sc.nextInt();
             		
             		
             		System.out.println("Öğrenci numaranızı giriniz");
             		int ogrencino = sc.nextInt();
             		@SuppressWarnings("unused")
					ogrenci ogrenci2 = new ogrenci(ogrenciad,ogrencisoyad,ogrencieposta,ogrencitelefon,ogrencibolum,ogrencikayıtyılı,ogrencino);
             		System.out.println("Kayıt başarılı..");
             		break;
        		}
        	
        		else if(sayı == 4) {
        			System.out.println("Lütfen sırasıyla istenen bilgileri giriniz");
            		System.out.println("AD GİRİNİZ");
            		String adsc = sc.nextLine();
            		
            		sc.nextLine();
              		System.out.println("SOYAD GİRİNİZ");
            		String soyadsc = sc.nextLine();
            		
            		System.out.println("E-POSTA GİRİNİZ");
            		String epostasc = sc.nextLine();
            		
            		System.out.println("TELEFON NUMARASI GİRİNİZ");
                	String telefonsc = sc.nextLine();
                	
            		System.out.println("ANABİLİM DALINIZI GİRİNİZ");
            		String bolumsc = sc.nextLine();
            		
            		System.out.println("ÜNVANINIZI GİRİNİZ");
            		String unvansc = sc.nextLine();
            		
            		System.out.println("AKADEMİSYEN SİCİL NUMARANIZI GİRİNİZ");
                    int sicilnosc = sc.nextInt();
                 	
                 	
                 	@SuppressWarnings("unused")
					akademisyen ak1 = new akademisyen(adsc,soyadsc,epostasc,telefonsc,sicilnosc,unvansc,bolumsc);
                 	System.out.println("Kayıt başarılı..");
        			break;
        			
        		} 
        	
        		else if(sayı == 5) {
        			ogrenci1.randevulistele();
        			listele(akademisyen1);
        			break;
        		}
        		
        		 
        		 
        		
        	}
        	
        }
	

    public static void listele(kisi k) throws IOException {
    	String type = null;
	   if(k instanceof akademisyen) {
		  type = "akademisyen";
	   }
	   if(k instanceof ogrenci) {
		   type = "öğrenci";
	   }
	    
	   File f = new File(type+".txt");
	   FileReader fr = new FileReader(f);
	   BufferedReader br = new BufferedReader(fr);
	   String line;
	   while((line = br.readLine())!=null){
		   System.out.println(line);
	   }
	   br.close();
	  }
   
   public ArrayList<String> ogroku() throws IOException {
	   
	   ArrayList<String> Stringlist = new ArrayList<String>();
	   File f  = new File("öğrenci.txt");
	   FileReader fr = new FileReader(f);
	   BufferedReader br = new BufferedReader(fr);
	   String line;
	   
	   while ((line = br.readLine()) != null) {
		   Stringlist.add(line);
	   }
	   
	   br.close();
	   return Stringlist;
	   
   }


}



