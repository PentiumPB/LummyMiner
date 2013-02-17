import org.powerbot.core.script.ActiveScript;
import org.powerbot.core.script.job.Task;
import org.powerbot.core.script.job.state.Node;
import org.powerbot.game.api.methods.Calculations;
import org.powerbot.game.api.methods.Walking;
import org.powerbot.game.api.methods.Widgets;
import org.powerbot.game.api.methods.interactive.Players;
import org.powerbot.game.api.methods.node.SceneEntities;
import org.powerbot.game.api.methods.tab.Inventory;
import org.powerbot.game.api.methods.widget.DepositBox;
import org.powerbot.game.api.util.Random;
import org.powerbot.game.api.wrappers.node.Item;
import org.powerbot.game.api.wrappers.node.SceneObject;
	
public class walktoBank extends Node {
		@Override
		public boolean activate() {
			if(Inventory.isFull() && (settings.isBanking = true)) {
				return true;
			}
			if (settings.powerMine = true) {
				return false;
		}
			return false;
			
		}
		
		
		@Override
		public void execute() { 
			if (settings.area.contains(Players.getLocal().getLocation())) {
			Lodestone.teleportTo(Lodestone.LUMBRIDGE);
			} else {
			if (DepositBox.open()){
                DepositBox.depositInventory();
                DepositBox.close();
                Task.sleep(Random.nextInt(600, 750));
			}
				 if (SceneEntities.getNearest(settings.Depo) != null && Inventory.isFull()) {
						SceneObject Deposit = SceneEntities.getNearest(settings.Depo);
			if (Deposit.isOnScreen()) {
				if (!Players.getLocal().isMoving()) { //cheap fix for spam clicking :D
				Deposit.interact("Deposit");
				}
			} else {
				Walking.walk(Deposit);
			}
			}
			 if (SceneEntities.getNearest(settings.ladder) != null) {
					SceneObject ladder = SceneEntities.getNearest(settings.ladder);
			 if (!ladder.isOnScreen() && !Players.getLocal().isMoving()) {
			 Walking.walk(ladder.getLocation());
			 sleep(300, 500);
			 }
			 if (ladder.isOnScreen()) {
			 ladder.interact("Climb-up");
			 sleep(800, 1200);
			 }
			 }
			 if (SceneEntities.getNearest(settings.ladder2) != null) {
					SceneObject ladder2 = SceneEntities.getNearest(settings.ladder2);
			 if (!ladder2.isOnScreen() && !Players.getLocal().isMoving()) {
			 Walking.walk(ladder2.getLocation());
			 sleep(300, 500);
			 }
			 if (ladder2.isOnScreen()) {
			 ladder2.interact("Climb-up");
			 sleep(800, 1200);
			 }
			 }
	        }
		}
}