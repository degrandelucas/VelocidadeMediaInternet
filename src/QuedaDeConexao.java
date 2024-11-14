import java.util.Scanner;

public class QuedaDeConexao {
    
    // Função para calcular a velocidade média de conexão de internet
    public static double calcularVelocidadeMedia(String[] velocidades) {
        int total = 0;

        for (String velocidade : velocidades) {
            total += Integer.parseInt(velocidade.trim());
        }

        // TODO: Some todas as velocidades registradas e calcule a média
        return total / velocidades.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as velocidades da internet, separadas apenas por vírgula ',': ");;
        String entrada = scanner.nextLine();// Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora


        // Convertendo a entrada em uma lista de strings
        String[] velocidades = entrada.split(",");

        // Calculando a velocidade média de conexão
        double velocidadeMedia = calcularVelocidadeMedia(velocidades);

        // Exibindo a velocidade média de conexão
        System.out.println((int)velocidadeMedia + " Mbps");

        scanner.close();
    }
}
