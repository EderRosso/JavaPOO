package calculosgeometricos;

public abstract class Quadrilatero implements FormasGeo{
    private double lado01;
    private double lado02;
    private double lado03;
    private double lado04;
    

    public Quadrilatero(double lado01,double lado02,double lado03,double lado04) {
        this.lado01 = lado01;
        this.lado02 = lado02;
        this.lado03 = lado03;
        this.lado04 = lado04;
    }


    public double calculaPerimetro(double lado01) {
        return this.lado01+this.lado02+this.lado03+this.lado04;
    }
    
}
