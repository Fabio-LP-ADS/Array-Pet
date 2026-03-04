public class Principal {

    public static void main(String[] args) {
        // Inicializa o contêiner de armazenamento dinâmico
        Array array = new Array();

        // Instancia objetos Pet com atribuição automática de ID via contador estático
        // Ordem dos parâmetros: Raça, Nome, Peso
        array.inserir(new Pet("SRD", "Mel", 12));
        array.inserir(new Pet("SRD", "Gaia", 7));
        array.inserir(new Pet("SRD", "Julie", 15));

        // Saída de dados: Varredura completa da coleção atual
        System.out.println("--- Lista de Pets ---");
        array.exibir();

        // Executa busca por identificador único para obter o índice do elemento
        int resultado = array.pesquisar(2);

        System.out.println("\nResultado da pesquisa pelo ID 2: " + resultado);

        // Teste de robustez: Verificação de comportamento para chave de busca inexistente
        System.out.println("Resultado da pesquisa pelo ID 99: " + array.pesquisar(99));
    }
}