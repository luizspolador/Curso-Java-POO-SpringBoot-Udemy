package converterDataHoraParaTexto;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Programa {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2023-10-03");
        LocalDateTime d05 = LocalDateTime.parse("2023-10-03T02:30:26");
        Instant d06 = Instant.parse("2023-10-03T02:30:26Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm").withZone(ZoneId.systemDefault()); // pega o fusohorario do computador do usuario
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

        System.out.println("d04: " + d04.format(fmt1)); // d04: 03/10/2023
        System.out.println("d04: " + fmt1.format(d04)); // d04: 03/10/2023
        System.out.println("d05: " + d05.format(fmt2)); // d05: 03/10/2023 02:30
        System.out.println("d06: " + fmt3.format(d06)); // d06: 02/10/2023 23:30 --> convertou a data e hora para o horário de brasilia
        System.out.println("d05: " + d05.format(fmt4)); // d05: 2023-10-03T02:30:26
        System.out.println("d06: " + fmt5.format(d06)); // d06: 2023-10-03T02:30:26Z
    }
}
