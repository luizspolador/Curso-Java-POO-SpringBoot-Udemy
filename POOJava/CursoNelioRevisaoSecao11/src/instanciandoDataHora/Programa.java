package instanciandoDataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Programa {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        //convertendo data em objetos
        LocalDate d04 = LocalDate.parse("2023-10-03");
        LocalDateTime d05 = LocalDateTime.parse("2023-10-03T02:30:26");
        Instant d06 = Instant.parse("2023-10-03T02:30:26Z"); // gerando no padrão UTC - horario de Londres

        //instanciando com um horario local, nesse caso de Brasilia e convertendo para horario de Londres
//        Instant d07 = Instant.parse("2022-10-03T01:30:26-0300");

        //customizando
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d08 = LocalDate.parse("20/07/2023", fmt1);

        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime d09 = LocalDateTime.parse("20/07/2023 01:30", fmt2);

        LocalDate d10 = LocalDate.of(2023, 7, 20);
        LocalDateTime d11 = LocalDateTime.of(2023, 7, 20, 1, 30);

        System.out.println("d01: " + d01); // d01: 2023-10-04
        System.out.println("d02: " + d02); // d02: 2023-10-04T09:24:03.418591300
        System.out.println("d03: " + d03); // d03: 2023-10-04T12:25:23.956170500Z // Z --> padrão gmt global -  gera 3 horas a frente, horario de londres
        System.out.println("d04: " + d04); // d04: 2023-10-03
        System.out.println("d05: " + d05); // d05: 2023-10-03T02:30:26
        System.out.println("d06: " + d06); // d06: 2023-10-03T02:30:26Z
//        System.out.println("d07: " + d07);
        System.out.println("d08: " + d08); // d08: 2023-07-20
        System.out.println("d09: " + d09); // d09: 2023-07-20T01:30
        System.out.println("d010: " + d10); // d010: 2023-07-20
        System.out.println("d011: " + d11); // d011: 2023-07-20T01:30
    }
}
