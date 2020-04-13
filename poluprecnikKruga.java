package googledrive;
import java.util.Scanner;
public class poluprecnikKruga {

    public static void main(String[] args) 
    {
        // Korak 1: Ucitati poluprecnik
        // Korak 2: Izracunati povrsinu
        // Korak 3: Ispisati rezultat
        
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite vrijednost poluprecnika: ");
        
        // dodijeli vrijednost koju korisnik unese varijabli poluprecnik
        double poluprecnik = unos.nextDouble();
        
        //izracunaj povrsinu
        double povrsina = poluprecnik * poluprecnik * 3.14159;
        
        // ispisi rezultat
        
        System.out.println("Povrsina kruga poluprecnika " + poluprecnik + " iznosi: " + povrsina);
    }
    
}
