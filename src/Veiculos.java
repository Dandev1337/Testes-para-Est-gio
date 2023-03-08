public class Veiculos {
    public static void main(String[] args) {
        int distanciaTotal = 100;
        int velocidadeCarro = 110;
        int velocidadeCaminhao = 80;
        int tempoPedagio = 5; // minutos
        int distanciaCarro = 0;
        int distanciaCaminhao = distanciaTotal;

        // Simula a viagem dos veículos até o encontro
        while (distanciaCarro < distanciaCaminhao) {
            distanciaCarro += (velocidadeCarro / 60) * tempoPedagio; // Carro passa pelo pedágio
            distanciaCarro += (velocidadeCarro / 60) * (distanciaCaminhao - distanciaCarro) / (velocidadeCarro + velocidadeCaminhao); // Carro percorre o trecho até o encontro
            distanciaCaminhao -= (velocidadeCaminhao / 60) * tempoPedagio; // Caminhão passa pelo pedágio
            distanciaCaminhao -= (velocidadeCaminhao / 60) * (distanciaCaminhao - distanciaCarro) / (velocidadeCarro + velocidadeCaminhao); // Caminhão percorre o trecho até o encontro
        }

        // Verifica qual veículo está mais próximo de Ribeirão Preto
        if (distanciaCarro > distanciaCaminhao) {
            System.out.println("O caminhão está mais próximo de Ribeirão Preto.");
        } else if (distanciaCarro < distanciaCaminhao) {
            System.out.println("O carro está mais próximo de Ribeirão Preto.");
        } else {
            System.out.println("Os veículos estão equidistantes de Ribeirão Preto.");
        }
    }
}
