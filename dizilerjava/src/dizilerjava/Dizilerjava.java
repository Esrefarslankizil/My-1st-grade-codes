
package dizilerjava;

import java.util.*;



public class Dizilerjava {

    
    public static void main(String[] args) {
     int []integerDizi = new int[10];
     integerDizi[0]=5;
     
     float []floatDizi = new float[10];
     floatDizi[0]=3.14f;
     
     double []doubleDizi=new double[10];
     doubleDizi[0]=34.5;
     
    String []stringDizi= new String[10];
    stringDizi[0]="ilk bahar";
    
    boolean []booleanDizi= new boolean[10];
    booleanDizi[0]=true;
    
    char []charDizi= new char[10];
    charDizi[0]='a';
     
        System.out.println("-------------------------------");    
        
    int [] diziKısa = {158,2,3,4,5,6};
        System.out.println(diziKısa[0]);   
       
        String []diziMevsimler={"ilkbahar", "yaz","sonbahar","kış"};
        System.out.println(diziMevsimler[0]);
        System.out.println("dizinin uzunluğu :"+diziMevsimler.length);
       
        // dizi elamanlarının klavyeden girilmesi
       // 10 elamanlı bir dizinin klavyeden girilmesi
       Scanner klavye = new Scanner(System.in);
       int []diziGir= new int[10];
       for(int i =0;i<10;i++){
           System.out.print(" dizinin "+(i+1)+ ". terimini giriniz :");
           diziGir[i]=klavye.nextInt();
       }
       
        System.out.println(diziGir[0]);
        
        // dizi elamanlarını rastgele oluşumu
        Random rnd =new Random();
        int []randomDizi= new int[10];
        for(int i=0 ;i<10;i++){
            randomDizi[i]=rnd.nextInt(50);
        }
        for(int i =0;i<10;i++){
            System.out.println("dizinin "+i+". terimi"+randomDizi[i]);
        }
        // dizi elamanlarının yazdırılması 
        
        Random rnd1 = new Random();
        
        int []diziGösterme= new int[10];
        System.out.println("dizi elamanları atanıyor ...");
        for(int i = 0 ; i<10;i++){
            diziGösterme[i]=rnd1.nextInt(100);
            
        }
        for(int i=0;diziGösterme.length>i;i++){
            System.out.println("dizinin "+(i+1)+". elamanı :"+diziGösterme[i]);
        }
        System.out.println("---------------------------------------------------");
        
       int []dizi3= new int[10];
       for(int i =0;i<dizi3.length;i++){
           dizi3[i]=rnd.nextInt(50,100);
       }
       for(int elaman :dizi3){
           System.out.println(elaman+ "   ");
       }    
        System.out.print("dizinin elaman sayısını girin :");    
        int diziBoyutu =klavye.nextInt();
        int []dizi4 = new int[diziBoyutu];
        for(int i =0;i<dizi4.length;i++){
            dizi4[i]=rnd.nextInt(10);
        }
        for(int i =0;i<dizi4.length;i++){
            System.out.println(dizi4[i]);
        }
                
        
       
       
        
        
  
    }
    
}
