package epaminterview;

import java.util.ArrayList;
import java.util.List;

/**
 * VersionedList
 * To implement the VersionedList class as described, you can use a list of
 * lists (ArrayList of ArrayList)
 * to store different versions of the array. Each time 'saveCurrentVersion()' is
 * called, a new version is created with all elements
 * initialized to 0. When 'set()' is called, it updates the current version.
 * When 'get()' is called, it retrieves the value
 * from the specified version.
 */
public class VersionedList {

    // define instance variables
    private List<List<Integer>> versions;
    private int currentVersionIndex;

    // Argumented constructor
    public VersionedList(int length) {
        // create new list
        versions = new ArrayList<>();
        versions.add(new ArrayList<>(length));// Adding initial version with all elements as 0

        for (int i = 0; i < length; i++) {
            versions.get(0).add(0);
        }
        currentVersionIndex = 0;
    }

    public void set(int index, int value) {
        versions.get(currentVersionIndex).set(index, value);
    }

    public void saveCurrentVersion() {
        List<Integer> newVersion = new ArrayList<>(versions.get(currentVersionIndex));
        versions.add(newVersion);
        currentVersionIndex++;
    }

    public int get(int index, int version) {
        if (version < 0 || version > currentVersionIndex) {
            throw new IllegalArgumentException("Invalid version");
        }
        return versions.get(version).get(index);
    }

    public static void main(String[] args) {
        VersionedList list = new VersionedList(3);
        list.set(0, 5);
        list.saveCurrentVersion();
        list.set(0, 6);
        System.out.println(list.get(0, 0));
        System.out.println(list.get(0, 1));
    }

}