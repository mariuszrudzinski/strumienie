package pl.edu.wszib.strumienie.zadanie4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter

public class Order {
    private String orderId;
    private String status; // "ZREALIZOWANE", "W TRAKCIE", "ANULOWANE"
    private List<OrderItem> items;
}
