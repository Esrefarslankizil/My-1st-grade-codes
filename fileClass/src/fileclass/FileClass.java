
package fileclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class FileClass {

    
    public static void main(String[] args)throws IOException ,Exception {
        //    DOSYA İŞLEMLERİ 
        // 1. DOSYA OLUŞTURMA İŞLEMLERİ
        // 2. DOSYA YAZMA İŞLEMLERİ
        // 3. DOSYA OKUMA İŞLEMLERİ
        // EK.1: Dosyalarin silinmesi
        // EK.2: Dosyalarin kapatilmasi
        
       dosyaOlusturma();
       dosyaYazdir();
       dosyaYazdir2();
       dosyaYazdir3();
       dosyaOkuma();
        System.out.println("dosyayı silmek için 1 e devam etmek için 2 ye basın ");
        Scanner klavye = new Scanner(System.in);
       int silinsinmi = klavye.nextInt();
      boolean dongu ;
       do{
           
            if (silinsinmi==1) {
                dosyaSil(silinsinmi);
                dongu = false;
            }else if(silinsinmi==0){
                dosyaSil(0);
                dongu=false;
            }else{
                dongu =true;
            }
            
        }while(dongu);
        
    }
    
     //>>>>> 1- DOSYA OLUŞTURMA<<<<<<<<<<<
public static void dosyaOlusturma ()throws IOException{
    String pathname = "src\\fileclass\\deneme.txt" ;
    File dosya = new File(pathname) ;
    try {
        dosya.createNewFile();
        if (dosya.createNewFile()) {
            System.out.println("dosya olusturuldu ");
        }else{
            System.out.println(" dosya mevcut !");
        }
    } catch (IOException e) {
        System.out.println("dosya olusturulama hatası  "+e.getMessage());
    }
    
}

    //>>>>> 2.1. FileWriter <<<<<
    //
    public static void dosyaYazdir ()throws Exception{
        
        String pathname = "src\\fileclass\\deneme.txt" ;
      File file = new File(pathname);
        FileWriter fw = null ;
        try {
            fw = new FileWriter(file) ;
            for (int i = 0; i < 10; i++) {
                fw.write((i+1)+". kelime \n");
            }
        } catch (Exception e) {
            System.out.println("dosya yazdirma basarisiz "+e.getMessage());
        }finally{
            fw.close();
        }
    }
    
     //>>>>> 2.2. FileWriter <<<<<
    //var olan dosyanın üzerine yazar 
    public static void dosyaYazdir2 ()throws Exception{
        String pathname = "src\\fileclass\\deneme.txt";
        File file = new File(pathname) ;
        FileWriter fw = null ;
        
        try {
            fw = new FileWriter(file,true );
            for (int i = 0; i < 10; i++) {
                fw.write((i+1)+". kelime \n");
            }
        } catch (Exception e) {
            System.out.println("dosya uzerine yazma hatası ");
        }finally {
            fw.close();
        }
        
    }
    //>>>>> 2.3. PrintWrite <<<<<
    //var olan dosyadaki veri leri siler ve yerine yenilerini yazdirir 
    public static void dosyaYazdir3(){
        String pathname = "src\\fileclass\\deneme.txt" ;
        File file = new File(pathname);
        PrintWriter pw = null  ;
        try {
            pw = new PrintWriter(file);
            for (int i = 0; i < 10; i++) {
                pw.write((i+1)+". kelime \n");
            }
        } catch (Exception e) {
            System.out.println("dosya yazdirma islemi basarisiz ");
        }finally {
            pw.close();
        }
    }
    //>>>>> 3.1. Scanner  <<<<<
    
    public static void dosyaOkuma () throws FileNotFoundException{
        String pathname = "src\\fileclass\\deneme.txt" ;
        File file = new  File(pathname);
        Scanner scanner = new Scanner(file);
        
        try {
            while(scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        } catch (Exception e) {
        }finally{
           scanner.close();
        }
        
    }
    //>>>>> 3.1. Dosya Silme  <<<<<
    public static void dosyaSil(int silinsinmi){
      
        String pathname = "src\\fileclass\\deneme.txt";
       File file = new File(pathname);
        
        if (silinsinmi==1) {
           file.delete();
        }else if(silinsinmi==0){
            System.out.println("dosya silinmiştir ");
        }else{
            System.out.println("gecersiz giris ");
        }
}
    
}
