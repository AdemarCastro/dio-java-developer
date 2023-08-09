public class App {
    public static void main(String[] args){

        System.out.println("Olá mundo!");

        /* 
         **Terminal em Java:**

            O "terminal" em Java refere-se ao ambiente de linha de comando (também conhecido como prompt de comando) onde você pode interagir com o sistema operacional através de comandos digitados manualmente. Em sistemas Windows, o terminal é chamado de "Prompt de Comando" ou "CMD", enquanto em sistemas Unix/Linux/Mac, é conhecido como "Terminal" ou "Shell".

            No terminal, você pode executar comandos para várias tarefas, como navegar pelos diretórios, criar, excluir e copiar arquivos, compilar e executar programas Java e executar várias outras operações relacionadas ao sistema.

            **Argumentos de Linha de Comando em Java:**

            Argumentos de linha de comando são informações passadas para um programa Java quando ele é executado a partir do terminal ou prompt de comando. Esses argumentos permitem que você forneça informações adicionais ao programa enquanto ele está sendo executado. Os argumentos são fornecidos após o nome do programa Java na linha de comando.

            Aqui está um exemplo de como executar um programa Java com argumentos de linha de comando:

            Suponha que você tenha um programa Java chamado "MeuPrograma.java" e deseja passar dois números inteiros como argumentos para o programa.

            ```java
            public class MeuPrograma {
                public static void main(String[] args) {
                    if (args.length == 2) {
                        int num1 = Integer.parseInt(args[0]);
                        int num2 = Integer.parseInt(args[1]);
                        int resultado = num1 + num2;
                        System.out.println("A soma dos números é: " + resultado);
                    } else {
                        System.out.println("Por favor, insira dois números como argumentos.");
                    }
                }
            }
            ```

            Para executar o programa acima com argumentos de linha de comando, siga estes passos:

            1. Compile o programa usando o comando `javac` no terminal:

            ```
            javac MeuPrograma.java
            ```

            2. Em seguida, execute o programa usando o comando `java` seguido pelos argumentos desejados:

            ```
            java MeuPrograma 10 20
            ```

            O programa será executado e imprimirá a soma dos números 10 e 20, que é 30.

            No exemplo acima, os números 10 e 20 são passados como argumentos para o programa "MeuPrograma". Esses argumentos são recebidos pelo método `main` como uma matriz de strings chamada `args`. O programa então processa esses argumentos para realizar a soma e imprimir o resultado.

            Os argumentos de linha de comando são úteis quando você deseja fornecer informações específicas para o programa durante a execução, em vez de codificar essas informações diretamente no código-fonte. Eles permitem que o programa seja mais flexível e interaja com o usuário ou com outros programas de uma maneira mais dinâmica.
         */

    }
}
