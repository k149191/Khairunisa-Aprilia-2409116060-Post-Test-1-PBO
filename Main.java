/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.posttest1;

/**
 *
 * @author NITRO V15
 */

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static class SesiBelajar {
        String namaSesi;
        int waktuBelajar;       
        int waktuIstirahat;
        ArrayList<String> daftarTugas = new ArrayList<>();
   
        public SesiBelajar(String namaSesi, int waktuBelajar, int waktuIstirahat, ArrayList<String> daftarTugas) {
            this.namaSesi = namaSesi;
            this.waktuBelajar = waktuBelajar;
            this.waktuIstirahat = waktuIstirahat;
            this.daftarTugas = daftarTugas;
        }
    }
    
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            
            ArrayList<SesiBelajar> sesiList = new ArrayList<>();
            
            ArrayList<String> daftarTugas1 = new ArrayList<>(Arrays.asList("Review Materi Hukum Termodinamika I & II"));
            ArrayList<String> daftarTugas2 = new ArrayList<>(Arrays.asList("Mengerjakan Tugas Limit 1, Mengerjakan Quiz Limit"));
            ArrayList<String> daftarTugas3 = new ArrayList<>(Arrays.asList("Review Materi Future Past Tense"));
           
            SesiBelajar sesi1 = new SesiBelajar("Fisika", 20, 5, daftarTugas1); 
            SesiBelajar sesi2 = new SesiBelajar("Matematika", 30, 15, daftarTugas2);
            SesiBelajar sesi3 = new SesiBelajar("Bahasa Inggris", 20, 10, daftarTugas3);
            
            sesiList.add(sesi1);
            sesiList.add(sesi2);
            sesiList.add(sesi3);
            
            int pilihan;
            
            do {
                System.out.println("\n        Selamat Datang di Pomodoro Tracker        ");
                System.out.println("\nManajemen Waktu Belajarmu dengan Pomodoro Tracker!");
                System.out.println("\n===  Manajemen Waktu Belajar/Pomodoro Tracker  ===");
                System.out.println("1. Tambah Sesi Belajar");
                System.out.println("2. Lihat Semua Sesi Belajar");
                System.out.println("3. Update Sesi Belajar");
                System.out.println("4. Hapus Sesi Belajar");
                System.out.println("5. Keluar");
                System.out.print("Pilih menu: ");
                pilihan = input.nextInt();
                input.nextLine();
                
                switch (pilihan) {
                    case 1 -> {
                        // CREATE
                        System.out.print("Masukkan nama sesi belajar: ");
                        String nama = input.nextLine();
                        System.out.print("Masukkan waktu belajar (menit): ");
                        int waktuBelajar = input.nextInt();
                        System.out.print("Masukkan waktu istirahat (menit): ");
                        int waktuIstirahat = input.nextInt();
                        input.nextLine();

                        ArrayList<String> daftarTugasBaru = new ArrayList<>();
                        SesiBelajar sesi = new SesiBelajar(nama, waktuBelajar, waktuIstirahat, daftarTugasBaru);

                        String tambahTugas;
                        do {
                            System.out.print("Masukkan tugas (atau ketik 'selesai'): ");
                            tambahTugas = input.nextLine();
                            if (!tambahTugas.equalsIgnoreCase("selesai")) {
                                daftarTugasBaru.add(tambahTugas);
                            }
                        } while (!tambahTugas.equalsIgnoreCase("selesai"));
                        
                        sesiList.add(sesi);
                        System.out.println("Sesi belajar telah berhasil ditambahkan.");
                    }
                    
                    case 2 -> {
                        // READ
                        if (sesiList.isEmpty()) {
                            System.out.println("Belum ada sesi belajar.");
                        } else {
                            System.out.println("===  Daftar Sesi Belajar  ===");
                            for (int i = 0; i < sesiList.size(); i++) {
                                SesiBelajar s = sesiList.get(i);
                                System.out.println((i+1) + ". " + s.namaSesi);
                                System.out.println("   Waktu Belajar  : " + s.waktuBelajar + " menit");
                                System.out.println("   Waktu istirahat: " + s.waktuIstirahat + " menit");
                                System.out.println("   Daftar tugas   : " + (s.daftarTugas.isEmpty() ? "(kosong)" : ""));
                                for (String tugas : s.daftarTugas) {
                                    System.out.println(" - " + tugas);
                                }
                            }
                        }
                    }
                    
                    case 3 -> {
                        // UPDATE
                        if (sesiList.isEmpty()) {
                            System.out.println("Tidak ada sesi yang dapat diupdate.");
                        } else {
                            System.out.println("Pilih nomor sesi belajar yang ingin diupdate:");
                            for (int i = 0; i < sesiList.size(); i++) {
                                System.out.println((i+1) + ". " + sesiList.get(i).namaSesi);
                            }
                            System.out.print("Nomor: ");
                            int idxUpdate = input.nextInt();
                            input.nextLine();
                            
                            if (idxUpdate > 0 && idxUpdate <= sesiList.size()) {
                                SesiBelajar s = sesiList.get(idxUpdate-1);
                                
                                System.out.print("Nama sesi belajar baru (" + s.namaSesi + "): ");
                                String newNama = input.nextLine();
                                if (!newNama.isEmpty()) s.namaSesi = newNama;
                                
                                System.out.print("Waktu belajar baru (" + s.waktuBelajar + "): ");
                                String ws = input.nextLine();
                                if (!ws.isEmpty()) s.waktuBelajar = Integer.parseInt(ws);
                                
                                System.out.print("Waktu istirahat baru (" + s.waktuIstirahat + "): ");
                                String wi = input.nextLine();
                                if (!wi.isEmpty()) s.waktuIstirahat = Integer.parseInt(wi);
                                
                                System.out.println("Apakah ingin update daftar tugas? (y/n)");
                                String jawab = input.nextLine();
                                if (jawab.equalsIgnoreCase("y")) {
                                    s.daftarTugas.clear();
                                    String tugasBaru;
                                    do {
                                        System.out.print("Masukkan tugas (atau 'selesai'): ");
                                        tugasBaru = input.nextLine();
                                        if (!tugasBaru.equalsIgnoreCase("selesai")) {
                                            s.daftarTugas.add(tugasBaru);
                                        }
                                    } while (!tugasBaru.equalsIgnoreCase("selesai"));
                                }
                                
                                System.out.println("Sesi telah berhasil diupdate!");
                            } else {
                                System.out.println("Nomor tidak valid.");
                            }
                        }
                    }
                    
                    case 4 -> {
                        // DELETE
                        if (sesiList.isEmpty()) {
                            System.out.println("Tidak ada sesi yang bisa dihapus.");
                        } else {
                            System.out.println("Pilih nomor sesi yang ingin dihapus:");
                            for (int i = 0; i < sesiList.size(); i++) {
                                System.out.println((i+1) + ". " + sesiList.get(i).namaSesi);
                            }
                            System.out.print("Nomor: ");
                            int idxHapus = input.nextInt();
                            input.nextLine();
                            
                            if (idxHapus > 0 && idxHapus <= sesiList.size()) {
                                sesiList.remove(idxHapus-1);
                                System.out.println("Sesi telah berhasil dihapus.");
                            } else {
                                System.out.println("Nomor tidak valid.");
                            }
                        }
                    }
                    
                    case 5 -> System.out.println("Terima kasih telah mengunjungi Pomodoro Tracker.");
                    
                    default -> System.out.println("Pilihan tidak valid.");
                }
                
            } while (pilihan != 5);
        }
    }
}
