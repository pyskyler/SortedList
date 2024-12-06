import java.util.ArrayList;

public class BinarySearchString {
    public static int search(ArrayList<String> a, int low, int high, String string)
    {

        if (low <= high)
        {
            int mid = (low + high) / 2;

            if (a.get(mid).toLowerCase().equals(string))
            {
                return mid;
            }
            else if (comesBefore(a.get(mid).toLowerCase(), string))
            {
                return search(a, mid + 1, high, string);
            }
            else
            {
                return search(a, low, mid - 1, string);
            }
        }
        else
        {
            return low;
        }
    }

    private static boolean comesBefore(String a, String b)
    {
        return a.compareTo(b) < 0;
    }
}