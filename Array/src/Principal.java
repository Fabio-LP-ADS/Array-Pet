public class Principal {
    public static void main(String[]args){
     Array array = new Array();
     Pet pet1 = new Pet ("Black","SRD", 1.6f, 1);
     Pet pet2 = new Pet("Gaia","SRD", 1.6f, 2);

     //Chamada dos métodos
        array.inserir(pet1);
        array.inserir(pet2);
        array.exibir();

    }
}
