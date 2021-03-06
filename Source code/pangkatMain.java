import java.util.Scanner;

public class pangkatMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pangkat[] png = new Pangkat[5];
        
        png[0] = new Pangkat(10,2);
        png[1] = new Pangkat(8,3);
        png[2] = new Pangkat(4,2);
        png[3] = new Pangkat(3,5);
        png[4] = new Pangkat(8,3);

        System.out.println("==========================================");
        System.out.println("Pilih metode untuk menjalankan program ini (1. brute force & 2. divide conqueror)");
        int pilih = sc.nextInt();
        if(pilih == 1){
        System.out.println("Hasil pangkat dengan Brute Force");
        for(int i = 0;i<5;i++){
            System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah : "+png[i].pangkatBF(png[i].nilai,png[i].pangkat));
        }System.out.println("=========================================");
        }
        else{
        System.out.println("Hasil pangkat dengan Divide Conquer");
        for(int i = 0;i<5;i++){
            System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah : "+png[i].pangkatDC(png[i].nilai,png[i].pangkat));
        }
        }
    }
}