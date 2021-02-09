import java.util.*;

public class TantanganDurinI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        String[] warna = new String[n];

        for(int i = 0; i < warna.length; i++){
            if((i+1) % 3 == 0 && (i+1) % 5 == 0){
                warna[i] = "Merah-Biru";
            } else if ((i+1) % 5 == 0){
                warna[i] = "Biru";
            } else if ((i+1) % 3 == 0){
                warna[i] = "Merah";
            } else {
                warna[i] = "Putih";
            }
        }

        for(String value : warna){
            System.out.println(value);
        }
    }
}
