package composite;

public class File extends FileSystemItem{

    protected File(String name, String type) {
        super(name +"."+ type);
    }

    @Override
    public void print(String structure) {
        System.out.println(structure + name);
    }
}
