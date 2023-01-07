package net.ninjaworks.ai.event.type;

import net.ninjaworks.ai.event.type.trigger.TriggerEvent;

public enum EventType {
    TRIGGER;

    public int getID() {
        return switch (this) {
            case TRIGGER -> 1;
        };
    }

    public Class getEventClass() {
        return switch (this) {
            case TRIGGER -> TriggerEvent.class;
        };
    }
}
