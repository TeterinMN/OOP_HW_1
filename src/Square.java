class Square extends Rectangle {
    private final double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side * side;
    }

    @Override
    double calculatePerimeter() {
        return 4 * side;
    }
}
