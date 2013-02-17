import org.powerbot.core.script.ActiveScript;
import org.powerbot.game.api.methods.widget.Bank;


public class bank {

	private void bankLogs () {
        if (Bank.isOpen()){                   
          //  Bank.deposit(chop.logs, 0);          
            ActiveScript.sleep(800, 1200);               
            Bank.close();                    
        }   else {
            Bank.open();                     
            ActiveScript.sleep(1000 ,1400);            
        }
    } 
	
}
