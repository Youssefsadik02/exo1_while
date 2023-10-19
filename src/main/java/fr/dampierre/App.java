package fr.dampierre;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
    int salaire_hrs=15;
    System.out.println("Entrez votre nombre d'heures travaillées:");
    int nbr_heures= sc.nextInt();
    while( nbr_heures >42){
        
        System.out.println("Entrez votre nombre d'heures travaillées:");
        nbr_heures=sc.nextInt();
    }
    int salaire= nbr_heures* salaire_hrs;
    System.out.println("votre salaire est "+ salaire);
    }
    
}
