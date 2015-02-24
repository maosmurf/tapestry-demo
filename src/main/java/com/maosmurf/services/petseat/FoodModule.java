package com.maosmurf.services.petseat;

import java.util.HashMap;
import java.util.Map;

import org.apache.tapestry5.ioc.ServiceBinder;
import org.apache.tapestry5.ioc.annotations.Marker;
import org.apache.tapestry5.ioc.services.StrategyBuilder;

import com.maosmurf.services.petseat.food.IceCream;
import com.maosmurf.services.petseat.food.Pizza;
import com.maosmurf.services.petseat.pets.Bear;
import com.maosmurf.services.petseat.pets.Duck;

/**
 * @author xza
 */
public class FoodModule
{
    public static void bind(ServiceBinder binder)
    {
        binder.bind(Bear.class);
        binder.bind(Duck.class);

    }

    @Marker(FoodConsumer.class)
    public Consumer buildFoodConsumer(Bear bear, Duck duck, StrategyBuilder strategyBuilder)
    {
        Map<Class, Consumer> registrations = new HashMap<Class, Consumer>();

        registrations.put(IceCream.class, bear);
        registrations.put(Pizza.class, duck);

        return strategyBuilder.build(Consumer.class, registrations);
    }
}
