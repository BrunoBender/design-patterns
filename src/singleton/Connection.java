package singleton;

public class Connection {
    int id;
    boolean inUse;

    public Connection(int id, boolean inUse) {
        this.id = id;
        this.inUse = inUse;
    }
}
