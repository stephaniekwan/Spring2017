package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid
{
	Cell spreadsheet[][];
	
	public Spreadsheet(int length, int width){
		spreadsheet = new EmptyCell[length][width];
	}
	
	@Override
	public String processCommand(String command)
	{
		return null;
	}

	@Override
	public int getRows()
	{
		return spreadsheet.length;
	}

	@Override
	public int getCols()
	{
		return spreadsheet[0].length;
	}

	@Override
	public Cell getCell(Location loc)
	{
		return null;
	}

	@Override
	public String getGridText()
	{
		return null;
	}

}
