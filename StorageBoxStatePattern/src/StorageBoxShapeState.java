
public class StorageBoxShapeState {
	
	private Shape s = new RoundShape();
	
	public void developShape(){
		
		s = new SquareShape();
		
	}
	
public void changeShape(){
		
		s = new RectangleShape();
		
	}
	
	public void startManufactuaring() {
		s.createShape();
		 
	}
	

}
