package com.onlineShop.main.java.validator;

import com.onlineShop.main.java.dao.ProductDAO;
import com.onlineShop.main.java.entity.Product;
import com.onlineShop.main.java.model.ProductInfo;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class ProductInfoValidator implements Validator {

    private ProductDAO productDAO;

    public boolean supports(Class<?> aClass) {
        return aClass == ProductInfo.class;
    }

    public void validate(Object targetObj, Errors errors) {
        ProductInfo productInfo = (ProductInfo) targetObj;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "code", "NotEmpty.productForm.code");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "NotEmpty.productForm.name");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "price", "NotEmpty.productForm.price");

        String code = productInfo.getCode();
        if (code != null && code.length() > 0) {
            if (code.matches("\\s+")) {
                errors.rejectValue("code", "Pattern.productForm.code");
            } else if (productInfo.isNewProduct()) {
                Product product = productDAO.findProduct(code);
                if (product != null) {
                    errors.rejectValue("code", "Duplicate.productForm.code");
                }
            }
        }
    }
}
