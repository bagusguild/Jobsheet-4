#LAPORAN JOBSHEET 4 PRAKTIKUM STRUKTUR DATA

Created by : <p>
Bagus Dwi Putranto <p>
1F D4 Teknik Informatika <p>
2141720079 <p>

# 4.2 Menghitung Nilai Faktorial dengan Algoritma Brute Force dan Divide and Conquer <p>
## 4.2.1 Langkah-langkah Percobaan
1. Buat Project baru, dengan nama “BruteForceDivideConquer”. Buat package dengan nama 
minggu5.
2. Buatlah class baru dengan nama Faktorial<p>
3. Lengkapi class Faktorial dengan atribut dan method yang telah digambarkan di dalam diagram class di atas, sebagai berikut: <p>
a) Tambahkan atribut nilai <p>
public class Faktorial {
    public int nilai;
}
b) Tambahkan method faktorialBF() nilai <p>
public class Faktorial {
    public int nilai;

    int faktorialBF(int n){
        int fakto = 1;
        for(int i=1; i<=n; i++){
            fakto *= i;
        }
        return fakto;
    }
}
c) Tambahkan method faktorialDC() nilai <p>
public class Faktorial {
    public int nilai;

    int faktorialBF(int n){
        int fakto = 1;
        for(int i=1; i<=n; i++){
            fakto *= i;
        }
        return fakto;
    }
    int faktorialDC(int n){
        if(n==1){
            return 1;
        }else{
            int fakto = n*faktorialDC(n-1);
            return fakto;
        }
    }
}
4. Coba jalankan (Run) class Faktorial dengan membuat class baru MainFaktorial.<p>
a) Di dalam fungsi main sediakan komunikasi dengan user untuk menginputkan jumlah angka yang akan dicari nilai faktorialnya <p>

b) Buat Array of Objek pada fungsi main, kemudian inputkan beberapa nilai yang akan dihitung faktorialnya <p>

c) Tampilkan hasil pemanggilan method faktorialDC() dan faktorialBF() <p>
<img src="faktorial output 1.PNG"> <p>
<img src="faktorial output 2.PNG"> <p>
d) Pastikan program sudah berjalan dengan baik!

## 4.2.2 Verifikasi Hasil Percobaan <>
Cocokkan hasil compile kode program anda dengan gambar berikut ini.<p>
<img src="faktorial output 1.PNG"> <p>
<img src="faktorial output 2.PNG"> <p>

## 4.2.3 Pertanyaan
1. Jelaskan mengenai base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial!
> : Dalam base line Algoritma Divide Conquer pada class factorial menggunakan pemilihan if (n==1) return 1; yang artinya jika nilai yang akan dimasukkan nantinya adalah 1 maka hasil yang akan ditampilkan olehprogram main nantinya adalah 1 dan berfungsi sebagai batas dari divide conquer dimana perulangan kali akan berakhir saat n sudah sama dengan 1.
2. Pada implementasi Algoritma Divide and Conquer Faktorial apakah lengkap terdiri dari 3 tahapan divide, conquer, combine? Jelaskan masing-masing bagiannya pada kode program!
> :  Pada percobaan 1 implementasi Algoritma Divide and Conquer sudah lengkap terdiri dari 3 tahapan dimana :
a. Dalam kodingan percobaan 1 faktorial, divide ditujukan oleh adanya pemecahan masalah menjadi 2 upa masalah yang diisyaratkan dengan kondisi pemilihan if-else dimana if berperan sebagai base case dan else sebagai rekursif call.<p>

b. Dalam kodingan percobaan 1 faktorial, conquer ditujukan oleh adanya penyelesaian masalah secara reqursif dimana upa masalah diselesaikan masing-masing yang telah diisyaratkan pada codingan dalam else yang memberikan rumus int fakto = n * faktorialDC(n-1); yang berarti nanti setiap upa masalah akan dikalikan sendiri-sendiri.<p>

