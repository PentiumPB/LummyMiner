
	import org.powerbot.core.script.job.Task;
import org.powerbot.core.script.job.state.Node;
import org.powerbot.game.api.methods.Widgets;
import org.powerbot.game.api.methods.interactive.NPCs;
import org.powerbot.game.api.methods.interactive.Players;
import org.powerbot.game.api.methods.node.Menu;
import org.powerbot.game.api.methods.tab.Inventory;
import org.powerbot.game.api.methods.widget.Bank;
import org.powerbot.game.api.util.Random;
import org.powerbot.game.api.wrappers.interactive.NPC;
import org.powerbot.game.api.wrappers.map.TilePath;
	
public class BacktoMine extends Node {

		@Override
		public boolean activate() {
			if(!Inventory.isFull() && (!settings.area.contains(Players.getLocal().getLocation()))) {
				return true;
			}
			return false;
			
		}

		@Override
		public void execute() {
			if (!settings.aftertele.contains(Players.getLocal().getLocation()) && (!Inventory.isFull())) {
				Lodestone.teleportTo(Lodestone.LUMBRIDGE);
			} else {
				TilePath path = new TilePath(settings.BanktoMine);
				path.traverse();
			}
		}

}
