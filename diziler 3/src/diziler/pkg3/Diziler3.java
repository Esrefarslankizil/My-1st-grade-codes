
package diziler.pkg3;

import java.util.Random;
import java.util.Scanner;


public class Diziler3 {

    
    public static void main(String[] args) {
       Scanner klavye = new Scanner(System.in);
      
       Random rnd = new Random();
       
       System.out.print(" dizi boyutunu girin : ");
        int boyut = klavye.nextInt();
        int []dizi = new int[boyut];
        
        for (int i = 0; i < dizi.length; i++) {
            dizi[i]= klavye.nextInt();
        }
        int tekSayı = 0 , ciftSayı = 0;
        for (int i = 0; i < dizi.length; i++) {
            if(dizi[i]%2==0){
                ciftSayı++ ;
            }else{
                tekSayı++ ;
            }
        }
        int ciftIndex = 0;
        int []ciftDizi = new int[ciftSayı];
        int []tekDizi = new int[tekSayı];
        for (int i = 0; i < dizi.length; i++) {
            if(dizi[i]%2==0){
               ciftDizi[ciftIndex]= dizi[i];
               ciftIndex++;
            }
        }
        int tekIndex = 0;
        for (int i = 0; i < dizi.length; i++) {
            if(dizi[i]%2!=0){
                tekDizi[tekIndex]= dizi[i];
                tekIndex++;
            }
        }
        System.out.println("çift diziler gösteriliyor :");
        for(int elamanCift : ciftDizi){
            System.out.print(elamanCift+" ");
        }System.out.println();
        System.out.println("tek diziler gösteriliyor ");
        for(int elamanTek : tekDizi){
            System.out.print(elamanTek+" ");
        }System.out.println();
        System.out.println("---------------------------------------------------");  
   
    /*int [] dizi = {11,22,33,44,55,66,77,88,99}; dizisini terse çeviren programın 
      java kodu.*/
    
 int []dizi1 = {11,22,33,44,55,66,77,88};
 
        for (int i = 0; i <4; i++) {
           int temp = dizi1[7-i];
            dizi1[7-i] = dizi1[i];
            dizi1[i]= temp;
        }
        for(int elaman1 : dizi1){
            System.out.print(elaman1+"  ");
        }
        System.out.println("----------------------------------------------------------------");
       // boyut değeri klavyeden girilen ve her bir elamnaı farklı olan dizinin  java kodu
        
        
        
        
        System.out.println(" lütfen boyut değerini girin :");
        int boyut2 = klavye.nextInt();
        int []diziFarkli = new int [boyut2];
        int kontrol = 0 ;
        for (int  i = 0;  i < diziFarkli.length;  i++) {
            diziFarkli [i] = rnd.nextInt(0,100);
            for (int j = i-1; j >1; j--) {
                if(diziFarkli[i]==diziFarkli[j]){
                    dizi[i]= rnd.nextInt();
                    j = i+1;
                }
            }
        }
        for( int eleman2 : diziFarkli){
            System.out.print(eleman2+" ");
        }
        
        
        
        
        
        
    }
    
}
