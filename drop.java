import java.awt.event.KeyEvent;

import org.powerbot.core.script.job.Task;
import org.powerbot.game.api.methods.Widgets;
import org.powerbot.game.api.methods.input.Keyboard;
import org.powerbot.game.api.methods.tab.Inventory;


public class drop {


    static void dropOre () { 
    	while (Inventory.getItem(settings.oreIs) != null){  
    		if (Widgets.canContinue()) {
        		Keyboard.sendKey((char) KeyEvent.VK_SPACE);
    			Widgets.clickContinue();
    		}
        	if (ActionBar.isOpen()) {
        		Keyboard.sendKey((char) KeyEvent.VK_1);
        		Task.sleep(settings.startDrop, settings.endDrop);
        	} else {
        		ActionBar.open();
        }
    	}
		Task.sleep(300, 400);
    }
    
    static void dropGems () { 
    	while (Inventory.getItem(mine.gems) != null){   
                Inventory.getItem(mine.gems).getWidgetChild().interact("Drop"); 
        		Task.sleep(100, 200);
    	}
		Task.sleep(300, 400);
    }
    
	
}
