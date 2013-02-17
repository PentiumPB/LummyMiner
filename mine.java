import org.powerbot.core.script.ActiveScript;
import org.powerbot.core.script.job.Task;
import org.powerbot.core.script.job.state.Node;
import org.powerbot.game.api.methods.interactive.Players;
import org.powerbot.game.api.methods.node.SceneEntities;
import org.powerbot.game.api.methods.tab.Inventory;
import org.powerbot.game.api.methods.widget.Camera;
import org.powerbot.game.api.util.Filter;
import org.powerbot.game.api.wrappers.node.SceneObject;

public class mine extends Node {
	
    public static int[] gems = {1617, 1623, 1619, 1621};

    
    static void Mine() {
        SceneObject rock = SceneEntities.getNearest(new Filter<SceneObject>() { 
            @Override
            public boolean accept(SceneObject e) {
                    return e.getId() == settings.oreToMine || e.getId() == 72081 || e.getId() == 72083 || e.getId() == 72085;
            }});
        if (Players.getLocal().getAnimation() == -1) {   
        	if (rock != null) {
            if (rock.isOnScreen()) {
                    rock.interact("Mine");
                    Task.sleep(600,1000);
            } else {
                Camera.turnTo(rock);
            }
        }
    }
}
    
    
    
	@Override
	public boolean activate() {
		if (!Inventory.isFull() ){
			return true;
		} 
		return false;
		
	}
	
	@Override
	public void execute() {
            Mine();
            ActiveScript.sleep(300, 900);  
	}
   }
