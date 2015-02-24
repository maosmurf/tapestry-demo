package com.maosmurf.pages;

import org.apache.tapestry5.ioc.annotations.Inject;

import com.maosmurf.services.petseat.Consumer;
import com.maosmurf.services.petseat.FoodConsumer;
import com.maosmurf.services.petseat.food.Food;
import com.maosmurf.services.petseat.food.IceCream;
import com.maosmurf.services.petseat.food.Pizza;

/**
 * @author xza
 */
public class Pets
{
    @Inject
    @FoodConsumer
    private Consumer<Food> consumer;

    public String getPizza()
    {
        final Food msg = new Pizza();
        return consumer.consume(msg);
    }

    public String getIceCream()
    {
        final Food msg = new IceCream();
        return consumer.consume(msg);
    }

}
