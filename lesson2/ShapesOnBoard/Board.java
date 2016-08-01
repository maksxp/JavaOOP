
public class Board {
private Shape [] placesOnBoard;
public Board() {
	placesOnBoard = new Shape [4];
}
//adds specified shape into specified place
public void addShape (Shape shape, int place){
	if (place<5&&place>0){
	if (placesOnBoard[place-1]==null){
		placesOnBoard[place-1]=shape;
	System.out.println(shape+"'s been added succesful on the place "+place);}
	else 
	System.out.println("place is busy already, please choose another one");	
}
else
	System.out.println("there is no such place on the board");
}
//removes any shape from specified place
public void removeShape (int place){
	if (place<5&&place>0){
	if (!(placesOnBoard[place-1]==null)){
		Shape temp = placesOnBoard[place-1];//uses in println method
		placesOnBoard[place-1]=null;
	System.out.println(temp+"'s been removed succesful from the place "+place);}
	else
	System.out.println("there is no such shape in this place");	}
	else
		System.out.println("there is no such place on the board");
}
public void showAllShapes (){
	for (int i=0;i<placesOnBoard.length;i++) {
		if (!(placesOnBoard[i]==null)){
			int s=i; // uses to show the place correct(without zero)
			//prints all shapes(toString) and place they hold
			System.out.print("| "+placesOnBoard[i]+" on the "+ ++s +" place ");
		}
	}
	System.out.println();
}
public void showTotalArea (){
	double area = 0;
	for (Shape shape : placesOnBoard) {
		if (!(shape==null)){
			area=area+shape.getArea();
		}
	}
	System.out.println("Total area is "+area);
}
public void showTotalPerimeter (){
	double perimeter =0;
	for (Shape shape : placesOnBoard) {
		if (!(shape==null)){
			perimeter=perimeter+shape.getPerimeter();
		}
	}
	System.out.println("Total area is "+perimeter);
}
}
