package net.ninjaworks.ai.neuron;

import net.ninjaworks.ai.event.type.trigger.TriggerEvent;
import net.ninjaworks.ai.gen.UIDGen;
import net.ninjaworks.ai.neuron.gen.Triggerable;
import net.ninjaworks.ai.properties.Properties;
import net.ninjaworks.ai.registration.Registratable;

public abstract class Neuron extends Registratable implements Triggerable {

    private NeuronType type;

    public Neuron(int id, NeuronType type) {
        super(new Properties(id, UIDGen.generate(id)));
    }

    public Neuron(String id, NeuronType type) {
        super(new Properties(id, UIDGen.generate(id)));
    }

    public NeuronType getType() {
        return this.type;
    }

    abstract void onTrigger(TriggerEvent event);

}
