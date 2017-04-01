package textExcel;
public class EmptyCell implements Cell {

	public EmptyCell() {

	}

	@Override
	public String abbreviatedCellText() {
		return "          ";
	}

	@Override
	public String fullCellText() {
		return "";
	}

}
