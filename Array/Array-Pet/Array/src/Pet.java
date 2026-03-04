public class Pet {
    // Atributos privados para garantir o encapsulamento
    private String nome, raca;
    private float peso;
    private int id;

    // Atributo estático: funciona como um gerador de sequência global para a classe
    private static int contadorGeral = 1;

    // Construtor padrão: centraliza a lógica de autoincremento do identificador único
    public Pet() {
        this.id = contadorGeral++;
    }

    // Construtor sobrecarregado: inicializa o estado do objeto e vincula o ID automático
    public Pet(String raca, String nome, float peso) {
        this(); // Invoca o construtor padrão para garantir a atribuição do ID
        this.nome = nome;
        this.raca = raca;
        this.peso = peso;
    }

    // Métodos de acesso (Getters) e modificação (Setters)
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getRaca() { return raca; }
    public void setRaca(String raca) { this.raca = raca; }

    public float getPeso() { return peso; }
    public void setPeso(float peso) { this.peso = peso; }

    public int getId() { return id; }

    // Sobrescrita do método para representação textual customizada do objeto
    @Override
    public String toString() {
        return "ID: " + id + " | Nome: " + nome + " | Raça: " + raca + " | Peso: " + peso + " Kg";
    }
}