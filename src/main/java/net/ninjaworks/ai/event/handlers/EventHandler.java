package net.ninjaworks.ai.event.handlers;

import net.ninjaworks.ai.event.type.EventType;

import java.lang.reflect.Method;

public class EventHandler {
    @SuppressWarnings({"all"})
    public EventHandler(EventType type, Method caller) {
        switch (type) {
            case TRIGGER -> new TriggerEventHandler(caller);
            case default -> skip();
        }
    }

    private static void skip() {}
}
