import org.powerbot.core.script.ActiveScript;
import org.powerbot.game.api.Manifest;
import org.powerbot.game.api.methods.Game;
import org.powerbot.game.api.methods.Widgets;
import org.powerbot.game.api.methods.interactive.Players;
import org.powerbot.game.api.util.Time;

@Manifest(authors ={"Ben_C"}, name = "Pentium Miner", description = "A Thank You To RedJack, for Basics around Script Writing. Mining, Tin, Copper, Other ores coming Soon.", version = 0.1)

public class Miner extends ActiveScript {
	
	
    	
    public void onStart(){
    	  	System.out.println("Script Starting"); // A message shown when the script starts
    	  	GUI g = new GUI();
    	  	g.setVisible(true);
    		while (g.isRunning() && g.isRunning() && g.isVisible()) { 
    		if (!g.isRunning()) {
            g.dispose();
            stop();
            System.out.println("Stopped Script");
    			}
    		}
    }
    
    @Override
    public int loop() {
    	if (settings.powerMine = true) {
    		mine.powerMine();
    	} else {
    	mine.mineOre();
    	}
        return 25; // Change the '0' here to '50'

    }     
   

}
	
