package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();

        bulldozers.add(new Bulldozer("Caterpillar", "Bulldozer-1", "Yellow"));
        bulldozers.add(new Bulldozer("Komatsu", "Bulldozer-2", "Red"));
        bulldozers.add(new Bulldozer("John Deere", "Bulldozer-3", "Green"));

        return bulldozers;
    }
}
