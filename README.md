# Nama : Khairunisa Aprilia
# NIM : 2409116060
# Kelas : B Sistem Informasi 2024

# Manajemen Waktu Belajar/Pomodoro Tracker

* Deskripsi Program
Program sederhana ini dibuat untuk membantu mengatur waktu belajar dengan menggunakan metode Pomodoro. Metode Pomodoro adalah teknik manajemen waktu yang membagi periode belajar menjadi sesi fokus dan diselingi dengan waktu istirahat. Biasanya untuk sesi fokus waktunya adalah 15, 20, 30 menit dan waktu istirahat waktunya adalah 5, 10, 15 menit.

* Alur Program

1. Menu Utama
   
   <img width="576" height="243" alt="image" src="https://github.com/user-attachments/assets/86bc0907-1cd6-42ef-9959-c3c38c27ac82" />
   
   Pada menu utama terdapat 5 pilihan yang bisa dipilih yaitu 1). tambah sesi belajar, 2). lihat semua sesi belajar, 3). update sesi belajar, 4). hapus sesi belajar, dan 5). keluar.

2. Menu Tambah Sesi Belajar
   
   <img width="764" height="345" alt="image" src="https://github.com/user-attachments/assets/3dfb5a07-8a82-4650-98c2-2a86dd7adf33" />
   
   Jika memilih nomor 1 yaitu tambah sesi belajar, maka akan diminta untuk mengisi nama sesi belajar yang bisa diisi dengan nama pelajaran, mengisi waktu fokus belajar dan waktu istirahat yang bisa disesuaikan sendiri, dan bisa juga mengisi daftar tugas yang ingin dikerjakan.

3. Menu Lihat Semua Sesi Belajar
   
   <img width="382" height="422" alt="image" src="https://github.com/user-attachments/assets/37b68628-332e-4eba-9d2d-b2a85179d60c" />
   
   Jika memilih nomor 2 yaitu melihat semua sesi belajar, akan tertampil seluruh daftar sesi belajar yang terdaftar di sistem.

4. Menu Update Sesi Belajar
   
   <img width="367" height="198" alt="image" src="https://github.com/user-attachments/assets/1a8eb90f-cc13-45b7-92fc-f9c7712fd2f8" />
   
   Jika memilih nomor 3 yaitu mengupdate sesi belajar, akan diminta untuk memilih nomor sesi belajar yang ingin di update. Program akan mengecek terlebih dahulu apakah daftar sesi kosong; jika iya, ditampilkan pesan "Tidak ada sesi yang dapat diupdate". Jika ada, pengguna diminta memilih nomor sesi yang ingin diubah. Setelah sesi dipilih, program memberikan opsi untuk memperbarui nama sesi, durasi belajar, dan durasi istirahat (jika input tidak kosong maka nilainya diperbarui). Selanjutnya, program menanyakan apakah pengguna ingin memperbarui daftar tugas; jika iya, daftar tugas lama dihapus dan pengguna dapat memasukkan tugas baru satu per satu hingga mengetik "selesai". Setelah semua perubahan selesai, program menampilkan pesan "Sesi telah berhasil diupdate", sedangkan jika nomor yang dipilih tidak valid, akan muncul pesan "Nomor tidak valid".
   
   <img width="430" height="228" alt="image" src="https://github.com/user-attachments/assets/a437fa4c-a71c-4738-b891-0c878183fe6c" />
   
   Misalnya disini kita mengupdate sesi nomor 4 yaitu sejarah, kita akan diminta mengisi nama sesinya (bisa diubah, jika ingin diubah), waktu belajar dan waktu istirahat yang bisa diubah juga, dan kita akan ditanya apakah mau mengupdate daftar tugas, jika ingin diupdate ketik y, jika tidak ketik n dan jika bisa ketik selesai untuk keluar.
   
   <img width="388" height="333" alt="image" src="https://github.com/user-attachments/assets/6fce902b-5b22-43d4-beb5-21f22ef3fc20" />
   
   Dapat dilihat sesi sejarah telah berhasil terupdate.


