package net.ninjaworks.ai.neuron;

import net.ninjaworks.ai.event.EventHandler;
import net.ninjaworks.ai.event.EventRunner;
import net.ninjaworks.ai.event.type.trigger.TriggerEvent;

@EventRunner
public class InputNeuron extends Neuron {
    public InputNeuron(int id) {
        super(id, NeuronType.INPUT);
    }

    @EventHandler
    void onTrigger(TriggerEvent event) {

    }
}
