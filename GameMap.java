package com.domiNation;

import java.util.Scanner;

public class GameMap {

    //  OK on a créé notre première class, maintenant on va mettre toute les variables qui nous interesses dedans et si besoin demander à l'user de nous informer
    //  J'ai pas le plan sous les yeux donc je fais surement des trucs que ya pas besoin mais c'est pour l'exemple.

    private int nbPlayer = 0;
    private String[] playerName = new String[5];

    //  Bon du coup là on a une variable nombre de joueur à 0 et un tableau de string vide sans joueur dedans on va faire un truc pour demander le nombre de joeuur etc...

    public GameMap() {
        System.out.println("Bonjour, binevenue dans le jeu de DomiNations\n");
        System.out.println("Voici un cour rappel des règles: TODO");
        while (nbPlayer < 2 || nbPlayer > 4) {
            System.out.println("Veuillez saisir le nombre de joueur [2-4]");
            Scanner scan = new Scanner(System.in);
            try {
                nbPlayer = scan.nextInt();
            }
            catch (Exception e) {
                System.out.println("Le nombre de joueur saisi doit être composé de caractère numérique");
                nbPlayer = -1;
            }
            if ((nbPlayer < 2 || nbPlayer > 4) && nbPlayer != -1) {
                System.out.println("Le nombre de joueur saisi doit être entre [2-4]");
                nbPlayer = 0;
            }
        }
        System.out.println("Vous avez bien selectionné votre nombre de joueur. Veuilelz maintenant renseigner le pseudonyme de chacun d'entre eux.");
        int playerNumber = 0;
        int next = 0;
        String test;
        while (playerNumber < nbPlayer) {
            next = 0;
            System.out.println("Veuillez saisir le nom du joueur numéro " + (playerNumber + 1));
            Scanner scanNames = new Scanner(System.in);
            try {
                playerName[playerNumber] = scanNames.next();
            }
            catch (Exception e) {
                System.out.println("Veuillez rentrer un nom de joueur valide composé de caractères alphanumériques");
                next = -1;
            }
            if (next == 0) {
                playerNumber = playerNumber + 1;
            }
        }
        playerName[playerNumber] = null;
        System.out.println("Maintenant verifions que tout a bien marché");
        playerNumber = 0;
        while(playerName[playerNumber] != null) {
            System.out.println(playerName[playerNumber]);
            playerNumber = playerNumber + 1;
        }
    }
}
