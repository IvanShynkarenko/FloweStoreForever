package ua.edu.ucu.apps.flowerstore.Delivery;

import java.util.List;

import ua.edu.ucu.apps.flowerstore.flower.Item;

public interface Delivery {
    void deliver(List<Item> itemList);
}