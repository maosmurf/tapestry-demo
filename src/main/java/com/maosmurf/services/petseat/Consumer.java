package com.maosmurf.services.petseat;

import com.maosmurf.services.petseat.food.Food;

/**
 * @author xza
 */
public interface Consumer<T extends Food>
{
    String consume(T food);
}
