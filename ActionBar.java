
import org.powerbot.game.api.methods.Widgets;

/**
 * Created with IntelliJ IDEA.
 * User: Sharon
 * Date: 11/24/12
 * Time: 12:45 AM
 * To change this template use File | Settings | File Templates.
 */

public class ActionBar
{
	public static final int WIDGET_BAR = 640;
	public static final int WIDGET_OPEN_TOGGLE = 3;
	public static final int WIDGET_OPEN_BAR = 4;
	
	public static boolean isOpen() {
		return (Widgets.get(WIDGET_BAR, WIDGET_OPEN_BAR) != null ? Widgets.get(
				WIDGET_BAR, WIDGET_OPEN_BAR).isOnScreen() : false);
	}

	public static boolean open() {
		return (Widgets.get(WIDGET_BAR, WIDGET_OPEN_TOGGLE) != null ? isOpen()
				|| Widgets.get(WIDGET_BAR, WIDGET_OPEN_TOGGLE).interact(
						"Expand") : false);
	}
}