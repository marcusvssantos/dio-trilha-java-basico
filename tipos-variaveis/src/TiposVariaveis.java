public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        byte idade = 25; // Armazena números inteiros de -128 a 127. Ideal para economizar memória quando se trabalha com valores pequenos.

        short ano = 2024; //Armazena números inteiros de -32.768 a 32.767. Útil para representar valores que não exigem uma faixa muito ampla.

        int quantidade = 100; //Armazena números inteiros de -2.147.483.648 a 2.147.483.647. O tipo mais comum para representar números inteiros em geral.

        long populacao = 7800000000L; //Armazena números inteiros de -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807. Usado para representar valores inteiros extremamente grandes.(note o 'L' no final)

        float preco = 19.99f; //Armazena números de ponto flutuante (decimais) de precisão simples. Útil quando a precisão absoluta não é crítica.(note o 'f' no final)

        double pi = 3.14159; //Armazena números de ponto flutuante de precisão dupla. O tipo mais comum para representar números decimais.

        boolean ativo = true; //Armazena valores lógicos true (verdadeiro) ou false (falso). Usado para representar condições e resultados de comparações.

        char letra = 'A'; //Armazena um único caractere Unicode.

        String nome = "João"; //Armazena uma sequência de caracteres (texto).

        int[] numeros = {1, 2, 3, 4, 5}; //Armazenam coleções de elementos do mesmo tipo.

        enum DiaSemana { SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO }; //Definem um conjunto fixo de valores constantes.
    }
}
