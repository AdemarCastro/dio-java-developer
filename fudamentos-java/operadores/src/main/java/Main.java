import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String nome = "Gleyson"; // Apenas letras
        int idade = 22; // Apenas números
        double peso = 68.5; // Aceite números decimais
        char sexo = 'M'; // Apenas uma letra
        boolean doadorOrgao = false; // True ou False
        Date dataNascimento = new Date(); // Tipo data, captura de uma biblioteca

        // Operadores aritméticos

        // + SOMA, - SUBTRAÇÃO , * MULTIPLICAÇÃO, / DIVISÃO, % RESTO (MODULO)

        // concat = Contatena duas ou mais strings ou numeros

        // Ao somar números com o "+" ele sempre irá validar primeiro a opração matemática, mas ao utilizar uma string no meio o comportamente irá mudar para a concatenação. Para uma melhor leitura a utilização do concat é uma boa prática.


        // Posso tornar números negativos

        int numero = 5;
        numero = -5;

        System.out.println("Negativo: ".concat(String.valueOf(numero)));

        // Para tornar o número positivo preciso realizar uma multiplicação

        numero = -1 * numero;

        System.out.println("Positivo: ".concat(String.valueOf(numero)));

        // ++ : Incremento de valor

        numero ++;
        System.out.println("Incremento: ".concat(String.valueOf(numero)));

        // -- : Decremento de valor

        numero --;
        System.out.println("Decremento: ".concat(String.valueOf(numero)));

        // Inverter valor da variável booleana

        boolean variavel1 = true;
        System.out.println("Inversão de Boolean: "+!variavel1);

        // Operador Ternário

        // <Expressão condicional> ? <Caso seja verdadeira> : <Caso seja falsa>

        String resultado = variavel1 == true ? "verdadeira" : "falsa";

        // variavel1 é true pois eu mudei de true para false apenas na saida do sout. Para mudar de true para false no método eu preciso passar para variavel através do =.
        System.out.println("Resultado: "+resultado);

        // > : Verifica se é maior
        // < : Verifica se é menor
        // >= : Verifica se é maior ou igual
        // <= : Verifica se é menor ou igual

        String x = numero >= 10 ? "Verdadeiro" : "Falso";
        System.out.println("É maior ou igual? "+x);

        // Comparar

        String nomeUm = "ADEMAR";
        String nomeDois = new String("ADEMAR");

        System.out.println(nomeUm.equals(nomeDois)); // Compara e diz se são iguais

        // Quando formos comparar objetos é melhor usar o Equals, pois ele compara o conteudo

        // Operadores Lógicos

        // && = E
        // || = OU

        boolean condicaoUm = true;
        boolean condicaoDois = false;

        if(condicaoUm && condicaoDois){
            System.out.println("As duas condições são verdadeiras.");
        }else if(condicaoUm || condicaoDois){
            System.out.println("Uma das condições é verdadeira.");
        }

        if(condicaoUm && ( 7 > 4 )){
            System.out.println("As duas condições são verdadeiras.");
        }


    }

}