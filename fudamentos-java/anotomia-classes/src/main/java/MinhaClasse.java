public class MinhaClasse {

    public static void main(String[] args) {

        // ************* AULA 1 *************

            // Tudo que eu escrever aqui só pertencerá a este método

            //System.out.println("Hello world!");

            // Java segue a regra do CamelCase para variável e para nome de classes deve sempre começar com letra maiscula

            //int ano = 2021;
            //ano = 2022;

            //final String BR = "Brasil"; // Não pode ser alterada

            // A convenção UperCase deve ser utilizada para variáveis imutáveis

            //BR = "Brazil";

        // ************* AULA 2 *************

    //        String primeiroNome = "Ademar";
    //        String segundoNome = "Castro";
    //
    //        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    //
    //        System.out.println(nomeCompleto);

        // ************* AULA 3 *************

            // Identação é fundamental para que o codigo fique reutilizável por outros devs. As boas práticas definem que o ideal é que os níveis de hierarquia do código alcancem o máximo de 6 níveis.

            // ************* AULA 4 *************

            // Convenção de Projetos

            // HyperTech
            // com.hypertech.notification

        // ************* AULA 5 *************

            // Java Beans - Clareza na nossa escrita, boas praticas

            // Uma variável precisa ser clara
            // Variáveis deve ser sempre no singular, a menos que se refira a um Array ou um conjunto de Classes



    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }

}
