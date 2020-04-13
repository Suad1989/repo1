package googledrive;
import java.util.Scanner;

public class SekundeUMinute {
    public static void main(String[] args) 
    {
        
        // Kreiraj Scanner objekat
        Scanner unos = new Scanner(System.in);
        
        // izbaci pitanje korisniku da unese broj sekundi
        System.out.println("Unesite broj sekundi kao cijeli broj: ");
        
        // dodijeli korisnikov unos varijabli sekunde
        int sekunde = unos.nextInt();
        
        //nadji broj minuta
        int minute = sekunde / 60;
        
        // nadji broj preostalih sekundi
        int preostaleSekunde = sekunde / 60;
        
        // ispisi rezultat korisniku
        System.out.println(sekunde + " sekundi je " + minute + "minuta i " + preostaleSekunde + " sekundi." );
        
        // Zatvori Scanner
        unos.close();
    }
}
