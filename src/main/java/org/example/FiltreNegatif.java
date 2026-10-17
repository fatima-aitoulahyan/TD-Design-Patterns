package org.example;

public class FiltreNegatif implements IFiltre{
    @Override
    public int[] filter(int[] data) {
        System.out.println("Application du Filtre Négatif...");
        int[] result = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            result[i] = 255 - data[i];
        }
        return result;
    }
}
