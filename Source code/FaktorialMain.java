import java.util.Scanner;

public class FaktorialMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long awal= System.currentTimeMillis();
        long akhir=System.currentTimeMillis();
        long elapsedTime= akhir - awal;
        System.out.println("Awal waktu : "+String.valueOf(awal)+" milisecond");
        System.out.println("Input nilai yang di faktorialkan: ");
        int elemen = sc.nextInt();

        Faktorial[] fk = new Faktorial[elemen];
        for(int i=0; i<elemen; i++){
            fk[i] = new Faktorial();
            System.out.print("Data ke-"+(i+1)+": ");
            fk[i].nilai = sc.nextInt();
        }
        System.out.println("Hasil Faktorial dengan Brute Force");
        for(int i=0; i<elemen; i++){
            System.out.println("Hasil faktorial dari nilai" + fk[i].nilai+ " adalah : "+fk[i].faktorialBF(fk[i].nilai));
        }
        System.out.println("Hasil Faktorial dengan Divide Conqueror");
        for(int i=0; i<elemen; i++){
            System.out.println("Hasil faktorial dari nilai" + fk[i].nilai+ " adalah : "+fk[i].faktorialDC(fk[i].nilai));
        }

        System.out.println("Akhir waktu : "+String.valueOf(akhir)+" milisecond");
        System.out.println("Interval waktu : "+String.valueOf(elapsedTime)+" milisecond");
    }
}