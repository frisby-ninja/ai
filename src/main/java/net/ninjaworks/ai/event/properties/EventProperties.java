package net.ninjaworks.ai.event.properties;

import net.ninjaworks.ai.event.type.EventType;
import net.ninjaworks.ai.gen.UIDGen;
import net.ninjaworks.ai.properties.Properties;

public class EventProperties extends Properties {

    public final EventType type;

    public EventProperties(EventType type) {
        super(type.getID(), UIDGen.generate(type.getID()));
        this.type = type;
    }
}
