public class logicaD {
    public static void main(String[] args) {
        int base = 2;
        int potencia = 2;
        int numeroAtual = (int) Math.pow(base, potencia);

        System.out.println(numeroAtual); // imprime o primeiro número da sequência

        // Loop para gerar e imprimir os próximos números da sequência
        for (int i = 1; i < 5; i++) { // i < 5 para gerar os próximos 4 números
            potencia += 2;
            numeroAtual = (int) Math.pow(base, potencia);
            System.out.println(numeroAtual);
        }
    }
}
