package camt.se331.shoppingcart.service;

import camt.se331.shoppingcart.dao.ShoppingCartDao;
import camt.se331.shoppingcart.entity.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by pan on 3/26/2016.
 */

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {

    @Autowired
    ShoppingCartDao shoppingCartDao;

    @Override
    @Transactional
    public ShoppingCart findById(Long id) {
        return shoppingCartDao.findById(id);
    }

    @Override
    public List<ShoppingCart> getShoppingCarts() {
        return shoppingCartDao.getShoppingCarts();
    }

    @Override
    public List<ShoppingCart> getShoppingCartBefore(Date stateDate) {
        return shoppingCartDao.getShoppingCartBefore(stateDate);
    }

    @Override
    public List<ShoppingCart> getShoppingCartBetween(Date stateDate, Date stopDate) {
        return shoppingCartDao.getShoppingCartBetween(stateDate,stopDate);
    }

    @Override
    public ShoppingCart addShoppingCart(ShoppingCart shoppingCart) {
        return shoppingCartDao.addShoppingCart(shoppingCart);
    }

    @Override
    public ShoppingCart deleteShoppingCart(ShoppingCart shoppingCart) {
        return shoppingCartDao.deleteShoppingCart(shoppingCart);
    }
}
