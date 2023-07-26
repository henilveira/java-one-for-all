package henrique.academy;

import java.awt.*;

public class TesteDeVariaveis {
    public static void main(String[] args) {
        // Existem tipos de variaveis de VALORES que posso utilizar, int, double, float, boolean, char, byte, short. long
        int idade = 16; // Traduz o valor da variavel para um número
        System.out.println("Este menino possui " + idade + " anos"); // Mostra o valor da idade do menino na tela
        long numeroGrande = 10000; // Escrever números grandes
        System.out.println(numeroGrande);
        float salarioFloat = (float) 2500.0; //Dessa forma posso escrever FLOAT sendo usado com números quebrados
        System.out.println(salarioFloat);
        double salarioDouble = 500.882; // usar para números quebrados
        System.out.println(salarioDouble);
        boolean trueValue = true;
        boolean falseValue = false;
        short idadeShort = 25;
        byte idadeByte = 35;
        char character = 87; // Escrever palavras ou letras a partir de código CHAR
        System.out.println(character);
        String MacacoPrego = "blackeye é foda"; // Adicionar variáveis com caracteres
        System.out.println(MacacoPrego);
        var clock = "23:01pm"; // Mesma coisa que String
        System.out.println(clock);

    }
}
