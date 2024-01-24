
package finalodev;

import java.util.Scanner;


public class Finalodev {

    
    public static void main(String[] args) {
       Scanner klavye = new Scanner(System.in);
        
       /* System.out.print("1 . sayiyi girin :");
        int sayi1 = klavye.nextInt();
        
        System.out.print("2. sayiyi girin :");
        int sayi2 = klavye.nextInt();
        
        int sonuc = sayi1 +sayi2;
        System.out.println("sonucunuz :"+sonuc);*/
       
       /* for (int i = 0; i < 5; i++) {
            System.out.println("Hello world ");
        }*/
       /* System.out.print("lutfen sayi giriniz :");
        int sayi = klavye.nextInt();
        
        int sonuc = sayi*sayi;
        System.out.println("sonucunuz :"+sonuc);*/
       
       /* System.out.print("1. kenari girin :");
        int kenar1 = klavye.nextInt();
        
        System.out.print("2. kenari girin :");
        int kenar2 = klavye.nextInt();
        
        int kenar3 = kenar1*kenar1+kenar2*kenar2;
        double kenar= Math.sqrt(kenar3);
        System.out.println("hipotenus = "+kenar);*/
       /* System.out.print("sayi girin :");  
        int sayi = klavye.nextInt();
        
        int kalan = sayi%2;
        if(kalan==0){
            System.out.println("sayi çifttir ");
        }else{
            System.out.println("sayi çift degildir ");
        }*/
      /*  System.out.print("sayi girin :");
        int sayi = klavye.nextInt();
        
        if(sayi<0){
            sayi = sayi*-1;
        }
        System.out.println("sayinin mutlak degeri :"+sayi);*/
       /* System.out.print("sayi1 gir :");
        int sayi1 = klavye.nextInt();
        System.out.print("sayi2 gir :");
        int sayi2 = klavye.nextInt();
        
        int sonuc = sayi1-sayi2;
        if(sonuc<0){
            sonuc = sonuc*-1;
        }
        System.out.println("sonuc :"+sonuc);*/
      /*  for (int i = 1; i < 100; i++) {
            if(i%2==0){
                System.out.println(i);
            }
        }*/
  /*    int []dizi = new int[11];
      int k = 0;
      for (int i = 0; i < 20; i++) {
            if(i%2==0){
                dizi[k]=i;
                k++;
            }
        }
      for(int elaman : dizi){
          System.out.println(elaman+" ");
      }*/
  int [][]matris = new int[5][2];
        for (int i = 1; i < 21; i++) {
            if(i%2==0){
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 2; k++) {
                 matris[j][k]=i/2;   
                }
            }}
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(matris[i][j]);
            }
        }
       
    }
    
}
