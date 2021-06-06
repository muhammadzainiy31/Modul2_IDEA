package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MahasiswaBeraksi {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.npm = "19630120";
        mahasiswa.nama = "Muhammad Zaini";
        mahasiswa.tanggallahir = simpleDateFormat.parse("21-03-1999");


        System.out.println("Nama \t\t\t : " + mahasiswa.nama);
        System.out.println("NPM \t\t\t : " + mahasiswa.npm);
        System.out.println("Tanggal Lahir \t : " + simpleDateFormat.format(mahasiswa.tanggallahir));


        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.npm = "0120";
        mahasiswa2.nama = "Zaini";
        mahasiswa2.tanggallahir = simpleDateFormat.parse("01-03-1999");


        System.out.println("Nama \t\t\t : " + mahasiswa2.nama);
        System.out.println("NPM \t\t\t : " + mahasiswa2.npm);
        System.out.println("Tanggal Lahir \t : " + simpleDateFormat.format(mahasiswa2.tanggallahir));


    }
}