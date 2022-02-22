package core.basesyntax;

public class Square extends Figure implements AreaCalculator {
    private int squareSide;

    public Square(int squareSide) {
        this.squareSide = squareSide;
    }

    @Override
    public double getAreaFigure() {
        return squareSide * squareSide;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: square, area: ")
                .append(getAreaFigure())
                .append(" sq.units, squareSide: ")
                .append(squareSide)
                .append(" units, color: ")
                .append(getColor());
        System.out.println(builder.toString());
    }
}
