package com.trainingmug.ecommerce.productservice.dto.request;

import com.trainingmug.ecommerce.productservice.enums.Category;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductRequestDto {

    private String name;
    private long maxRetailPrice;
    private float discountPercentage;
    private Category category;
    private String company;
}
