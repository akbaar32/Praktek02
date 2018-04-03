package praktek02;

public class kubusaksi {
    public static void main(String[] args) {
        kubus k1 = new kubus();
        k1.rusuka=13;
        k1.rusukb=17;
        k1.rusukc=14;
        
        k1.cetakinfo();
        System.out.println("Volume Kubus ="+k1.hitungvolume());
    }
    
}
