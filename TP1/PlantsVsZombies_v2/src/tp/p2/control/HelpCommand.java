package tp.p2.control;

import tp.p2.logic.Game;
import tp.p2.control.CommandParser;

public class HelpCommand extends NoParamsCommand{
	
	private static String commandText = "help";
	private static String commandTextMsg = "[H]elp";
	private static String helpTextMsg = "print this help message.";
	
	public HelpCommand() {
		super(commandText, commandTextMsg, helpTextMsg);
	}
	
	public NoParamsCommand parse(String[] commandWords, Controller controller) {
		if(commandWords[0].equals(this.commandName) || commandWords[0].equals(this.commandLetter)) {
			return new HelpCommand();
		}
		else {
			return null;
		}
	}
	
	public void execute(Game game, Controller controller) {
		controller.setNoPrintGameState();
		System.out.println(CommandParser.commandHelp());
	}
}
