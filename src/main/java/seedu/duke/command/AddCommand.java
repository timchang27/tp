package seedu.duke.command;

import java.util.Date;

import seedu.duke.Packages;
import seedu.duke.Reservations;
import seedu.duke.TravelPackage;

public class AddCommand extends Command {
    private TravelPackage newPackage;

    public AddCommand(String name, int date1, int date2, String hotel, double price, String country,
            int maxVacancies) {
        this.newPackage = new TravelPackage(name, new Date(date1), new Date(date2), hotel, price, country,
                maxVacancies);
    }

    public void execute(Packages packages, Reservations r) {
        packages.addPackage(newPackage);
    }
}
