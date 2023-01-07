package net.ninjaworks.ai.event;

import net.ninjaworks.ai.event.type.EventType;
import net.ninjaworks.ai.registration.RegType;
import net.ninjaworks.ai.registration.Registration;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Event extends Registration {
    public Event(EventType type) {
        super(RegType.EVENT);
        if(type.getEventClass().isAnnotationPresent(EventRunner.class)) {
            for (Method method : type.getEventClass().getClass().getMethods()) {
                if(method.isAnnotationPresent(EventHandler.class)) {
                    try {
                        Object eventRun = method.invoke(method);
                    } catch (IllegalAccessException e) {
                        System.out.println("Illegal access exception in event class.");
                    } catch (InvocationTargetException e) {
                        System.out.println("Invocation target exception in event class.");
                    }
                }
            }
        }
    }
}
