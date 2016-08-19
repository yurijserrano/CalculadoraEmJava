
public class TesteCalculadora {

    public static void main(String[] args) {
        Calculadora cal = new Soma(3.0, 2.0);
        System.out.println(cal.calcula());
        cal = new Divisao(3.0, 2.0);
        System.out.println(cal.calcula());
        cal = new Subtracao(3.0, 2.0);
        System.out.println(cal.calcula());
        cal = new Multiplicacao(3.0, 2.0);
        System.out.println(cal.calcula());
    }

}
