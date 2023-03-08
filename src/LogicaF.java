public class LogicaF {
    public static void main(String[] args) {
        int[] sequence = new int[8]; // definindo um array de 8 elementos
        sequence[0] = 2; // atribuindo o valor 2 para o primeiro elemento
        sequence[1] = sequence[0] * 5; // atribuindo o valor 10 para o segundo elemento
        sequence[2] = sequence[1] + 2; // atribuindo o valor 12 para o terceiro elemento
        sequence[3] = sequence[2] + 4; // atribuindo o valor 16 para o quarto elemento
        sequence[4] = sequence[3] + 1; // atribuindo o valor 17 para o quinto elemento
        // calculando os próximos elementos da sequência
        for (int i = 5; i < sequence.length; i++) {
            sequence[i] = sequence[i - 1] + 1; // incrementando 1 ao elemento anterior
        }
        // imprimindo a sequência
        for (int i = 0; i < sequence.length; i++) {
            System.out.print(sequence[i] + " ");
        }
    }
}
