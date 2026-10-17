package org.example;

public class CompressionRLE extends CompressionImage{
    @Override
    protected int[] realiserCompression(int[] data) {
        System.out.println("Exécution de l'algorithme de compression RLE...");
        return data;
    }
}
