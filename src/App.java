
import java.util.Random;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class App {
    
    public static void main(String[] args) throws Exception {
        Scanner tangentbord = new Scanner(System.in);
        Random slump = new Random();

        int Spelarpoäng = 0;
        int Datorpoäng = 0;

        System.out.println("-Starta spel genom att välja mellan Sten, Sax eller Påse-");
        
        
        while (Spelarpoäng<3 && Datorpoäng<3){

            System.out.println("Kör igen tills någon når 3 poäng");
            System.out.println(+Spelarpoäng+ " - "+ Datorpoäng);
            System.out.println("1-sten");
            System.out.println("2-Sax");
            System.out.println("3-Påse");
    
    
            int Slumptal = slump.nextInt(3);
                Slumptal = Slumptal + 1;
            int Val = tangentbord.nextInt();

            if(Val==1){
                System.out.println("Du valde Sten");
                if(Slumptal==1){
                    
                    System.out.println("Datorn valde Sten");
                    System.out.println("Oavgjort");
    
                }
                else if(Slumptal==2){
                    
                    System.out.println("Datorn valde Sax");
                    System.out.println("Sten tar sax");
                    Spelarpoäng += 1;
                   

                }
                else if(Slumptal==3){
    
                    System.out.println("Datorn valde Påse");
                    System.out.println("Påse tar sten");
                    Datorpoäng += 1;
                    

                }
            }
            else if(Val == 2){
                System.out.println("Du valde Sax");
                if(Slumptal==1){
                    
                    System.out.println("Datorn valde Sten");
                    System.out.println("Sten tar sax");
                    Datorpoäng += 1;
                    
                
                }
                else if(Slumptal==2){
                    
                    System.out.println("Datorn valde Sax");
                    System.out.println("Oavgjort");
                    
                    
                }
                else if(Slumptal==3){
                   
                    System.out.println("Datorn valde Påse");
                    System.out.println("Påse tar sax");
                    Spelarpoäng += 1;
                    

                }
            }
            else if (Val == 3){
                System.out.println("Du valde Påse");
    
                if(Slumptal==1){
                    
                    System.out.println("Datorn valde Sten");
                    System.out.println("Påse tar sten");
                    Spelarpoäng += 1;
                    

                }
                else if(Slumptal==2){
                    
                    System.out.println("Datorn valde Sax");
                    System.out.println("Sax tar påse");
                    Datorpoäng += 1;
                    
                }
                else if(Slumptal==3){
                    
                    System.out.println("Datorn valde Påse");
                    System.out.println("Oavgjort");
                    
                    
                }
            }
        }
        if (Spelarpoäng==3){
            System.out.println("Du van över Datorn");
            System.out.println(+Spelarpoäng+ " - "+ Datorpoäng);
        }
        else if(Datorpoäng==3){
            System.out.println("Datorn van över dig");
            System.out.println(+Spelarpoäng+ " - "+ Datorpoäng);
        }
    }
}