package com.company;
import java.util.Scanner;

public class Main {
    private int Skaiciai;
    private int[] mas= new int[Skaiciai];

    public static void main(String[] args) {
        Main objektas = new Main();
        objektas.Ivedimas();
        objektas.Spausdinimas();
    }

    public void Ivedimas(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Iveskite kiek norite irasyti skaiciu: ");
        Skaiciai = sc.nextInt();
        mas = new int[Skaiciai];
        for (int i=0; i<mas.length; i++){
            System.out.println("Iveskite " + i + "-a skaiciu: ");
            mas[i]=sc.nextInt();
        }
    }

    public void Spausdinimas(){
        System.out.println("Didesni nei 100 skaiciai yra: ");
        for (int i=0; i<mas.length; i++){
            if (mas[i]>100){
                System.out.println(i + " vietoje esantis skaicius: "+mas[i]);
            }
        }
    }
}
