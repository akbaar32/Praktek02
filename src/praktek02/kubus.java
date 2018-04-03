package praktek02;
public class kubus {
    double rusuka;
    double rusukb;
    double rusukc;

    public kubus() {
        rusuka=9;
        rusukb=10;
        rusukc=8;
    }
    
    
    
    void cetakinfo(){
        System.out.println("=========================");
        System.out.println("Rusuk A = "+rusuka);
        System.out.println("Rusuk B = "+rusukb);
        System.out.println("Rusuk C = "+rusukc);
        System.out.println("=========================");
    }
    
    double hitungvolume(){
        double volume;
        volume= rusuka*rusukb*rusukc;
        return volume;
    }
    void cetakvolume(){
        System.out.println("Volume nya adalah="+hitungvolume());
    }
    
}
