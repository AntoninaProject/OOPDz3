package model.save;

import model.familyTree.FamilyTree;
import model.human.Human;
import model.save.base.FileHandler;

public class FileHandlerForFamilyTree implements WritableForFamilyTree{
    private String filePath = "tree.out";
    private FileHandler fileHandler;

    public FileHandlerForFamilyTree() {
        fileHandler = new FileHandler();
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public boolean save(FamilyTree<Human> tree) {
        return fileHandler.save(tree, filePath);
    }

    @Override
    public FamilyTree<Human> read() {
        return (FamilyTree<Human>)fileHandler.read(filePath);
    }
}