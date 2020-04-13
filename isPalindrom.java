package googledrive;
import java.util.Scanner;

public class isPalindrom {
    
    public static void main(String[] args) {
        
        //napraviti novi Scanner objekat
        Scanner unos = new Scanner(System.in);
        
        // pitati korisnika da unese string
        System.out.println("Unesite string koji zelite provjeriti: ");
        // dodijeliti unos varijabli
        String korisnik = unos.nextLine();
        
        // uzeti indekse prvog i zadnjeg stringa
        int donjiKarakter = 0;
        int gornjiKarakter = korisnik.length() -1;
        
        boolean isPalindrom1 = true;
        
        // izvrsavamo petlju sve dok ne provjerimo sve indekse
        while (donjiKarakter < gornjiKarakter) {
            // ukoliko se karakteri ne podudaraju, nemamo palindrom i prekidamo
            if (korisnik.charAt(donjiKarakter) != korisnik.charAt(gornjiKarakter)) {
                isPalindrom1 = false;
                break;
            }
            
            //povecaj indeks za 1
            donjiKarakter++;
            // smanji indeks za 1
            gornjiKarakter--;
        }
        
        // ukoliko je unijeti string palindrom
        if (isPalindrom1){
            System.out.println(korisnik + " je palindrom");
        }
        // ukoliko nije palindrom
        else {
            System.out.println(korisnik + " nije palindrom");
        }
        
        // zatvoriti Scanner
        unos.close();
    }
    
}
