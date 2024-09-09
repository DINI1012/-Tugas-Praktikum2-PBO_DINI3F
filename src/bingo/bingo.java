package bingo;

public class bingo {
    // memanggil metode verse dengan nilai 5 hingga 0
    public static void main(String[] args) {
        Verse(5);
        Verse(4);
        Verse(3);
        Verse(2);
        Verse(1);
        Verse(0);
    }

    private static void Verse(int claps) {
        // Print bagian awal dan akhir 
        System.out.println("");
        System.out.println("There was a farmer who had a dog,");
        System.out.println("And Bingo was his name-o.");

        // Print claps
        printClaps(claps);
        printLetters(claps);

        // Print bagian akhir
        System.out.println("And Bingo was his name-o.");
        System.out.println("");
    }

    private static void printClaps(int claps) {
        // Print claps
        for (int i = 0; i <= claps; i++) {
            System.out.print("(clap)- ");
        }
    }

    private static void printLetters(int claps) {
        // Print tulisan B-I-N-G-O
        switch (claps) {
            case 0: System.out.print("B-");
            case 1: System.out.print("I-");
            case 2: System.out.print("N-");
            case 3: System.out.print("G-");
            case 4: System.out.print("O-");
        }
        System.out.println(",");
    }
}


    
