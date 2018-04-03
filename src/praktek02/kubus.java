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

    public kubus(double rusuka, double rusukb, double rusukc) {
        this.rusuka = rusuka;
        this.rusukb = rusukb;
        this.rusukc = rusukc;
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
