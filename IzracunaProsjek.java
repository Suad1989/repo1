package googledrive;
import java.util.Scanner;

public class IzracunaProsjek {
    
    public static void main(String[] args) {
        // Kreiraj Scanner objekat
    Scanner unos = new Scanner(System.in);
    
    // izbaci pitanje korisniku
    System.out.println("Unesite tri decimalna broja: ");
    // dodijeli korisnikov unos varijablama
    double broj1, broj2, broj3;
    broj1 = unos.nextDouble();
    broj2 = unos.nextDouble();
    broj3 = unos.nextDouble();
    
    // izracunaj prosjek tri broja
    double prosjek;
    prosjek = (broj1 + broj2 + broj3) /3;
    
    // ispisi rezultat korisniku
        System.out.println("Prosjek brojeva " + broj1 +" " + broj2 +" "+broj3+" je " + prosjek);
        
        // zatvori Scanner
        unos.close();
    }   
}
    
