public class Programa {
    public static void main(String[] args) {
        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Maria", "mariagabriela@gmail.com");
        Client c3 = new Client("Alex", "alex@gmail.com");
        Client c4 = new Client("Alex", "alex@gmail.com");

        String s1 = "Test";
        String s2 = "Test";

        System.out.println(c1.hashCode()); // -495238894
        System.out.println(c2.hashCode()); // -925006195
        System.out.println(c1.equals(c3)); // false
        System.out.println(c1.equals(c2)); // false

        System.out.println(c3 == c4); // false, visto que == compara referencia de memoria, que são diferentes, embora apresentem o msm conteudo

        System.out.println(s1 == s2); // true

    }
}
