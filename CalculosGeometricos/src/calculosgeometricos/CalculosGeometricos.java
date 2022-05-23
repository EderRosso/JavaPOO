
package calculosgeometricos;

public class CalculosGeometricos {

    public static void main(String[] args) {
      Retangulo retangulo = new Retangulo(10,10);
      Circulo circulo = new Circulo(3.5);
      Quadrado quadrado = new Quadrado(12);

      System.out.println("\nCirculo: ");
      System.out.println("Perimetro: "+circulo.calculaPerimetro());
      System.out.println("Area: "+circulo.calculaArea());

      System.out.println("\nRetangulo:");
      System.out.println("Perimetro: "+retangulo.calculaPerimetro());
      System.out.println("Area: "+retangulo.calculaArea());
      
      System.out.println("\nQuadrado:");
      System.out.println("Perimetro: "+quadrado.calculaPerimetro());
      System.out.println("Area: "+quadrado.calculaArea());
     
    }
    
}
