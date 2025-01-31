package ua.com.kisit.courseonlineshop3713732025.bl;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ua.com.kisit.courseonlineshop3713732025.entity.Products;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ItemCart {

    private Products product;
    private int quantity;

}
