import java.util.Scanner;

public class JawabanUts {

    int jumMaba = 3; // TI,DKV,TA
    static int totalkuota = 1050;
    public static String[] TI = new String[500];
    public static String[] DKV = new String[300];
    public static String[] TK = new String[250];

    public static void PrintInfopendaftar(){
        int totalTI=0;
        int totalSisakuota = 0;
        for (int index=0;index<TI.length;index++){
            if (TI[index] !=null){
                totalTI++;

            }
        }
        int totalDKV=0;
        for (int index=0;index<DKV.length;index++){
            if (DKV[index] !=null){
                totalDKV++;
            }
        }
        int totalTK=0;
        for (int index=0;index< TK.length;index++){
            if (TK[index] !=null){
                totalTK++;
            }
        }
        totalSisakuota = totalkuota - totalTI - totalDKV - totalTK;
        System.out.println("Total Pendftar TI: " + totalTI + " | Total Pendaftar DKV: " + totalDKV + " | Total pendaftar TK: " + totalTK);
        System.out.println("Jumlah Seluruh pendaftar : "+ totalkuota + " | Total Sisa Kuota: " +totalSisakuota);

    }
    public static void CekIndexArray(String[] myArray, String Mahasiswa) {
        int indexnow = 0;
        for (int index=0; index<myArray.length;index++){
            if(myArray[index] !=null){
                indexnow = index+1;
            }
        }
        if (indexnow< myArray.length){
            myArray[indexnow]= Mahasiswa;
        }
    }
    public static void InputMahasiswa(){
        Scanner InputData = new Scanner(System.in);
        Scanner inputdata = new Scanner(System.in);
        while(true){
            System.out.println("Nama Lengkap = ");
            String namamahasiwa = InputData.nextLine();
            System.out.println("Program study yang dipilih = ");
            System.out.println("Teknik Informatika/Desain Komunikasi Visual/Teknik Komputer");
            String PRODI = inputdata.nextLine();
            if (namamahasiwa.isBlank()){
                System.out.println("NAMA WAJIB DIISI !!");
                InputMahasiswa();}
            System.out.println("Nama Saya: " + namamahasiwa);
            System.out.println("Prodi saya: " + PRODI);
        }
    }

    public static void main(String[] args) {
        InputMahasiswa();
    }
}