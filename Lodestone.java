import org.powerbot.core.script.job.Task;
import org.powerbot.game.api.methods.Tabs;
import org.powerbot.game.api.methods.input.Mouse;
import org.powerbot.game.api.methods.interactive.Players;
import org.powerbot.game.api.wrappers.Area;
import org.powerbot.game.api.wrappers.Tile;
import org.powerbot.game.api.wrappers.widget.Widget;
import org.powerbot.game.api.wrappers.widget.WidgetChild;

/**
 * Created with IntelliJ IDEA.
 * User: Andrew
 * Date: 2/11/13
 * Time: 9:45 PM
 * To change this template use File | Settings | File Templates.
 */

public class Lodestone {

    public final static WidgetChild MAGIC_TAB_ON_ABIL = new Widget(275).getChild(33);
    public final static WidgetChild TELEPORT_TAB_ON_ABIL = new Widget(275).getChild(47);
    public final static WidgetChild HOME_TELEPORT_ON_ABIL = new Widget(275).getChild(18).getChild(155);
    public final static WidgetChild TELEPORTATION_INTERFACE = new Widget(1092).getChild(8);


    //Widget children for teleportation locations
    public final static WidgetChild LUMBRIDGE = new Widget(1092).getChild(47);

    //Arrival areas
    public final static Area LUMBRIDGE_ARRIVAL_AREA = new Area(new Tile[] { new Tile(3228, 3226, 0), new Tile(3236, 3226, 0), new Tile(3236, 3216, 0),
            new Tile(3228, 3216, 0) });

    public static final String db = "[DEBUG]";
    public static final String inf = "[INFO]";

    public static void logIt(String type, String message) {
        System.out.println(type + message);
    }

    public static boolean isPlayerTeleporting() {
        return Players.getLocal().getAnimation() == 16385;
    }


    /**
     *
     * @param location : The location of the lodestone we will teleport to, a list of locations are provided in this class
     * @return : returns true if the player is teleporting
     */
    public static boolean teleportTo(WidgetChild location) {
        Tabs.ABILITY_BOOK.open();

        if (!isPlayerTeleporting()) {

            if (!TELEPORT_TAB_ON_ABIL.validate()) {
                logIt(db, "Teleport tab on our ability bar not visible, opening magic tab.");
                Mouse.click(MAGIC_TAB_ON_ABIL.getCentralPoint(), true);
            } else {
                if (!HOME_TELEPORT_ON_ABIL.validate()) {
                    logIt(db, "Home teleport spell(s) not visible, opening teleports tab in ability book.");
                    Mouse.click(TELEPORT_TAB_ON_ABIL.getCentralPoint(), true);
                }
                if (!TELEPORTATION_INTERFACE.validate()) {
                    logIt(db, "Teleportation interface not visible, opening");
                    Mouse.click(HOME_TELEPORT_ON_ABIL.getCentralPoint(), true);
                } else {
                    if (!isPlayerTeleporting()) {
                        logIt(db, "Trying to click on teleport");
                        Mouse.click(location.getCentralPoint(), true);
                        Task.sleep(1500);
                    }
                }
            }
        }

        return isPlayerTeleporting();
    }

    /**
     *
     * @param location: The location of the lodestone we will teleport to, a list of locations are provided in this class
     * @param arrivalArea: The area we will arrive at if we teleport, this will be used to tell if we are in the arrival area or not.
     *                   Note: in order for this to work, the location and the arrival area must be in the same location.
     *                   Example: teleportTo(VARROCK, VARROCK_ARRIVAL_AREA);
     * @return : returns true if we are not at the arrival area, returns false otherwise.
     */
    public static boolean teleportTo(WidgetChild location, Area arrivalArea) {
        Tabs.ABILITY_BOOK.open();

        if (!isPlayerTeleporting()) {

            if (!TELEPORT_TAB_ON_ABIL.validate()) {
                logIt(db, "Teleport tab on our ability bar not visible, opening magic tab.");
                Mouse.click(MAGIC_TAB_ON_ABIL.getCentralPoint(), true);
            } else {
                if (!HOME_TELEPORT_ON_ABIL.validate()) {
                    logIt(db, "Home teleport spell(s) not visible, opening teleports tab in ability book.");
                    Mouse.click(TELEPORT_TAB_ON_ABIL.getCentralPoint(), true);
                }
                if (!TELEPORTATION_INTERFACE.validate()) {
                    logIt(db, "Teleportation interface not visible, opening");
                    Mouse.click(HOME_TELEPORT_ON_ABIL.getCentralPoint(), true);
                } else {
                    if (!isPlayerTeleporting()) {
                        logIt(db, "Trying to click on teleport");
                        Mouse.click(location.getCentralPoint(), true);
                        Task.sleep(1500);
                    }
                }
            }
        }

        return arrivalArea.contains(Players.getLocal());
    }



}