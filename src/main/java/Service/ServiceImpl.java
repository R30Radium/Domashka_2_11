package Service;

import Misc.basket;

import java.util.List;
@org.springframework.stereotype.Service
public class ServiceImpl implements Service{

    private final Misc.basket basket;

    public ServiceImpl(basket basket) {this.basket = basket;}
    @Override
    public List<Integer> addItems(List<Integer> idList) {
        return basket.addItems(idList);
    }

    @Override
    public List<Integer> getItems() {
        return basket.getItems();
    }
}