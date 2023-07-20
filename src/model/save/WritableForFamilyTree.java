package model.save;

import java.io.IOException;

public interface WritableForFamilyTree {
    void writeObj(Object object) throws ClassNotFoundException, IOException;
    Object readObj() throws ClassNotFoundException, IOException;
}