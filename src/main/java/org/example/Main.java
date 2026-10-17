package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TraitementImageContext context = new TraitementImageContext();

        int[] imageSample = {100, 150, 200, 50, 20};

        try {
            System.out.println("Entrez le nom complet de la classe de filtre (ex: FiltreFlou, FiltreNegatif, FiltreAdapter) :");
            String classNameFiltre = scanner.nextLine();

            Class<?> clazzFiltre = Class.forName(classNameFiltre);
            IFiltre filtre = (IFiltre) clazzFiltre.getDeclaredConstructor().newInstance();

            context.setFiltre(filtre);
            int[] filteredImage = context.appliquerTraitementFiltre(imageSample);

            System.out.println();

            System.out.println("Entrez le nom complet de la classe de compression (ex: CompressionRLE, CompressionHuffman) :");
            String classNameCompression = scanner.nextLine();

            Class<?> clazzCompression = Class.forName(classNameCompression);
            CompressionImage compression = (CompressionImage) clazzCompression.getDeclaredConstructor().newInstance();

            context.setCompression(compression);
            int[] finalImage = context.appliquerTraitementCompression(filteredImage);

            System.out.println("Traitement terminé avec succès !");

        } catch (Exception e) {
            System.err.println("Erreur lors du chargement dynamique : " + e.getMessage());
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


}
