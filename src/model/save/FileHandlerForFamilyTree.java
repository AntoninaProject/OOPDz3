package model.save;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import model.familyTree.FamilyTree;
import model.human.Human;

public class FileHandlerForFamilyTree implements WritableForFamilyTree{
    private String filePath;
    private ObjectInputStream objInStream;
    private ObjectOutputStream objOutStream;


    // конструктор по умолчанию
    public FileHandlerForFamilyTree() {
        this.filePath = "tree.out";
        try {
            objInStream = new ObjectInputStream(new FileInputStream(filePath));
            objOutStream = new ObjectOutputStream(new FileOutputStream(filePath));
        }
        catch (IOException ioe) {
            System.out.println("IO exception");
        }
    }

    // конструктор с указанием пути
    public FileHandlerForFamilyTree(String filePath) {
        this.filePath = filePath;
        try {
            objInStream = new ObjectInputStream(new FileInputStream(filePath));
            objOutStream = new ObjectOutputStream(new FileOutputStream(filePath));
        }
        catch (IOException ioe) {
            System.out.println("IO exception");
        }
    }

    @Override
    public Object readObj() throws ClassNotFoundException, IOException {
        Object restoredObj = objInStream.readObject();
        objInStream.close();
        return restoredObj;
    }

    @Override
    public void writeObj(Object obj) throws IOException {
        objOutStream.writeObject(obj);
        objOutStream.close();
    }

    public void changeFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public FamilyTree<Human> read() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'read'");
    }
}