
package measurement;

public class Printer {
    public void printAllMachineTemperatures(double[] daftarPengukuranSuhuMesin){
        double[] hasilPengukuranSuhuMesin = { 35, 40, 37.6, 50.2, 37, 47.8, 39, 37.6, 40, 42.4 };
        int n = daftarPengukuranSuhuMesin.length;
        int i = 0;
        while(i < n){
            System.out.println(daftarPengukuranSuhuMesin[i]);
            i++;
        }
    }

}
