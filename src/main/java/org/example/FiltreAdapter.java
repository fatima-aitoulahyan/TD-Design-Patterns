package org.example;

public class FiltreAdapter implements IFiltre{
    private ImplNonStandard adaptee = new ImplNonStandard();

    @Override
    public int[] filter(int[] data) {
        return adaptee.appliquerFiltre("DEFAULT_FILTER", data);
    }
}
