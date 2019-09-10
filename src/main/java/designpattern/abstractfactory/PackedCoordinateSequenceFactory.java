package designpattern.abstractfactory;

public class PackedCoordinateSequenceFactory extends CoordinateSequenceFactory {

    @Override
    public CoordinateSequence generate() {
        return new PackedCoordinateSequence();
    }
}
