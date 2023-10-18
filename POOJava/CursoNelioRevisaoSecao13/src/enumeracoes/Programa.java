package enumeracoes;

import java.sql.SQLOutput;
import java.util.Date;

public class Programa {
    public static void main(String[] args) {

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order); // Order{id=1080, moment=Wed Oct 04 11:05:42 BRT 2023, status=PENDING_PAYMENT}

        //convertendo string para enum
        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
        System.out.println(os1); // DELIVERED
        System.out.println(os2); // DELIVERED

    }
}
