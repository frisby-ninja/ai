package net.ninjaworks.ai.event.handlers;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TriggerEventHandler {
    public TriggerEventHandler(Method caller) {
        try {
            caller.invoke(caller);
        } catch (IllegalAccessException e) {
            System.out.println("Could not access trigger event caller : '" + caller + "'!");
        } catch (InvocationTargetException e) {
            System.out.println("Trigger event caller " + caller.getName() + " does not exist!");
        }
    }
}
