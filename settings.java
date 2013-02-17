import org.powerbot.game.api.methods.Widgets;
import org.powerbot.game.api.methods.input.Mouse;
import org.powerbot.game.api.wrappers.Area;
import org.powerbot.game.api.wrappers.Tile;
import org.powerbot.game.api.wrappers.node.SceneObject;




public class settings {
	public final static int 
	  TIN_ID = 3028
	, TIN_ORE = 438
	, COPPER_ID = 3229
	, COPPER_ORE = 436
	, IRON_ID = 0
	, IRON_ORE = 0;

    public boolean iron(SceneObject e) {
        return e.getId() == 37307 
        || e.getId() == 37308 || e.getId() == 37309 || e.getId() == oreToMine;}
	
	public static final int ladder = 36773, ladder2 = 36774, Depo = 36788;
	
	public static boolean powerMine , isLumbridge, isBanking, iron;
	public static boolean isDropping = false;
	
	public static int oreIs, oreToMine;
	
	public static int startDrop = 0, endDrop = 0;

	public static boolean FinishedBanking;
	
	// Methods - Booleans
	static final int DEPOSITBOX = 11;
	
	
	public static final boolean isDepositOpen() {
		return Widgets.get(DEPOSITBOX, 0).validate();
	}
	public static final void DepositItems() {
		Mouse.click(Widgets.get(DEPOSITBOX, 19).getNextViewportPoint(), true);
	}

	public static final void CloseDeposit() {
		Mouse.click(Widgets.get(DEPOSITBOX, 15).getNextViewportPoint(), true);
	}
	
	/*Start of Coords
	 *  Start of Areas
	 *  Need for verification
	 */
	
	public static final Tile [] BanktoMine = {
		new Tile (3233, 3221, 0 ),
		new Tile (3233, 2191, 0), new Tile (3235, 3203, 0),
		new Tile (3235, 3205, 0), new Tile (3238, 3200 ,0),
		new Tile (3239, 3194, 0), new Tile (3241,3188,0),
		new Tile (3239,3175,0), new Tile (3237,3161,0),
		new Tile (3231, 3150,0)
	
	};
	
	public static final Tile [] TeleToBank = {
		new Tile (3234, 3211, 0), new Tile (3240, 3200, 0),
		new Tile (3241, 3184, 0), new Tile (3238, 3169, 0),
		new Tile (3233, 3153, 0), new Tile (3230, 3150, 0)};

	final static Area area = new Area(new Tile(3237, 3153, 0), new Tile(3222, 3143, 0));
	
	final static Area aftertele = new Area(new Tile(3252,3143 , 0), new Tile(3225, 3228, 0));

}
