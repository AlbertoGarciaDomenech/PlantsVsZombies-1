package tp.p2.control;

import tp.p2.logic.Game;
import tp.p2.logic.print.*;

public class PrintModeCommand extends Command{

	private String mode;
	
	private static String commandText = "printmode";
	private static String commandTextMsg = "[P]rintMode <mode>";
	private static String helpTextMsg = "change print mode [Release|Debug].";
	
	public PrintModeCommand() {
		super(commandText, commandTextMsg, helpTextMsg);
	}
	
	public PrintModeCommand(String mode) {
		super(commandText, commandTextMsg, helpTextMsg);
		this.mode = mode;
	}
	
	public Command parse(String[] commandWords, Controller controller) {
		if((commandWords[0].equals(this.commandName) || commandWords[0].equals(this.commandLetter)) && ((commandWords.length == 2))) {
			return new PrintModeCommand(commandWords[1]);
		}
		else {
			return null;
		}
	}
	
	public void execute(Game game, Controller controller) {
		switch(mode) {
			case "release":
				controller.printer = new ReleasePrinter(game, game.getRows(), game.getCols());
				break;
			case "debug":
				controller.printer = new DebugPrinter(game);
				break;
		}
	}
	
}
