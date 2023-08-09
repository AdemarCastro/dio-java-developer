public class Main {

    public static void main(String[] args) {

        // Java Sintaxe

        byte idade = 123;
        short ano = 2021;
        int cep = 69000255;
        long cpf = 987654651233L; // Precisa terminar com L
        float pi = 3.14F; // Precisa terminar com F
        double salario = 1237.33;

        // Java é fortemente Tipado
        // Caso eu tente passar um valor de um short para um int de variavel em variavel, será necessário utilizar um casting que me fara estar ciente desse fator

        // Variaveis vs Constantes

        // Constantes:
        // 1. Precisa ter "final" no início, 2. A convenção é que o nome da constante deve ser em caixa alta separada por "_".

        final double VALOR_PI = 3.14; // Variavel não pode mudar seu valor

    }

}
