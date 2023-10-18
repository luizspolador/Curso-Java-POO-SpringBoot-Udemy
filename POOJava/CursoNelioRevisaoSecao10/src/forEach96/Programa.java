package forEach96;

public class Programa {
    public static void main(String[] args) {
        String[] vetor = new String[] {"Maria", "Bob", "Alex"};

        for(int i=0; i<vetor.length; i++){
            System.out.println(vetor[i]);
        }

        System.out.println("--------------------------");

        //FOR EACH
        // percorre todos os elementos do vetor chamando cada um de objeto do tipo String
        for (String objeto : vetor){
            System.out.println(objeto);
        }
    }
}