5. Menu Hapus Sesi Belajar
   
   <img width="370" height="210" alt="image" src="https://github.com/user-attachments/assets/a3f62f90-ae7c-45f9-91b1-24abfad2ad92" />
   
   Jika memilih nomor 4 untuk menghapus sesi belajar, akan diminta memilih nomor sesi belajar yang ingin dihapus. Jika berhasil dihapus akan keluar output sesi telah berhasil dihapus.
   
   <img width="381" height="245" alt="image" src="https://github.com/user-attachments/assets/14cabc6e-5ad5-4e92-8196-441437a45d65" />
   
   Dapat dilihat saat di cek kembali di daftar sesi belajar, sesi dengan nama sejarah telah terhapus.

6. Menu Keluar
   
   <img width="380" height="155" alt="image" src="https://github.com/user-attachments/assets/77b7c6c6-fd4a-4a6f-928e-57fc6c2eb562" />
   
   Jika memilih nomor 5 untuk keluar dari sistem, akan keluar output terima kasih telah mengunjungi pomodoro tracker.


* Source Code
1. Package
   
  <img width="397" height="33" alt="image" src="https://github.com/user-attachments/assets/796e39ae-5616-4038-9be7-d5e4cde80ecf" />

  Proyek ini disimpan di package pbo.posttest1;

2. Import Class

   <img width="461" height="94" alt="image" src="https://github.com/user-attachments/assets/4e4d1797-31d0-4fbe-b314-62d906ddeee8" />
   - import java.util.Arrays digunakan untuk memanggil class Arrays dari package java.util, yang menyediakan berbagai metode statis untuk memanipulasi array, seperti sorting, searching, atau mengubah array menjadi string.
   - import java.util.ArrayList digunakan untuk memanggil class ArrayList dari package java.util, yang berfungsi menyimpan data dalam bentuk list dinamis.
   - import java.util.Scanner digunakan untuk memanggil class Scanner dari package java.util, yang berfungsi membaca input dari pengguna.

3. Class Main

   <img width="1697" height="435" alt="image" src="https://github.com/user-attachments/assets/9395a36f-bae0-4119-8619-b310e9cfd797" />

   Kode tersebut membuat kelas SesiBelajar di dalam kelas utama Main, yang berfungsi sebagai cetak biru untuk menyimpan informasi tentang sebuah sesi belajar. Kelas ini memiliki atribut namaSesi (nama sesi belajar), waktuBelajar (durasi belajar), waktuIstirahat (durasi istirahat), serta daftarTugas berupa ArrayList yang menyimpan daftar tugas.

4. Data Default

   <img width="1553" height="404" alt="image" src="https://github.com/user-attachments/assets/b5c419f2-336c-405a-a509-6cbfef73136c" />

   Membuat daftar sesi belajar dengan data awal (default) menggunakan ArrayList.

5. Menu Utama

   <img width="1124" height="356" alt="image" src="https://github.com/user-attachments/assets/2f437802-45c7-46dd-80a3-3dae65743e19" />

   Menu utama program Pomodoro Tracker menggunakan perulangan do while, di mana program terlebih dahulu menyapa pengguna lalu menampilkan daftar pilihan menu seperti menambah sesi belajar, melihat semua sesi, mengupdate sesi, menghapus sesi, atau keluar dari aplikasi.

6. Create (Menu Tambah Sesi Belajar)

   <img width="1341" height="649" alt="image" src="https://github.com/user-attachments/assets/82547d1f-b116-431f-b8ab-551609cc28e9" />

   Crate/Tambah Sesi Belajar. Program akan meminta pengguna memasukkan nama sesi belajar, durasi belajar, dan durasi istirahat, lalu membuat objek SesiBelajar baru dengan data tersebut. Setelah itu, program masuk ke perulangan do while untuk meminta daftar tugas; pengguna dapat mengetikkan tugas satu per satu dan program menambahkannya ke daftarTugasBaru hingga pengguna mengetik "selesai". Semua data yang sudah diisi kemudian dimasukkan ke dalam sesiList menggunakan add(), dan ditampilkan output bahwa sesi belajar berhasil ditambahkan.

