package modulo7;

public class FuncoesString58 {
    public static void main(String[] args) {
        String original = "abcd FGHI ABC abc DEFG     ";

        // LETRA MINUSCULAS
        String s1 = original.toLowerCase();
        System.out.println(s1); // abcd fghi abc abc defg

        //LETRAS MAIUSCULAS
        String s2 = original.toUpperCase();
        System.out.println(s2); // ABCD FGHI ABC ABC DEFG

        //TRIM -> mantem a String original, mas elimina os espaços
        String s3 = original.trim();
        System.out.println(s3); // abcd FGHI ABC abc DEFG  -> sem espaços no final

        // demonstra uma string a partir do segundo caractere
        String s4 = original.substring(2);
        System.out.println(s4); // cd FGHI ABC abc DEFG

        // demonstra uma string do caractere 2 ate um abaixo do 9
        String s5 = original.substring(2, 9);
        System.out.println(s5); // cd FGHI

        // trocar um 'a' por um 'x'
        String s6 = original.replace('a', 'x');
        System.out.println(s6); // xbcd FGHI ABC xbc DEFG

        // trocar um "abc" por "xy"
        String s7 = original.replace("abc", "xy");
        System.out.println(s7); // xyd FGHI ABC xy DEFG

        // primeira posição da String "bc"
        int i = original.indexOf("bc");
        System.out.println(i); // 1

        // última posição da String "bc"
        int j = original.lastIndexOf("bc");
        System.out.println(j); // 15


        // OPERAÇÃO SPLIT
        String s = "potato apple lemon";
        String[] vect = s.split(" "); // espaço em branco " " é o separador
        String word1 = vect[0];
        System.out.println(word1); // potato
        String word2 = vect[1];
        System.out.println(word2); // apple
        String word3 = vect[2];
        System.out.println(word3); // lemon
    }
}
