import java.util.Scanner;
public class mainCalon {
    public static void main(String[] args) { 
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        Calon vote = new Calon(); 
        System.out.print("Masukkan Jumlah suara : "); 
        vote.jml = sc.nextInt();
        
        int pilih[] = new int[vote.jml]; 
        String calon = "";
        System.out.println("========================================");
        System.out.println(" PEMILIHAN KETUA BEM "); 
        System.out.println("========================================");
        System.out.println("---- CALON ----");
        System.out.println("1. Haris"); 
        System.out.println("2. Dian"); 
        System.out.println("3. Rani"); 
        System.out.println("4. Bisma"); 
        
        for(int i = 0; i < vote.jml ;i++){
            System.out.print("Pilih salah satu calon : ");
            pilih[i] = sc.nextInt();
        }
        System.out.println("");
        
        int suara = vote.votingPemilihan(pilih, 0, vote.jml); 
        if(suara == 1)
        {
            vote.calon = "Haris";
        } else if(suara == 2)
        {
            vote.calon = "Dian";
        } else if(suara == 3)
        {
            vote.calon = "Rani";
        } else if (suara == 4)
        {
            vote.calon = "Bisma";

        } else
        {
            System.out.println("Pilihan yang anda masukkan tidak tersedia");
        }

        System.out.println("==========================================================================================");
        System.out.println("calon yang memiliki mayoritas suara adalah " + vote.calon + " dengan nomor " + suara);
        System.out.println("==========================================================================================");
    }
}