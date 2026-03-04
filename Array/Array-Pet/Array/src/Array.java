public class Array {

    // Estrutura de armazenamento interno e controle de índice
    private Pet[] lista = new Pet[3];
    private int contador = 0;

    // Adiciona um novo Pet, verificando a necessidade de expansão do array
    public void inserir(Pet pet) {
        if (contador == lista.length) {
            lista = alocarNovoArray();
        }

        lista[contador++] = pet;
    }

    // Percorre e imprime os elementos preenchidos na coleção
    public void exibir() {
        for (int i = 0; i < contador; i++) {
            System.out.println(lista[i]);
        }
    }

    // Gerencia o redimensionamento dinâmico para evitar estouro de memória (Stack Overflow)
    private Pet[] alocarNovoArray() {
        Pet[] novo = new Pet[lista.length + 3];
        System.arraycopy(lista, 0, novo, 0, lista.length);
        return novo;
    }

    // Realiza busca linear pelo ID e retorna o índice ou -1 para não encontrado
    public int pesquisar(int id) {
        for (int i = 0; i < contador; i++) {
            if (lista[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }

}