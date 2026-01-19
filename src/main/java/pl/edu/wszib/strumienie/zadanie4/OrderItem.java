package pl.edu.wszib.strumienie.zadanie4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public class OrderItem {
    private String productName;
    private String category;
    private int quantity;
    private double price;
}
