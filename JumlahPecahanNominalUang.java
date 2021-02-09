import java.util.*;

public class JumlahPecahanNominalUang {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Silahkan input nominal uang (dibagi 1000) : ");
        long n = scan.nextLong();
        long[] pecahan = {100, 50, 20, 10, 5, 2, 1};
        long[] jmlPecahan = new long[pecahan.length];

        long uang = n;
        long jml;
        for(int i = 0; i < pecahan.length; i++){
            jml = uang / pecahan[i];
            uang -= jml*pecahan[i];
            jmlPecahan[i] = jml;

            if(uang == 0) break;
        }

        int x = 0;
        for(long value : jmlPecahan){
            System.out.printf("\nJumlah Pecahan %dk adalah %d", pecahan[x], value);
            x++;
        }
    }
}
