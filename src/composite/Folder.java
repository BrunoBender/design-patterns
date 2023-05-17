package composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends FileSystemItem{

    List<FileSystemItem> fileSystemItems = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    public Folder(String name, List<FileSystemItem> fileSystemItems) {
        this(name);
        this.fileSystemItems= fileSystemItems;
    }

    public void print(){
        print("");
    }

    public void print(String structure){
        System.out.println(structure + name);
        fileSystemItems.forEach((file) -> file.print(structure + "| "));
    }

    public void addFileSystem(FileSystemItem fileSystemItem){
        fileSystemItems.add(fileSystemItem);
    }

    public void showFiles(){
        System.out.println("---- Files from "+ name +" ----");
        fileSystemItems.stream()
                .map(file -> file.name +"."+ (file instanceof Folder ? "folder" : "file"))
                .forEach(System.out::println);
        System.out.println("---------------------------------");
    }
}
