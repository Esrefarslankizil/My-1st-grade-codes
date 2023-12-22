
package matrisler;

import java.util.Random;
import java.util.Scanner;


public class Matrisler {

    
    public static void main(String[] args) {
       
      /* satır ve sütun sayısını kullanıcıdan aldıran ve en büyük ve en kücük 
      elamanları nı adresleriyle birlikte yazdıran programın java kodu */
      Scanner klavye1 = new Scanner(System.in);
      Random rnd1 = new Random();
      System.out.print(" lütfen satir sayıyısını girin : ");
        int satira = klavye1.nextInt();
        
        System.out.print(" lütfen sutun satısını girin :");
      int sütun = klavye1.nextInt();
      
      int [][]matrisa = new int[satira][sütun];
        for (int i = 0; i < satira ; i++) {
            for (int j = 0; j < sütun; j++) {
              matrisa[i][j]=   rnd1.nextInt(0,100);
            }
        }
     int indexIb = 0;
     int indexJb=0;
     int indexIk =0;
     int indexJk =0;
        int enBuyuk = matrisa[0][0] ;
        for (int i = 0; i < satira; i++) {
            for (int j = 0; j < sütun; j++) {
               if(matrisa[i][j]>enBuyuk) {
                   enBuyuk = matrisa[i][j];
                   indexIb = i;
                   indexJb= j;
               }
            }
            
        }
        System.out.println("["+indexIb+"]"+"["+indexJb+"]  :"+enBuyuk );
       
        int enKucuk = matrisa[0][0];
        for (int i = 0; i < satira ; i++) {
            for (int j = 0; j < sütun ; j++) {
                if(matrisa[i][j]<enKucuk){
                    enKucuk = matrisa[i][j];
                    indexIk=i;
                    indexJk = j;
                }
            }
        }
        System.out.println("["+indexIk+"]"+"["+indexJk+"]  :"+enKucuk);
        
        System.out.println("------------------------------------------------------------");
       
        
        System.out.println(" matris yazdırma dizi değer ataması yapılmadan  ");
        
        int [][]gosterme = new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+i+"]"+"["+j+"] :"+gosterme[i][j]+"  ");
            }System.out.println();
        }
        
        System.out.println("-----------------------------------------");
        
        System.out.print(" lütfen dizi boyutunu girin :");
        int boyut2 = klavye1.nextInt();
        
        int satirm = boyut2 ;
        int sutunm = boyut2 ;
        int [][]matrism = new int[satirm][sutunm];
        
        for (int i = 0; i < satirm; i++) {
            for (int j = 0; j < sutunm; j++) {
                if(i ==0 || j ==0 || i == satirm-1|| j ==sutunm-1){
                    matrism[i][j]=0;
                }else{
                    matrism[i][j]=1;
                }
            }
        }
        
        for (int i = 0; i < satirm; i++) {
            for (int j = 0; j < sutunm; j++) {
                System.out.print(matrism[i][j]+" ");
            }System.out.println();
        }
        System.out.println("--------------------------------------------"); 
       
        System.out.println(" çarpım tablosu oluşturuluyor :");
        int [][]carpim = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                carpim[i][j] = (i+1)*(j+1) ;
            }
        }
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(carpim[i][j]+" ");
            }System.out.println();
        }
      
        System.out.println("----------------------------------------------");
        
       // 0 100 arası rastgele deger atanan ve buyuktun kucuge sıralanan bir matris
      Random rnd = new Random();
             Scanner klavye = new Scanner(System.in);
     
             System.out.print("lütfen satir boyutunu girin :");
        int satir = klavye.nextInt();
        
             System.out.print("lütfen sutun boyutunu girin :");
        int sutun = klavye.nextInt();
        //matris olusturuluyor 
        int [][]matris = new int[satir][sutun];
             for (int i = 0; i < satir; i++) {
                 for (int j = 0; j < sutun; j++) {
                     matris[i][j]= rnd.nextInt(0,100);
                 }
             }
        // martris dizinin içine yerleştiriliyor 
             int []dizi = new int[satir*sutun];
             int a =0;
             for (int i = 0; i < satir; i++) {
                 for (int j = 0; j < sutun; j++) {
                     dizi[a] = matris[i][j];
                     a++;
                 }
             }
        // dizi kucukten buyuge sıralanıyor 
             int temp; 
             System.out.println("matris buyukten kucuge sıralanıyor ...");
             for (int i = 0; i < dizi.length; i++) {
                 for (int j = i+1; j < dizi.length; j++) {
                     if(dizi[i]<dizi[j]){
                         temp = dizi[i];
                         dizi[i]= dizi[j];
                         dizi[j]= temp ;
                     }
                     
                 }
                 
             }
        // dizi tekrar matrise donusturuluyor      
            int b = 0;
             for (int i = 0; i < satir; i++) {
                 for (int j = 0; j < sutun; j++) {
                     matris[i][j]= dizi[b];
                     b++;
                 }
             }
        // matris yazdırılıyor  
             System.out.println("matris buyukten kucuge yazdiriliyor ...");    
        for (int i = 0; i < satir ; i++) {
                 for (int j = 0; j < sutun; j++) {
                     System.out.print(matris[i][j]+"  ");
                 }System.out.println();
             }
        // dizi tekrar ters cevriliyor buyukten kucuge olması için 
        int tempp ;
             for (int i = 0; i < dizi.length/2; i++) {
                 temp = dizi[i];
                 dizi[i]=dizi[dizi.length-i-1];
                 dizi[dizi.length-i-1]= temp ;
                        
             }
             
             // dizi matrisin icine 2. kez yerlestiriliyor 
             int c = 0;
             for (int i = 0; i < satir; i++) {
                 for (int j = 0; j < sutun; j++) {
                     matris[i][j]= dizi[c];
                     c++;
                 }
             }
             // matris yazdiriliyor 
             for (int i = 0; i < satir; i++) {
                 for (int j = 0; j < sutun; j++) {
                     System.out.print(matris[i][j]+" ");
                 }System.out.println();
             }
        
        
        
        
        
        
        
    }
    
}
