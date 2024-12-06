import java.util.ArrayList;

public class SortedList {

    ArrayList<String> list;

    public SortedList() {
        list = new ArrayList<String>();
    }

    public void add(String s) {
        int index = BinarySearchString.search(list, 0, list.size() - 1, s);
        list.add(index, s);
    }

    public String search(String s) {
        int index = BinarySearchString.search(list, 0, list.size() - 1, s);
        if (index < list.size() && list.get(index).equals(s)) {
            return String.format("\"%s\" found at index %d", s, index);
        } else {
            return String.format("\"%s\" not found, would be inserted at index %d", s, index);
        }
    }
}
