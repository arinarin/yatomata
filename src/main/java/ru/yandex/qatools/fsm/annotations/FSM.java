package ru.yandex.qatools.fsm.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;

/**
 * @author Ilya Sadykov
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({TYPE})
public @interface FSM {
    Class start();
}
