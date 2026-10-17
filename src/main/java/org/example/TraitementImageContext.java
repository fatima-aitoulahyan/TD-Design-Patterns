package org.example;

public class TraitementImageContext {
    private IFiltre filtre;
    private CompressionImage compression;

    public void setFiltre(IFiltre filtre) {
        this.filtre = filtre;
    }

    public void setCompression(CompressionImage compression) {
        this.compression = compression;
    }

    public int[] appliquerTraitementFiltre(int[] data) {
        if (filtre == null) {
            throw new IllegalStateException("Aucun filtre n'a été défini !");
        }
        return filtre.filter(data);
    }

    public int[] appliquerTraitementCompression(int[] data) {
        if (compression == null) {
            throw new IllegalStateException("Aucune stratégie de compression n'a été définie !");
        }
        return compression.compresser(data);
    }
}