package designpattern.abstractfactory;

public class CoordinateArraySequence implements CoordinateSequence {

    private Coordinate[] coordinates;

    @Override
    public Coordinate get(int index) {
        return coordinates[index];
    }
}
