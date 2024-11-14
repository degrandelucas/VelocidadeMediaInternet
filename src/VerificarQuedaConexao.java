import java.util.Scanner;

public class VerificarQuedaConexao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as velocidades de conexão do dia, separadas por vírgula ',' :");
        String entrada = scanner.nextLine();

        // Convertendo a entrada em um array de Strings
        String[] velocidades = entrada.split(",");
        
        boolean quedaConexao = false;

        // Verifica se alguma das velocidades registradas é igual a 0
        for (String velocidade : velocidades) {
            if (Integer.parseInt(velocidade.trim()) == 0) {
                quedaConexao = true;
                break;
            }
        }

        // Imprime o resultado de acordo com a condição, onde queda de conexão é true
        if (quedaConexao) {
            System.out.println("Queda de Conexao");
        } else {
            System.out.println("Sem Quedas");
        }

        scanner.close();
    }
}
