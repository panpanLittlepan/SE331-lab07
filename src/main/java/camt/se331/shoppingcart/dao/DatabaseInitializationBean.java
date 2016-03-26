package camt.se331.shoppingcart.dao;

import camt.se331.shoppingcart.entity.Product;
import camt.se331.shoppingcart.repository.ProductRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

/**
 * Created by pan on 3/26/2016.
 */
@Profile("db.init")
public class DatabaseInitializationBean implements InitializingBean {

    @Autowired
    ProductRepository productRepository;

    @Override
    public void afterPropertiesSet() throws Exception {
        Product[] initProduct =  {
                new Product(1l,"Kindle","the good book reader",6900.00),
                new Product(2l,"Surface Pro","The unknow computer",34000.00),
                new Product(3l,"Mac pro"," Mac book interim",44000.00),
                new Product(4l,"Candle","use for lightenup the world",10.00),
                new Product(5l,"Bin","User for what ?",200.00),
                new Product(6l,"Telephone", "Call the others",150.00)
        };
        productRepository.save(Arrays.asList(initProduct));
        productRepository.save(new Product(1l,"Kindle","the good book reader",6900.00));
    }
}
