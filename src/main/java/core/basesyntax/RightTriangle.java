package core.basesyntax;

public class RightTriangle extends Figure implements FigureInterfaces {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getAreaFigure() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void drawFigure() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: right triangle, area: ")
                .append(getAreaFigure())
                .append(" sq.units, first leg: ")
                .append(firstLeg)
                .append(" sq.units, second leg: ")
                .append(secondLeg)
                .append(" units, color: ")
                .append(getColor());
        System.out.println(builder.toString());
    }
}
