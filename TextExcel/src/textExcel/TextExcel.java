package textExcel;

import java.util.*;


public class TextExcel
{

	public static void main(String[] args)
	{
		Spreadsheet sprdsht = new Spreadsheet(12, 20);
		Scanner	userInput = new Scanner(System.in);
		while(!userInput.equals("quit")){
			String command = userInput.nextLine();
			sprdsht.processCommand(command);
		}
		userInput.close();
	}
}
