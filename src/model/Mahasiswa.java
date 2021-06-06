package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Mahasiswa {
    String npm;
    String nama;
    Date tanggallahir;
    final String POLA_TANGGAL ="dd-MM-yyyy";
    final SimpleDateFormat SDF = new SimpleDateFormat(POLA_TANGGAL);

    void tampilkanAtribut(){
        System.out.println("Nama \t\t\t : " + this.nama);
        System.out.println("NPM \t\t\t : " + this.npm);
        System.out.println("Tanggal Lahir \t : " + SDF.format(this.tanggallahir));
    }
   public Mahasiswa(String npm, String nama, String tanggallahir){
        this.npm =npm;
        this.nama = nama;
        try{
            this.tanggallahir = SDF.parse(tanggallahir);
        }   catch (){
                System.err.println("Kesalahan Pada tanggal lahir");

        }
   }
}
