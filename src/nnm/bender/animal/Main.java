package nnm.bender.animal;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Path path = Paths.get("e:\\tmp\\write1.txt");
        Animal animal1 = new Animal("elephant");
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(path))) {
            objectOutputStream.writeObject(animal1);
        }
        try (ObjectInputStream objectOutputStream = new ObjectInputStream(Files.newInputStream(path))) {
            System.out.println(objectOutputStream.readObject().toString());
        }
    }

    public static Animal[] deserializeAnimalArray(byte[] data) {
        try (ObjectInputStream objectOutputStream = new ObjectInputStream(new ByteArrayInputStream(data))) {
            int count = objectOutputStream.readInt();
            Animal[] animals = new Animal[count];//(Animal) objectOutputStream.readObject();
            for (int i = 0; i < count; i++) {
                animals[i] = (Animal) objectOutputStream.readObject();
            }
            return animals;
        } catch (ClassCastException e) {
            throw new IllegalArgumentException();
        } catch (ClassNotFoundException e) {
            throw new IllegalArgumentException();
        } catch (IOException e) {
            throw new IllegalArgumentException();
        }
    }
}
