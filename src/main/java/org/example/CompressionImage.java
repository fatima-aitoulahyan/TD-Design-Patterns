package org.example;

public abstract class CompressionImage {

    public final int[] compresser(int[] data) {
        System.out.println("--- Début du processus de compression ---");
        int[] preprocessed = preTraiter(data);
        int[] compressed = realiserCompression(preprocessed);
        int[] postprocessed = postTraiter(compressed);
        System.out.println("--- Fin du processus de compression ---");
        return postprocessed;
    }

    protected int[] preTraiter(int[] data) {
        System.out.println("[Template] Prétraitement standard des données image.");
        return data;
    }

    protected abstract int[] realiserCompression(int[] data);

    protected int[] postTraiter(int[] data) {
        System.out.println("[Template] Post-traitement standard.");
        return data;
    }
}