package seedu.addressbook.data;

import java.util.ArrayList;
import java.util.Iterator;


/**
 * Class to save the history of commands executed.
 */
public class CommandHistory {
    private ArrayList<String> commandHistory = new ArrayList<>();

    public void addToHistory(String executedCommand) {
        this.commandHistory.add(executedCommand);
    }

    public String toString() {
        Iterator iter = this.commandHistory.iterator();
        StringBuilder result = new StringBuilder();

        while (iter.hasNext()) {
            result.append(iter.next()+ "\n");
        }

        return result.toString();
    }
}
