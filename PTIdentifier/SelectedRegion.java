
import java.util.ArrayList;

public class SelectedRegion {
	private int area; // area of selected region
	private ArrayList<int[]> coordList; // arraylist of 2-integer pixel coordinates

	public void setArea(int area) {
		this.area = area;
	}
	
	public int getArea() {
		return area;
	}
	
	public ArrayList<int[]> getCoordList() {
		return coordList;
	}

	public void setCoords(ArrayList<int[]> coordList) {
		this.coordList = coordList;
	}
	
	public SelectedRegion() { // object constructor
		area = 0;
		coordList = new ArrayList<int[]>();
	}
	public SelectedRegion(int area, ArrayList<int[]>coordList) { // object constructor
		this.area = area;
		this.coordList = coordList;
	}


	
	public void update(int[] a) { // takes in the 2-integer array of pixel coordinates and adds it to the list of
									// coordinates
		coordList.add(a);
		area++;
	}
	
	public void reset () {
		area = 0;
		coordList = new ArrayList<int[]>();
	}


}
