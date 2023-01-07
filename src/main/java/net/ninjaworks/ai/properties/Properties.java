package net.ninjaworks.ai.properties;

public class Properties {

    public final int id;
    public final String UID;

    public Properties(int id, String UID) {
        this.id = id;
        this.UID = UID;
    }

    public Properties(String id, String UID) {
        this.UID = UID;
        this.id = Integer.parseInt(id);
    }
}
