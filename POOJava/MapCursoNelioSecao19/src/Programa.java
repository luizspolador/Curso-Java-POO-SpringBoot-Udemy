import java.util.Map;
import java.util.TreeMap;

public class Programa {
    public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>(); // TreeMap ordena - como é string, é feito por ordem alfabetica

        cookies.put("username", "Maria"); // armazenamento de chave e valor respectivamente
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "99856587");

        cookies.remove("email"); // remove o cookie da linha 10
        cookies.put("phone", "98526523"); // 98526523 vai sobescrever o 99856587 da linha 11, visto que não aceita chaves iguais

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone")); // verifica se exite a chave "phone" --> retorna TRUE

        System.out.println("Phone number: " + cookies.get("phone")); // pega o valor da chave "phone"

        System.out.println("Email: " + cookies.get("email")); // ao tentar pegar um elemento que não existe, o retorno é "null"

        System.out.println("Size: " + cookies.size()); // tamanho do cookie --> 2

        System.out.println("ALL COOKIES: ");
        for(String key : cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}
