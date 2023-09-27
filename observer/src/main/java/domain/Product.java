package domain;

import lombok.Builder;
import lombok.Getter;
import service.Discounts;

@Getter
@Builder
public class Product {
    private String title;
    private Discounts discounts;
}
