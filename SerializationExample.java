package HARSH40;
import java.io.*;

class Person implements Serializable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person(name='" + name + "', age=" + age + ")";
        
    }
}

public class SerializationExample {
    public static void main(String[] args) {
        Person person = new Person("Suyash", 21);
        String filename = "person.ser";

        // Serialize the object
        serializeObject(person, filename);
        System.out.println("Object serialized and saved to '" + filename + "'.");

        // Deserialize the object
        Person loadedPerson = deserializeObject(filename);
        System.out.println("Object loaded from '" + filename + "': " + loadedPerson);
        System.out.println("\n**End Of Program**");
        System.out.println("*****************************************************************");
        System.out.println("Implemented By:Suyash Dabral\tClass Roll No. 73\tCSE4(E)");
        System.out.println("*****************************************************************");
    }

    private static void serializeObject(Object obj, String filename) {
        try (FileOutputStream fileOut = new FileOutputStream(filename);
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Person deserializeObject(String filename) {
        try (FileInputStream fileIn = new FileInputStream(filename);
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            return (Person) objectIn.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}