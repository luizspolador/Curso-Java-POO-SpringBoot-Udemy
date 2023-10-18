package converterDataHoraGlobalParaLocal;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Programa {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2023-10-03");
        LocalDateTime d05 = LocalDateTime.parse("2023-10-03T02:30:26");
        Instant d06 = Instant.parse("2023-10-03T02:30:26Z");

        // nomes para especificar um fusohorario
//        for (String s : ZoneId.getAvailableZoneIds()){
//            System.out.println(s);
//        }

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault()); //converte o instant para um fusohorario da maquina local
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));  //converte o instant para o fusohorario de Portugal
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

        System.out.println("r1: " + r1); // r1: 2023-10-02
        System.out.println("r2: " + r2); // r2: 2023-10-03
        System.out.println("r3: " + r3); // r3: 2023-10-02T23:30:26
        System.out.println("r4: " + r4); // r4: 2023-10-03T03:30:26

        System.out.println("d04 dia: " + d04.getDayOfMonth()); // d04 dia: 3
        System.out.println("d04 mes: " + d04.getMonth()); // d04 mes: OCTOBER
        System.out.println("d04 ano: " + d04.getYear()); // d04 ano: 2023

        System.out.println("d05 hora: " + d05.getHour()); // d05 hora: 2
        System.out.println("d05 minutos: " + d05.getMinute()); // d05 minutos: 30

    }
}
