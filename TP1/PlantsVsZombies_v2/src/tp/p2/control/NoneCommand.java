package tp.p2.control;

import tp.p2.logic.Game;

public class NoneCommand extends NoParamsCommand {
	
	private static String commandText = "none";
	private static String commandTextMsg = "none";
	private static String helpTextMsg = "skips cycle.";
	
	public NoneCommand() {
		super(commandText, commandTextMsg, helpTextMsg);
	}
	
	public NoParamsCommand parse(String[] commandWords, Controller controller) {
		if(commandWords[0].equals(this.commandName) || commandWords[0].equals(this.commandLetter) || commandWords[0].equals("")) {
			return new NoneCommand();
		}
		else {
			return null;
		}
	}
	
	public void execute(Game game, Controller controller) {
		
	}
}
