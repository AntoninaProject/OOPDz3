package model.save;

import java.io.IOException;

import model.familyTree.FamilyTree;
import model.human.Human;

public interface WritableForFamilyTree {
    void writeObj(Object object) throws ClassNotFoundException, IOException;
    Object readObj() throws ClassNotFoundException, IOException;
    static boolean save(FamilyTree<Human> activeTree) {
        return false;
    }
    FamilyTree<Human> read();
}