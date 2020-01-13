package ru.kogut.model.dto;

import lombok.Data;

/**
 * @author S.Kogut on 07.01.2020
 */
@Data
public class ProductDTO {

    private String id;
    private String title;
    private String shortDescription;
    private String fullDescription;
    private String price;
    private String pathTitlePicture;

}
