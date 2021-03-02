package requerimiento1;

public class CalcularAreaRec1 {

    public CalcularAreaRec1() {
        super();
    }

    public static void main(String[] args) {
        //  CalcularAreaRec1 calcularAreaRec1 = new CalcularAreaRec1();

        int base = 3;
        int altura = 4;

        int resultadoRec = base * altura;

        int resultadoTriRec = resultadoRec / 2;

        System.out.println("Resultado: " + resultadoRec);
        System.out.println("Resultado: " + resultadoTriRec);

    }
}
