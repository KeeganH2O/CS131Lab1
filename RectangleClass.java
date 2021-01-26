public class RectangleClass{
	private int length, width;
	
	public RectangleClass(){
		length = 1;
		width = 1;
	}
	
	public RectangleClass(int l, int w){
		length = l;
		width = w;
	}
	
	public int calculateArea(){
		return length * width;
	}
	
	public int calculatePerimeter(){
		return 2*length + 2*width;
	}
	
	public int getWidth(){
		return width;
	}
	public int getLength(){
		return length;
	}
}