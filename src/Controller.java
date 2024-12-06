import java.util.Arrays;
import java.util.stream.Stream;

public class Controller {

    public Controller(Viewer gui, SortedList list) {
        gui.setInputButton(e -> {
            list.add(gui.getInput());
            gui.clearInput();
        });
        gui.setSearchButton(e -> {
            gui.addResult(list.search(gui.getSearch()));
        });
    }
}
