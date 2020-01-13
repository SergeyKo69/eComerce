package ru.kogut.model.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author S.Kogut on 07.01.2020
 */

@Data
public class BasketDTO {

    private String id;
    private List<ProductDTO> productList;
    private BigDecimal total;

    public BasketDTO() {
        this.id = UUID.randomUUID().toString();
        this.productList = new ArrayList<>();
        this.total = BigDecimal.ZERO;
    }

    public Integer getQuantityPositions() {
        return productList.size();
    }

}
