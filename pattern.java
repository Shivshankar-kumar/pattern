//WAP program to print holo pattren in Java.


import java.util.*;
public class pattern {
    public static void main(String args[]){
       

        //(1)WAP to print Holo Half pyramid.

        int n=10;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){

                //conditions

                if(i==1|j==1|i==j|i==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //(2).WAP to print HOLO Square.
        int m=10;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m;j++){

                //conditions

                if(i==1||j==1||i==n||j==m||i==j){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        //(3).WAP to print Holo Triangle

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }

                //conditions
            for(int j=1; j<=i;j++){
                if(i==1||i==n||j==1||j==m||i==j){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        //(4).WAP to print holo ryhmbos.

        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER THE HOLO RHYMBOS ROW NUMBER ");
        int rows=obj.nextInt();
        System.out.println("ENTER THE NUMBER THE COLUMNS ");
        int column=obj.nextInt();
        for(int i=1;i<=rows; i++){
            for(int j=1; j<=rows-i;j++){
                System.out.print(" ");
            }
        
            for(int j=1;j<=column; j++){
                if(i==1||i==rows||j==1||j==column){
                System.out.print("*"+" ");
            }
            else{
                System.out.print("  ");
            }
        }
            System.out.println();
        }
     } }

