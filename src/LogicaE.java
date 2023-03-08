public class LogicaE {
    public static void main(String[] args) {
        int n = 7; // número de termos a serem gerados
        int primeiroTermo = 1;
        int segundoTermo = 1;

        System.out.print(primeiroTermo + " " + segundoTermo);

        // Loop para gerar e imprimir os próximos termos da sequência
        for (int i = 2; i < n; i++) {
            int proximoTermo = primeiroTermo + segundoTermo;
            System.out.print(" " + proximoTermo);

            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }
    }
}
