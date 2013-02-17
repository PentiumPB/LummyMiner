import java.awt.event.KeyEvent;

import org.powerbot.core.script.job.Task;
import org.powerbot.core.script.job.state.Node;
import org.powerbot.game.api.methods.input.Keyboard;
import org.powerbot.game.api.methods.tab.Inventory;


public class drop extends Node {

	@Override
	public boolean activate() {
		if(settings.powerMine = true && (Inventory.isFull())){
			return true;
		}
		return false;
		
	}

	@Override
	public void execute() {
		settings.isDropping = true;
		while (Inventory.getItem(settings.oreIs) != null){  
		Keyboard.sendKey((char) KeyEvent.VK_1);
		Task.sleep(settings.startDrop, settings.endDrop);
		}
	}
	
}
