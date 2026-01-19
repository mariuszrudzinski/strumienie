package pl.edu.wszib.strumienie.zadanie4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public class ProductStats {
        private String productName;
        private long orderCount; // liczba zamówień zawierających ten produkt

    @Override
    public String toString(){
        return productName + ", " + orderCount + ")";
    }
}

