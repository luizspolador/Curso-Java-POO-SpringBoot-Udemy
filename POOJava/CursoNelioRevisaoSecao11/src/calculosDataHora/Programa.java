package calculosDataHora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Programa {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2023-10-03");
        LocalDateTime d05 = LocalDateTime.parse("2023-10-03T02:30:26");
        Instant d06 = Instant.parse("2023-10-03T02:30:26Z");

        LocalDate pastWeekLocalDate = d04.minusDays(7); // instanciando uma nova data que é o d04 menos 7 dias
        LocalDate nextWeekLocalDate = d04.plusDays(7); // nstanciando uma nova data que é o d04 mais 7 dias
        LocalDate nextYearLocalDate = d04.plusYears(1); // instanciando uma nova data que é o d04 mais 1 ano

        System.out.println("pastWeekLocalDate: " + pastWeekLocalDate); // pastWeekLocalDate: 2023-09-26
        System.out.println("nextWeekLocalDate: " + nextWeekLocalDate); // nextWeekLocalDate: 2023-10-10
        System.out.println("nextYearLocalDate: " + nextYearLocalDate); // nextYearLocalDate: 2024-10-03


        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
        LocalDateTime nextYearLocalDateTime = d05.plusYears(1);

        System.out.println("pastWeekLocalDateTime: " + pastWeekLocalDateTime); // pastWeekLocalDateTime: 2023-09-26T02:30:26
        System.out.println("nextWeekLocalDateTime: " + nextWeekLocalDateTime); // nextWeekLocalDateTime: 2023-10-10T02:30:26
        System.out.println("nextYearLocalDateTime: " + nextYearLocalDateTime); // nextYearLocalDateTime: 2024-10-03T02:30:26

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.println("pastWeekInstant: " + pastWeekInstant); // pastWeekInstant: 2023-09-26T02:30:26Z
        System.out.println("nextWeekInstant: " + nextWeekInstant); // nextWeekInstant: 2023-10-10T02:30:26Z

        //descobrindo a duração entre datas hora
        Duration d1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay()); // necessário converter para LocalDateTime
        Duration d2 = Duration.between(pastWeekLocalDateTime, d05);
        Duration d3 = Duration.between(pastWeekInstant, d06);

        System.out.println("tempo em dias: " + d1.toDays()); // tempo em dias: 7
        System.out.println("tempo em dias: " + d2.toDays()); // tempo em dias: 7
        System.out.println("tempo em dias: " + d3.toDays()); // tempo em dias: 7

    }
}