c. Dalam kodingan percobaan 1 faktorial, combine ditujukan oleh adanya penarikan hasil keseluruhan berupa return atau pengembalian nilai dari proses rekursif pada tahap conquer yang
diisyaratkan pada return fakto; di else dalam method faktorialDC(); <p>

3. Apakah memungkinkan perulangan pada method faktorialBF() dirubah selain menggunakan for?Buktikan!
> : Bisa, selama termasuk looping maka jenis looping apapun bisa digunakan pada method faktorialBF() dan saya sudah mencoba membuktikannya dengan looping jenis while dan program tetap berjalan dengan baik
4. Tambahkan pegecekan waktu eksekusi kedua jenis method tersebut! <p>
> : <img src="faktorial output 1.png"> <p>
<img src="faktorial output 2.png"> <p>


5. Buktikan dengan inputan elemen yang di atas 20 angka, apakah ada perbedaan waktu eksekusi?
> : <img src="faktorial output 1.png"> <p>
<img src="faktorial output 2.png"> <p>

# 4.3 Menghitung Hasil Pangkat dengan Algoritma Brute Force dan Divide and Conquer
## 4.3.1 Langkah-langkah Percobaan
1. Di dalam paket minggu5, buatlah class baru dengan nama Pangkat. Dan di dalam class Pangkat 
tersebut, buat atribut angka yang akan dipangkatkan sekaligus dengan angka pemangkatnya <p>

2. Pada class Pangkat tersebut, tambahkan method PangkatBF() <p>

3. Pada class Pangkat juga tambahkan method PangkatDC() <p>

4. Perhatikan apakah sudah tidak ada kesalahan yang muncul dalam pembuatan class Pangkat
5. Selanjutnya buat class baru yang di dalamnya terdapat method main. Class tersebut dapat dinamakan MainPangkat. Tambahkan kode pada class main untuk menginputkan jumlah nilai yang akan dihitung pangkatnya. <p>

6. Nilai pada tahap 5 selanjutnya digunakan untuk instansiasi array of objek. Di dalam Kode berikut ditambahkan proses pengisian beberapa nilai yang akan dipangkatkan sekaligus dengan pemangkatnya. <p>

7. Kemudian, panggil hasil nya dengan mengeluarkan return value dari method PangkatBF() dan PangkatDC(). <p>

## 4.3.2 Verifikasi Hasil Percobaan
<img src="output pangkat.png">

## 4.3.3 Pertanyaan
1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu PangkatBF() dan PangkatDC()!
> : - Pada method pangkatBF() operasi mencari hitung hasil pangkat dilakukan dengan cara bruteforce yang dilakukan dengan iterative/perulangan/looping dan algoritma brute forcenya adalah mendeklarasikan dahulu hasil = 1 lalu melakukan perulangan dengan batas n (pangkatnya) dan dalam perulangan tersebut dilakukan looping dari hasil tadi di kali dengan a (bilangan yang akan dipangkat) dan perulangan akan terus berlanjut hingga < n sehingga a akan menghasilkan nilai hasil dari pemangkatannya. <p>
- Pada method pangkatDC() operasi mencari hitung hasil pangkat dilakukan dengan cara divide conquer yang dilakukan dengan rekursif dan algoritma divide conquer yang dilakukan terbagi 
dalam 3 tahap yaitu : divide => memecah masalah jadi beberapa masalah yang diimplementasikan dalam pemilihan kondisi berupa if-else pada method, lalu ada conquer => penyelesaian dari 
setiap beberapa masalah yang tercantum pada else dan terakhir ada combine => menggabungkan kembali menjadi sebuah solusi yang diimplementasikan pada return an di else.
2. Pada method PangkatDC() terdapat potongan program sebagai berikut: <p>

