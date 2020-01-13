package ru.kogut.model.dao;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author S.Kogut on 08.01.2020
 */

@Data
public class ProductDAO {

    private String id;
    private String title;
    private String shortDescription;
    private String fullDescription;
    private BigDecimal price;
    private String pathTitlePicture;

}
