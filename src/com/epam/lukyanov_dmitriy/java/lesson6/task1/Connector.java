package com.epam.lukyanov_dmitriy.java.lesson6.task1;

import java.io.*;

public class Connector {
    public static void printObject(File file, Object object) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(object);
        }
    }

    public static Object readObject(File file) throws IOException, ClassNotFoundException {
        Object readObject;
        try (ObjectInputStream oin = new ObjectInputStream(new FileInputStream(file))) {
            readObject = oin.readObject();
        }
        return readObject;
    }
}
