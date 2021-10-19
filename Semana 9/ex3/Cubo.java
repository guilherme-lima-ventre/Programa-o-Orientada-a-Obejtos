package geometria;

public class Cubo implements Comparable<Cubo> {
   private double lado;

   public Cubo(double lado) {
      this.lado = lado;
   }
   public double area() {
      return 6*this.lado*this.lado;
   }
   @Override
   public int compareTo(Cubo c) {
      return (int) (this.area() - c.area());
   }
   @Override
   public String toString() {
      return (String.format("cubo de area %.1f", area()));
   }
}