Jelaskan arti potongan kode tersebut
> : - Jika n (pangkat bilangan) dimodulus 2 hasilnya adalah 1 maka returnnya (kembalian nilai) adalah hasil dari (pangkatDC(a,n/2)*pangkatDC(a, n/2)*a) karena bilangan pangkatnya adalah ganjil <p>
- Jika n (pangkat bilangan) dimodulus 2 hasilnya adalah tidak sama dengan 1 maka returnnya (kembalian nilai) adalah hasil dari (pangkatDC(a,n/2)*pangkatDC(a, n/2) karena bilangan pangkatnya adalah genap
3. Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan!
> : Sudah, tahap combine dalam kode tersebut ditunjukan pada sintaks return atau pengembalian nilai dimana hasil dari conquer atau penyelesaian upa masalah sebelumnya di return kan semua dan dalam tahap combine dilakukan pemanggilan hasil dari bilangan berpangkat tersebut.
4. Modifikasi kode program tersebut, anggap proses pengisian atribut dilakukan dengan konstruktor. <p>
> : <img src="output pangkat.png">
5. Tambahkan menu agar salah satu method yang terpilih saja yang akan dijalankan! <p>
> :  <img src="output pangkat.png">

# 4.4 Menghitung Sum Array dengan Algoritma Brute Force dan Divide and Conquer
## 4.4.1 Langkah-langkah Percobaan
1. Pada paket minggu5. Buat class baru yaitu class Sum. DI salam class tersebut terdapat beberapa 
atribut jumlah elemen array, array, dan juga total. Tambahkan pula konstruktor pada class Sum. <p>
public class sum {
    int elemen;
    double keuntungan[];
    double total;
}
2. Tambahkan method TotalBF() yang akan menghitung total nilai array dengan cara iterative. <p>
public class sum {
    int elemen;
    double keuntungan[];
    double total;

    double totalBF(double arr[]){
        for (int i=0; i<arr.length;i++){
        total = total + arr[i];
        }
        return total;
    }
}
3. Tambahkan pula method TotalDC() untuk implementasi perhitungan nilai total array menggunakan algoritma Divide and Conquer <p>
public class sum {
    int elemen;
    double keuntungan[];
    double total;

    double totalBF(double arr[]){
        for (int i=0; i<arr.length;i++){
        total = total + arr[i];
        }
        return total;
    }

    double totalDC(double arr[],int l, int r){
        if(l==r)
        return arr[l];
        else if(l<r){
            int mid=(l+r)/2;
            double lsum = totalDC(arr,l,mid-1);
            double rsum = totalDC(arr,mid+1,r);
            return lsum+rsum+arr[mid];
        }return 0;
    }
}
4. Buat class baru yaitu MainSum. Di dalam kelas ini terdapat method main. Pada method ini user dapat menuliskan berapa bulan keuntungan yang akan dihitung. Dalam kelas ini sekaligus dibuat instansiasi objek untuk memanggil atribut ataupun fungsi pada class Sum <p>

5. Karena yang akan dihitung adalah total nilai keuntungan, maka ditambahkan pula pada method main mana array yang akan dihitung. Array tersebut merupakan atribut yang terdapat di class Sum, maka dari itu dibutuhkan pembuatan objek Sum terlebih dahulu. <p>

6. Tampilkan hasil perhitungan melalui objek yang telah dibuat untuk kedua cara yang ada (Brute Force dan Divide and Conquer <p>


## 4.4.2 Verifikasi Hasil Percobaan
<img src="sum output.png">

## 4.4.3 Pertanyaan
1. Berikan ilustrasi perbedaan perhitungan keuntungan dengan method TotalBF() ataupun TotalDC()
> : a. TotalBF() <p>
Pada totalBF() menggunakan fungsi iterative/perulangan untuk melakukan penjumlahan semua elemen array[i] yang nantinya dimasukkan pada operasi penjumlahan variable total dan di returnkan variable totalnya. Nilai dari variable total adalah hasil penjumlahan seluruh elemen array[i]. <p>
b. TotalDC()
Pada totalDC() perhitungan keuntungan menggunakan fungsi rekursif untuk melakukan proses divide yang diimplementasikan dengan adanya if-else if-else untuk membagi maslaah menjadi beberapa masalah, lalu melakukan tahap conquer untuk menyelesaikan setiap upa masalah tersebut dimana jika l==r maka return arr[l], jika l < r maka ada variable baru yang diberi nama mid yang berasal dari (l+r)/2 dan mereturn kan hasil penjumlahan lsum + rsum + arr[mid], dan terakhir jika bukan 
keduanya maka return 0. Lalu pada tahap akhir atau combine maka semua hasil penyelesaian tadi dijadikan satu menjadi solusi.
2. Perhatikan output dari kedua jenis algoritma tersebut bisa jadi memiliki hasil berbeda di belakang koma. Bagaimana membatasi output di belakang koma agar menjadi standar untuk kedua jenis algoritma tersebut.
> : Dengan menambah sintaks printf
3. Mengapa terdapat formulasi return value berikut?Jelaskan!
> : Untuk mereturnkan semua hasil dari penjumlahan keuntungan dari lsum (penjumlahan left/kiri) lalu dengan rsum (penjumlahan right/kanan) dan dengan arr[mid] (penjumlahan mid/tengah),sehingga dari penjumlahan ketiganya bisa diketemukan berapa banyak keuntungan yang didapat dari perusahaan tersebut dalam rentang waktu n bulan.
4. Kenapa dibutuhkan variable mid pada method TotalDC()?
> : Karena perhitungan keuntungan pada method totalDC() tersebut membagi bagiannya menjadi left(l) dan right(r) dan dibutuhkan variable mid untuk menghitungan semua bagian tengahnya. Misalkan array = 1,2,3,4,5 maka l adalah indeks 0/awal dan r adalah indeks 4/terakhir dan l masih belum == dengan r maka dibagi menjadi 2 bagian dan mid = indeks 2 karena (l+r)/2. Lalu pada bagian left berarti dimulai dari indeks l(l=0) dan diakhiri indeks mid-1, sedangkan pada bagian right dimulai dari indeks mid dan diakhiri r (r=4). Dan terus menerus dibagi 2 hingga indeks l==r dan mereturnkan nilai tersebut.
5. Program perhitungan keuntungan suatu perusahaan ini hanya untuk satu perusahaan saja. Bagaimana cara menghitung sekaligus keuntungan beberapa bulan untuk beberapa perusahaan.(Setiap perusahaan bisa saja memiliki jumlah bulan berbeda-beda)? Buktikan dengan program! <p>
> : <img src="sum main.png"> <p>
<img src="sum object.png"> <p>

# 4.5 Latihan Praktikum
1. Suatu Perguruan Tinggi di kota Malang sedang mengadakan pemilihan suara untuk memilih ketua BEM tahun 2022. Jika jumlah suara yang terkumpul diumpamakan selalu genap. Maka dengan inputan kandidat terpilih, carilah mayoritas jumlah suara untuk masing-masing kandidat. (Jumlah 
elemen array dan hasil pemilhan suara merupakan inputan user).<p>
Elemen Mayoritas : Elemen mayoritas di dalam A adalah elemen yang terdapat pada lebih dari n/2 posisi. Contohnya, jika n=6 atau n=7 maka nilai mayoritas paling sedikit adalah 4. Berasal dari (7/2)+1 atau (6/2)+1).<p>
Nilai mayoritas berbeda konsep dengan menghitung total suara terbanyak kandidat terpilih ! <p>
Contoh : Hasil pemilihan suara sebagai berikut (m adalah mayoritas, nm adalah no mayoritas)<p>
Karena n = 8, nilai mayoritas paling sedikit sejumlah 5 (8/2+1) <p>
Keterangan : Warna Biru adalah proses divide, warna kuning dimulainya proses conquer, warna hijau dimulainya proses combine
> : <img src="pemilu object.png"> <p>
<img src="pemilu main 1.png"> <p>
<img src="pemilu main 2.png"> <p>
<img src="pemilu output.png"> 