import java.util.ArrayList;
import java.util.List;

import org.powerbot.core.script.ActiveScript;
import org.powerbot.core.script.job.state.Node;
import org.powerbot.core.script.job.state.Tree;
import org.powerbot.game.api.Manifest;
import org.powerbot.game.api.methods.interactive.Players;

	@Manifest(authors = {"Ben_C"}, description = "Mining Script - Supports: Copper, Tin, More coming soon.", name = "Pentium Mining Script")
	
public class main extends ActiveScript {
	
	GUI g = new GUI();
	Node[] nodeList;
	private Tree container = null;
	static List<Node> jobs = new ArrayList<Node>();
    
    public void onStart(){
	  	System.out.println("Script Starting"); // A message shown when the script starts
	  	g.setVisible(true);
		while (g.isRunning() && g.isRunning() && g.isVisible()) { 
		if (!g.isRunning()) {
        g.dispose();
        stop();
        System.out.println("Stopped Script");
			}
		}
		StartJobs();
}
	
	@Override
	public int loop() {
				if(container != null) {
					final Node job = container.state();
					if(job != null) {
						container.set(job);
						getContainer().submit(job);
						job.join();
					} 
				}
		return 25;
	}
	
	public void StartJobs(){ // cleaner startup
		
		if (!g.isVisible()) {
			//start of jobs
			jobs.add(new drop());
			jobs.add(new openActionBar());
			jobs.add(new mine());
			jobs.add(new BacktoMine());
			jobs.add(new walktoBank());
			//end of jobs
			container = new Tree(jobs.toArray((new Node[jobs.size()])));
		}
	}
}