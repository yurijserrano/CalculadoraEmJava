public abstract class Calculadora {
    protected double numero1;
    protected double numero2;
     public Calculadora(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    public abstract double calcula();

   
    
}
