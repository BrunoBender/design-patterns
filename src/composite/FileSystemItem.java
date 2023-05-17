package composite;

public abstract class FileSystemItem {
    String name;

    protected FileSystemItem(String name){
        this.name = name;
    }

    public abstract void print(String message);
}
