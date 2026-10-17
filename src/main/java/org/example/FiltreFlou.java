package org.example;

public class FiltreFlou implements IFiltre{
    @Override
    public int[] filter(int[] data) {
        System.out.println("Application du Filtre Flou...");
        int[] result = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            result[i] = data[i] / 2;
        }
        return result;
    }


}
