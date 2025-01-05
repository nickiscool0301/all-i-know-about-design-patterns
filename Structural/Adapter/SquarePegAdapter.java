package Structural.Adapter;

public class SquarePegAdapter implements RoundHole{
    private SquarePeg squarePeg;
    public SquarePegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public void fit(double radius) {
        double diagonal = squarePeg.getWidth() * Math.sqrt(2)/2;
        if(diagonal <= radius) {
            System.out.println("fit the hole");
        } else {
            System.out.println("not fit");
        }
    }
}
