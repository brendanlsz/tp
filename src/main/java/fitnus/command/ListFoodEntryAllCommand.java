package fitnus.command;

import fitnus.database.EntryDatabase;
import fitnus.database.FoodDatabase;
import fitnus.utility.User;

public class ListFoodEntryAllCommand extends Command {

    public ListFoodEntryAllCommand() {

    }

    @Override
    public String execute(EntryDatabase ed, FoodDatabase fd, User us) {
        return ed.listEntries();
    }
}


