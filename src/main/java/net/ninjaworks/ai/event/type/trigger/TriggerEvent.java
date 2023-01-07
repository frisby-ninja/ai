package net.ninjaworks.ai.event.type.trigger;

import net.ninjaworks.ai.event.Event;
import net.ninjaworks.ai.event.EventRunner;
import net.ninjaworks.ai.event.type.EventType;

@EventRunner
public class TriggerEvent extends Event {

    public TriggerEvent() {
        super(EventType.TRIGGER);
    }
}
