package composite;

import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
        Folder gitFolder = new Folder("git-project");
        Folder bmgFolder = new Folder("bmg-project",
                Arrays.asList(
                        new File("bmg-backend", "jar"),
                        new File("bmg-frontend", "web"))
        );
        Folder olfarFolder = new Folder("olfar-project",
                Arrays.asList(
                        new File("olfar-backend", "jar"),
                        new File("olfar-frontend", "web"))
        );
        File config = new File("config", "txt");

        gitFolder.addFileSystem(bmgFolder);
        gitFolder.addFileSystem(olfarFolder);
        gitFolder.addFileSystem(config);

        gitFolder.print();
    }
}
