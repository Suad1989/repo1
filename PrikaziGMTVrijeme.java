package googledrive;

public class PrikaziGMTVrijeme {
    public static void main(String[] args) {
        
        // Dodati ukupan broj milisekundi od 01. januara 1970.
        long ukupnoMiliSekundi = System.currentTimeMillis();
        
        // Dobiti ukupan broj sekundi od 1.jaunara 1970.
        long ukupnoSekundi = ukupnoMiliSekundi / 1000;
        
        // Izracunati trenutnu sekundu
        long trenutnoSekundi = ukupnoSekundi % 60;
        
        // Dobiti ukupan broj minuta od 01. januara 1970.
        long ukupnoMinuta = ukupnoSekundi / 60;
       
        // Izracunati trenutnu minutu
        long trenutnoMinuta = ukupnoMinuta % 60;
        
        // Dobiti ukupan broj sati od 01. januara 1970.
        long ukupnoSati = ukupnoMinuta / 60;
        
        // Izracunati trenutni sat
        long trenutniSati = ukupnoSati % 24;
        
        // Prikazi rezultat
        System.out.println("Trenutno GMT vrijeme je: " + trenutniSati + ":" + trenutnoMinuta + ":" + trenutnoSekundi + " GMT");
         
        
    }
    
}
