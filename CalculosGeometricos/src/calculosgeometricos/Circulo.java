package calculosgeometricos;

public class Circulo implements FormasGeo{
     private double raio;

    public Circulo(double raio) {
        this.raio = raio;
     }

    public double calculaPerimetro() {
        return raio*3.14*2; 
    }
    public double calculaArea() {
        return (raio*raio)*3.14; 
    }
}
