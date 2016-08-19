public  class Divisao extends Calculadora{

    public Divisao(double numero1, double numero2) {
        super(numero1, numero2);
    }

    @Override
    public double calcula() {
        return numero1 / numero2;
    }
    
}