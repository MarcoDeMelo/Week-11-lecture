public interface Polygon {
    /*By Default the public interface will make them all public */
    void getArea(int length, int width);

    default void getSides()
    {
        System.out.println("I can't get sides of the polygon ");
    }

    //static method
    default void getPerimiter(int... sides) //The ... is for diffirent shapes and stuff. No limit to how much you can insert with the ...
    {
        int perimiter = 0;
        for(int side: sides)
        {
            perimiter += side;
        }
        System.out.println("Perimiter: " + perimiter);

    }
}
