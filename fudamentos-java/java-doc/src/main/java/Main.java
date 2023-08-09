public class Main {

//    **1. Documento oficial**
//
//    O Documento oficial do JavaDoc é um guia fornecido pela Oracle (anteriormente Sun Microsystems) que descreve a sintaxe, as tags e as convenções utilizadas para a criação de documentação em Java usando o JavaDoc. Esse documento é uma referência essencial para desenvolvedores Java que desejam utilizar o JavaDoc de forma eficaz para documentar seus códigos.
//
//**2. Tags**
//
//    As tags são elementos especiais usados nos comentários do JavaDoc para fornecer informações adicionais sobre as classes, métodos, campos, parâmetros, retornos e exceções em um código Java. As tags começam com o símbolo "@" seguido do nome da tag, e são usadas para adicionar informações estruturadas à documentação.
//
//    Alguns exemplos comuns de tags do JavaDoc são:
//
//            - `@param`: Usada para descrever um parâmetro de um método.
//            - `@return`: Usada para descrever o valor de retorno de um método.
//            - `@throws` ou `@exception`: Usada para descrever exceções que um método pode lançar.
//- `@see`: Usada para fornecer referências a outros elementos do código ou documentos externos.
//            - `@deprecated`: Usada para indicar que um elemento não é mais recomendado para uso e será removido em versões futuras.
//
//    Existem muitas outras tags do JavaDoc disponíveis para diferentes finalidades. O Documento oficial do JavaDoc (conforme mencionado no ponto 1) contém uma lista completa de tags e suas descrições.
//
//            **3. Tipos de comentários**
//
//    Existem dois principais tipos de comentários no Java que são relevantes para a criação de documentação usando o JavaDoc:
//
//    a) Comentários de bloco: São iniciados por `/**` e terminados por `*/`. Esses comentários são usados para criar documentações extensivas para classes, interfaces, métodos, campos e outros elementos do código. O JavaDoc interpreta esses comentários para gerar a documentação em HTML.
//
//    Exemplo de comentário de bloco:
//
//            ```java
//    /**
//     * Esta é a classe MinhaClasse, que demonstra o uso do JavaDoc.
//     */
//    public class MinhaClasse {
//        // ...
//    }
//```
//
//    b) Comentários de linha: São iniciados por `//`. Esses comentários são usados para fornecer descrições concisas para parâmetros, retornos, exceções e outras informações relevantes em um método ou classe.
//
//    Exemplo de comentário de linha:
//
//            ```java
//    /**
//     * Este método soma dois números inteiros.
//     *
//     * @param a O primeiro número inteiro.
//     * @param b O segundo número inteiro.
//     * @return A soma dos dois números inteiros.
//     */
//    public int somar(int a, int b) {
//        // ...
//    }
//```
//
//        **4. Javadoc**
//
//    O Javadoc é a ferramenta utilizada para processar os comentários do JavaDoc e gerar a documentação em formato HTML. Ele é fornecido como parte do JDK e pode ser executado a partir da linha de comando para criar a documentação de um projeto Java.
//
//    A utilização do Javadoc é simples: após escrever os comentários JavaDoc em seu código, você executa o comando `javadoc` seguido do nome do arquivo .java que contém as classes que deseja documentar. O Javadoc irá analisar esses arquivos, processar os comentários JavaDoc e gerar a documentação em HTML.
//
//    Exemplo de uso do Javadoc:
//
//    Suponha que temos o arquivo `MinhaClasse.java` com os comentários JavaDoc. Para gerar a documentação, digite o seguinte comando no terminal:
//
//            ```
//    javadoc MinhaClasse.java
//```
//
//    O Javadoc criará os arquivos HTML resultantes e os salvará em um diretório chamado `docs`, pronto para serem visualizados em um navegador web.
//
//    Concluindo, o JavaDoc é uma ferramenta essencial para a documentação de código em Java, tornando o código mais acessível e amigável para outros desenvolvedores. Através de comentários estruturados com tags apropriadas e a utilização do Javadoc, é possível criar documentações claras e concisas para projetos Java.

/*
  Comando para criar um arquivo documentado do seu projeto Java

  javadoc -encoding UTF-8 -docencoding ISO-8859-1 -d ../docs src/main/java/*.java

  A ultima parte varia conforme a organização do seu documento

  Como exercício realizei a documentação do projeto Smart Tv, para conferir basta ir em DOCS e em INDEX.HTML
*/

}