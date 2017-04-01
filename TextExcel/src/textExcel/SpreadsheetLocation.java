package textExcel;

//Update this file with your own code.

public class SpreadsheetLocation implements Location
{
	private char column;
	private int row;
	
    @Override
    public int getRow()
    {
        return row;
    }

    @Override
    public int getCol()
    {
        return column;
    }
    
    public SpreadsheetLocation(String cellName)
    {
    	for(int i = 0; i < cellName.length(); i++){
    		if(i==0){
    			column = cellName.charAt(i);
    		}else{
    			row = row+=cellName.charAt(i);
    		}
    	}
    }

}
