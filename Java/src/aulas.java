import java.util.Scanner;

public class aulas {
    public static void main(String[] args) {
        // Curso Programação Java

        // Aula 1 - Olá mundo

        System.out.println("Olá mundo"); // Mostra Olá mundo na tela

        // Aula 3 - Variáveis, armazenamento de dados


        String meuNome = "Giovana Victória";
        int idade = 18;
        double altura = 1.58;
        char sexo = 'F';
        boolean solteira = true;


        //meuNome = "Maia"; // Muda o valor da variável

        //meuNome += "Maia"; // Junta a primeira entrada com a segunda

        System.out.println("Meu nome é:" +meuNome);
        System.out.println("Minha idade:" +idade);
        System.out.println(altura);
        System.out.println(sexo);
        System.out.println(solteira);


        // Aula 4 - Operadores matemáticos


        int soma = 10 + 8;
        int sub = 10 - 8;
        int mult = 10 * 8;
        int divs = 10 / 8;
        int resto = 10 % 8;
        System.out.println(soma);
        System.out.println(sub);
        System.out.println(mult);
        System.out.println(divs);
        System.out.println(resto);


        // Aula 5 - Operadores de Comparação


        boolean resultado = 10 == 1; // compara resultados e retorna True (caso seja vdd) ou false.
        System.out.println(resultado);


        // Aula 6 - Incremento e Decremento


        int num = 1;
        num ++; // ++ adiciona mais um na variavel
        num += 6; // += adiciona um ou mais números na variavel
        num --; // subtrai o valor da variavel
        System.out.println(num);
        System.out.println(++num);
        System.out.println(--num);


        // Aula 7 - If else, estrutura condicional


        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua idade:"); // Linha 69 e 70 é para entrada do usuário
        int idade = input.nextInt();
        if(idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");


        // Aula 8 - Switch case, estrutura condicional


        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número:");
        int diaDaSemana = input.nextInt();
        String nomeDoDia;
        switch(diaDaSemana) {
            case 1:nomeDoDia="Domingo";break;
            case 2:nomeDoDia="Segunda";break;
            case 3:nomeDoDia="Terça";break;
            case 4:nomeDoDia="Quarta";break;
            case 5:nomeDoDia="Quinta";break;
            case 6:nomeDoDia="Sexta";break;
            case 7:nomeDoDia="Sábado";break;
            default:nomeDoDia="Dia inválido";break;
        }
        System.out.println(nomeDoDia);


        //%d int, double
        //%s String
        //%f float

        // Aula 9 - While, Enquanto, estrutura de repetição

        int numero = 1;
        while(numero<11) {
            System.out.println(numero);
            numero++;


        // Aula 10 - do while, Faça Enquanto, estrutura de repetição

        int numero = 1;
        do {
            System.out.println(numero);
            numero++;
        }while (numero < 10);


        }

    }
