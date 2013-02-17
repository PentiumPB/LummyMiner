import org.powerbot.game.api.methods.interactive.Players;
import org.powerbot.game.api.methods.node.SceneEntities;
import org.powerbot.game.api.methods.tab.Inventory;
import org.powerbot.game.api.methods.widget.Camera;
import org.powerbot.game.api.util.Timer;
import org.powerbot.game.api.wrappers.node.SceneObject;
import org.powerbot.core.script.ActiveScript;
import org.powerbot.core.script.job.Task;



public class mine {
	

    public int [] hatchets = {6739, 1359, 1357, 1355, 1353, 1351, 1349};
    public static int [] rocks = {3229, 38627 };
    public static int[] ore = {436, 438};
    public static int[] gems = {1617, 1623, 1619, 1621};
    
    static void powerMine() {
		SceneObject rock = SceneEntities.getNearest(settings.oreToMine);
       	if(Inventory.contains(mine.gems)) {
        drop.dropGems();
        	}
    		if(Inventory.getCount(settings.oreIs) >= 27){
        		drop.dropOre();
    	} else {
    		final Timer animationFailSafe = new Timer(2000);
            while (Players.getLocal().getAnimation() != -1){
                Task.sleep(50);
                if (!rock.validate() || Inventory.isFull())break;
                if (!animationFailSafe.isRunning() && Players.getLocal().isIdle()) break;
    	Mine();
    	}
    	}
    }

    static void mineOre() {  
       	if(Inventory.contains(mine.gems)) {
        drop.dropGems();
        	}
    	if(Inventory.getCount(settings.oreIs) >= 27){
    		drop.dropOre();
    	} else {
    		Mine();
            }
        }
        static void Mine() {
    	// Start of the new method 'chopTrees'
			SceneObject rock = SceneEntities.getNearest(settings.oreToMine);
        if (Players.getLocal().getAnimation() == -1) {              
            if (rock != null) {
               if (rock.isOnScreen()) {
                	rock.interact("Mine"); 
                    ActiveScript.sleep(2000, 3200);   
                	} else { 
                    Camera.turnTo(rock);
                }
        	
            }
    	}
	
}
}
