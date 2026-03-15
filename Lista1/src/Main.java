

public class Main {
    public static void main(String[] args) {
        Elemento e1 = new Elemento();

        e1.setValor(10.0);

        Elemento e2 = new  Elemento();

        e2.setValor("oi");

        System.out.print(e1.somador(e2));
    }
}