package ecma.ai.warehouseapp.projection;

import ecma.ai.warehouseapp.entity.Input;
import ecma.ai.warehouseapp.entity.InputProduct;
import ecma.ai.warehouseapp.entity.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = InputProduct.class)
public interface CustomInputProduct {

    Integer getId();

    Product getProduct();

    Input getInput();

}
