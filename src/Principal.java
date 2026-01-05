import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args)
            throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);
        ConsultaMoeda consulta = new ConsultaMoeda();
        int opcao = 0;

        String menu = """
                \n******************************************
                SEJA BEM-VINDO AO CONVERSOR DE MOEDAS!
                
                1) Dólar [USD] =>> Real [BRL]
                2) Real [BRL] =>> Dólar [USD]
                3) Euro [EUR] =>> Real [BRL]
                4) Real [BRL] =>> Euro [EUR]
                5) Outras moedas (digite os códigos)
                6) Sair
                
                Escolha uma opção válida:
                ******************************************
                """;

        while (opcao != 6) {
            System.out.println(menu);
            opcao = leitura.nextInt();
            leitura.nextLine(); // Limpa o buffer do teclado

            if (opcao == 6) break;

            String moedaBase = "";
            String moedaAlvo = "";
            double conversion_rate = 0;

            switch (opcao) {
                case 1 -> {
                    moedaBase = "USD";
                    moedaAlvo = "BRL";
                }
                case 2 -> {
                    moedaBase = "BRL";
                    moedaAlvo = "USD";
                }
                case 3 -> {
                    moedaBase = "EUR";
                    moedaAlvo = "BRL";
                }
                case 4 -> {
                    moedaBase = "BRL";
                    moedaAlvo = "EUR";
                }
                case 5 -> {
                    System.out.println("Digite o código da moeda de origem (ex: GBP):");
                    moedaBase = leitura.nextLine().toUpperCase();
                    System.out.println("Digite o código da moeda de destino (ex: BRL):");
                    moedaAlvo = leitura.nextLine().toUpperCase();
                }
                default -> {
                    System.out.println("Opção inválida! Tente novamente.");
                    continue;
                }
            }

            System.out.println("Digite o valor que deseja converter:");
            double valor = leitura.nextDouble();

            try {
                DadosMoeda resultado = consulta.buscaCotacao(moedaBase, moedaAlvo, valor);
                System.out.printf("\n>>> Contação: %,02f [%s]\n", resultado.conversion_rate(), resultado.base_code());
                System.out.printf(">>> Valor %.2f [%s] corresponde ao valor final de =>>> %.2f [%s] \n",
                        valor, moedaBase, resultado.conversion_result(),  moedaAlvo);

            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        System.out.println("Programa finalizado com sucesso!");
    }
}