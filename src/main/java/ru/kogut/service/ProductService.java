package ru.kogut.service;

import org.modelmapper.ModelMapper;
import ru.kogut.model.dao.ProductDAO;
import ru.kogut.model.dto.ProductDTO;
import ru.kogut.util.FormatUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @author S.Kogut on 08.01.2020
 */
public class ProductService {

    private ModelMapper modelMapper = new ModelMapper();

    private List<ProductDAO> productListDAO;

    public ProductService(List<ProductDAO> productListDAO) {
        this.productListDAO = productListDAO;
    }

    public List<ProductDTO> findAll() {
        final List<ProductDTO> productList = new ArrayList<>();
        this.productListDAO.forEach(p->{
            ProductDTO product = modelMapper.map(p,ProductDTO.class);
            product.setPrice(FormatUtil.decimalToStringByGrupping(p.getPrice()));
            productList.add(product);
        });
        return productList;
    }

    public ProductDTO findById(String id) {
        ProductDAO product = productListDAO.stream().filter(p->p.getId().equals(id)).findFirst().orElse(null);
        ProductDTO productDTO = null;
        if (product != null) {
            productDTO = modelMapper.map(product, ProductDTO.class);
            productDTO.setPrice(FormatUtil.decimalToStringByGrupping(product.getPrice()));
        }
        return productDTO;
    }

}
