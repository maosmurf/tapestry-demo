package com.maosmurf.services.petseat;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * @author xza
 */
@Target({TYPE,FIELD,PARAMETER})
@Retention(RUNTIME)
@Documented
public @interface FoodConsumer
{
}
