
package para.üstü;

import java.util.Scanner;


public class ParaÜstü {

    
    public static void main(String[] args) {
   Scanner klavye = new Scanner(System.in);
   
        System.out.println("tutar girin");
        int tutar = klavye.nextInt();
        
        int ikiyuzluk = tutar/200 ;
        if(ikiyuzluk>0){
            System.out.println(ikiyuzluk+" adet 200");
            tutar =tutar%200;
        }
        int yuzluk=tutar/100;
        if(yuzluk>0){
            tutar=tutar%100;
            System.out.println(yuzluk+" adet 100");
        }
       int onluk = tutar/10;
       if(onluk>0){
           tutar=tutar%10;
           System.out.println(onluk+" adet 10");
       }
       int birlik = tutar/1;
       if(tutar>0){
           System.out.println(birlik+" adet 1");
           
       }
   
    }
    
}
