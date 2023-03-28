public class Square implements Polygon, Line {
    /*Uses the Polygon interface. */
    @Override //Override isn't required, but it's good practice for when you need to use it
    public void getArea(int length, int width) {
        System.out.println("The area of the square is " + (length * width));
    }

    @Override
    public void countLines(int numberOfLines) {
        System.out.println(" The number of lines = " + numberOfLines);
    }
    
}
