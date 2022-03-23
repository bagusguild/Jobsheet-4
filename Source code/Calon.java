public class Calon {
    String calon; int jml;
    int votingPemilihan(int[] pilih, int low, int high){ 
        if(high - low == 1){
            if (pilih[low] >= pilih[high]){ return pilih[low];
            }else {
                return pilih[high];
            }
        }else if(high > low){
            int tng = (high - low)/2 + low;
            int kanan = votingPemilihan(pilih, tng + 1, high); 
            int kiri = votingPemilihan(pilih, low, tng);
            if(kiri != 0){ return kiri;
            } else if(kanan != 0){ 
                return kanan;
            }
            return high;
        }
        return 0;
    }
}