7. Read (Menu Lihat Semua Sesi Belajar)

   <img width="1437" height="460" alt="image" src="https://github.com/user-attachments/assets/301db587-7b3a-4da7-aa55-86da2862832e" />

   Read/Lihat semua sesi Belajar. Menampilkan daftar sesi belajar dari sesiList; jika daftar masih kosong, program akan menampilkan pesan "Belum ada sesi belajar", namun jika sudah ada, program akan mencetak daftar sesi beserta nomor urut, nama sesi, durasi belajar, durasi istirahat, serta daftar tugas yang dimiliki, dimana bila tidak ada tugas maka akan ditampilkan tulisan (kosong), sehingga pengguna dapat melihat seluruh detail sesi belajar yang telah mereka buat sebelumnya.

8. Update (Menu Update Sesi Belajar)

   <img width="695" height="725" alt="image" src="https://github.com/user-attachments/assets/194b5356-d072-4a6c-a6e9-f85099e5d185" />

   Update/ Menu Update Sesi Belajar. Program pertama-tama menampilkan daftar sesi dari sesiList lalu meminta input nomor sesi yang ingin diubah, memvalidasi input tersebut, kemudian menyediakan opsi untuk memperbarui atribut namaSesi, waktuBelajar, dan waktuIstirahat hanya jika pengguna memasukkan nilai baru (jika input kosong, nilai lama dipertahankan); setelah itu, pengguna juga diberi pilihan untuk memperbarui daftar tugas, dimana daftarTugas lama akan dihapus dengan clear() lalu diisi ulang melalui perulangan do-while hingga pengguna mengetik "selesai", dan apabila semua proses berhasil, program menampilkan pesan bahwa sesi telah diupdate, sedangkan jika nomor sesi yang dipilih tidak valid maka ditampilkan pesan error.

9. Delete (Menu Hapus Sesi Belajar)

    <img width="1120" height="529" alt="image" src="https://github.com/user-attachments/assets/5c00fecc-dc16-4eb3-ae91-82c89ae42ab6" />

    Delete/ Menu Hapus Sesi Belajar. Menghapus sesi belajar dari sesiList. Pertama dicek apakah sesiList kosong menggunakan isEmpty(), jika iya program mencetak "Tidak ada sesi yang bisa dihapus.". Jika tidak kosong, program menampilkan daftar sesi dengan perulangan for menggunakan sesiList.get(i).namaSesi dan menomori setiap sesi mulai dari 1. Setelah itu pengguna diminta memasukkan nomor sesi yang ingin dihapus, dibaca dengan input.nextInt() lalu input.nextLine() untuk membersihkan buffer. Validasi dilakukan dengan if (idxHapus > 0 && idxHapus <= sesiList.size()), jika benar maka objek dihapus dengan sesiList.remove(idxHapus-1) (dikurangi 1 karena indeks list dimulai dari 0), lalu program menampilkan pesan "Sesi telah berhasil dihapus.". Jika nomor yang dimasukkan tidak sesuai, maka ditampilkan pesan "Nomor tidak valid.".

10. Keluar (Menu Keluar)

    <img width="1261" height="244" alt="image" src="https://github.com/user-attachments/assets/3e8e7d68-0656-4d0d-a5d7-e8f0cddc58ee" />

    Case 5 program menampilkan pesan "Terima kasih telah mengunjungi Pomodoro Tracker." sebagai tanda keluar dari aplikasi. Lalu ada default, yang menangani input menu yang tidak sesuai dengan pilihan yang tersedia, dengan mencetak pesan "Pilihan tidak valid.". Setelah itu, terdapat perulangan do while (pilihan != 5); yang membuat menu terus ditampilkan berulang kali hingga pengguna memilih opsi nomor 5, yaitu keluar dari program.







   
