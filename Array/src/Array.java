public class Array {
    private Pet[] lista=new Pet[3];
    private int contador=0;

    public void inserir(Pet pet){
        lista[contador++]=pet;
    }
    public void exibir(){
        for(int i=0;i<contador;i++){
            System.out.println(lista[i]);
        }
    }
}