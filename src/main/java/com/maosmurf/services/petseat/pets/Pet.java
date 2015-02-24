package com.maosmurf.services.petseat.pets;

import com.maosmurf.services.petseat.Consumer;
import com.maosmurf.services.petseat.food.Food;

/**
 * @author xza
 */
public abstract class Pet implements Consumer<Food>
{
    public abstract String talk();

    public String consume(final Food food)
    {
        return String.format("%s! %s", talk(), food.getClass().getSimpleName());
    }

}
