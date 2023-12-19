
package diziler.pkg2;

import java.util.Random;
import java.util.Scanner;


public class Diziler2 {

    
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("Boyut degerini giriniz : ");
        int boyut=klavye.nextInt();
        int []dizi=new int[boyut];
        System.out.println(boyut +" elemanli dizi olusturuluyor...");
        for (int i = 0; i < dizi.length; i++) {
            System.out.print((i+1)+". elemani giriniz : ");
            dizi[i]=klavye.nextInt();
        }
        System.out.println(boyut+ " elemanli dizi yazdiriliyor..."      );
        for (int eleman : dizi) {
            System.out.print(eleman + "  ");
        }
        System.out.println("");
       int temp;
        for(int i = 0;i<dizi.length-1;i++){
            for (int j = i+1; j < dizi.length; j++) {
                if(dizi[j]<dizi[i]){
                  temp = dizi[i];
                  dizi[i]=dizi[j];
                  dizi[j]=temp;
                }
            }
        }
        System.out.println("dizi kucukten buyuge yazdirildi  :");
        for(int elaman :dizi){
           System.out.print(elaman+" ");
       }System.out.println();
       int temp2 ;
        for (int i = 0; i < dizi.length-1; i++) {
            for (int j = i+1; j < dizi.length; j++) {
                if(dizi[j]>dizi[i]){
                  temp2=dizi[i];
                  dizi[i]=dizi[j];
                  dizi[j]=temp2;
                }
                
            }
            
            
            
        }
        System.out.println("dizi buyukten kucuge yazdirildi :");
            for(int elaman :dizi){
                System.out.print(elaman+" ");
            }System.out.println();
        System.out.println("--------------------------------------------");  
        
        
        /* boyut değeri kullanıcı tarafından girilen 1 100 arası rastgele sayılardan oluşan ve tek ve çift 
        sayıları farklı dizilerde gösteren java kodu   */
        
        Random rnd1 = new Random();
        Scanner klavye1 = new Scanner(System.in);
        System.out.print("lütfen dizi boyutunu grin :");
        int boyut1= klavye1.nextInt();
         int []dizi1=new int[boyut1] ;      
        System.out.println(" dizi oluşturuluyor ...");
        for (int i = 0; i <dizi1.length; i++) {
            dizi1[i]=rnd1.nextInt(0,100);
            }
        System.out.println(" dizi gösteriliyor ...");
        for(int elaman1:dizi1){
            System.out.println(elaman1+" ");
        }
       int ciftSayı=0,tekSayı=0;
        for (int i = 0; i < dizi1.length; i++) {
            if(dizi1[i]%2==0){
                ciftSayı++;
            }else{
                tekSayı++;
            }
            
        }
        int []ciftDizi = new int[ciftSayı];
        int []tekDizi = new int[tekSayı];
        
        for (int i = 0; i < dizi1.length; i++) {
           if(dizi1[i]%2==0){
               for (int j = 0; j <dizi1.length ; j++) {
                   ciftDizi[j]=dizi1[i];
                   
               }
           }for (int j = 0; j < tekSayı; j++) {
                
            }
{
               for (int j = 0; j < tekSayı; j++) {
                  tekDizi[j]=dizi1[i]; 
               }
               System.out.println("cift sayı  dizisi yazdırılıyor : ");
               for (int elamanCift : ciftDizi) {
                   System.out.print(elamanCift+" ");
               }System.out.println();
               System.out.println("tek sayı dizisi yazdırılıyor :");
               for(int elamanTek: tekDizi){
                   System.out.print(elamanTek+" ");
               }System.out.println();
           
           
           
           }
        }
        
        
        
        
        
        
    
    
        
        
        
        
        
        
        
        
        
        
    
    
    
    
    }
    
    
    
    }
    

