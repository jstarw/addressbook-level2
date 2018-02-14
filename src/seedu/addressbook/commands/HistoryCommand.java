package seedu.addressbook.commands;

public class HistoryCommand extends Command {
    public static final String COMMAND_WORD = "history";

    public static final String MESSAGE_USAGE = COMMAND_WORD + " shows all the executed commands (most recent last).";

    @Override
    public CommandResult execute() {
        return new CommandResult(this.commandHistory.toString());
    }
}
