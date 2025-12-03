1. Apakah fungsi tanpa parameter selalu harus bertipe void?

Tidak.
Fungsi tanpa parameter tidak wajib bertipe void.
Yang menentukan return value adalah apakah fungsi tersebut mengembalikan nilai, bukan jumlah parameternya.
2. Apakah daftar menu dapat ditampilkan tanpa fungsi Menu()?

Bisa.
Cukup tulis langsung di dalam main.
3. Keuntungan menggunakan fungsi Menu()

Kode lebih rapi dan terstruktur.

Menghindari pengulangan kode.

Jika menu ingin diubah, cukup ubah di satu fungsi.

Memudahkan proses pemeliharaan & pengembangan program.

4. Alur eksekusi ketika Menu() dipanggil dari main

Program dijalankan → JVM mengeksekusi main().

Di dalam main(), terdapat pemanggilan Menu().

Eksekusi berpindah ke fungsi Menu().

Statement di dalam Menu() dijalankan (misalnya mencetak daftar menu).

Setelah selesai, eksekusi kembali ke main().

Program melanjutkan instruksi berikutnya atau selesai.




1. Apa kegunaan parameter di dalam fungsi?

Parameter berfungsi untuk:

Mengirim nilai dari luar fungsi ke dalam fungsi.

Membuat fungsi lebih fleksibel & dapat dipakai ulang.

Menghindari penulisan ulang kode.

2. Mengapa fungsi Menu() menggunakan parameter namaPelanggan dan isMember?

Karena informasi tersebut berubah–ubah untuk setiap pelanggan.
Dengan parameter:

Program bisa menampilkan salam khusus berdasarkan nama.

Program bisa menyesuaikan promo/member.

Fungsi menjadi dinamis, bukan statis.

3. Apakah parameter sama dengan variabel? Jelaskan.

Parameter adalah variabel lokal, tetapi khusus digunakan untuk menerima input dari pemanggilan fungsi.

Bedanya:

Parameter → hanya ada pada deklarasi fungsi

Variabel biasa → dideklarasikan di dalam body fungsi

4. Bagaimana cara kerja parameter isMember?

isMember adalah boolean (true/false).

Jika true, tampilkan “Anda mendapatkan diskon sebagai member”

Jika false, tampilkan “Tidak ada diskon”

Output bergantung pada nilai yang dikirim saat pemanggilan fungsi.

5. Apa yang terjadi jika Menu() dipanggil tanpa parameter?

Akan muncul error compile:

error: no suitable method found for Menu()


Karena fungsi membutuhkan dua parameter, tetapi tidak diberikan.
6. Modifikasi fungsi dengan parameter kodePromo

(Ini jawaban teorinya)

Jika kodePromo = "DISKON50" → diskon 50%

Jika kodePromo = "DISKON30" → diskon 30%

Lainnya → “Kode promo invalid”

7. Pemanggilan fungsi Menu() yang benar

Nama pelanggan "Budi", member = true, kodePromo = "DISKON30":

Menu("Budi", true, "DISKON30");

8. Apakah penggunaan parameter membuat program lebih mudah dibaca?

Ya, karena:

Nilai yang berubah (nama, status member) tidak ditulis di dalam fungsi.

Fungsi dapat digunakan untuk banyak pelanggan.

Kode lebih mudah dipahami, diuji, dan dikembangkan.



1. Kapan fungsi membutuhkan nilai kembalian dan kapan tidak?

Membutuhkan return value jika hasil fungsi dipakai lagi atau dibutuhkan oleh perhitungan lain.
Contoh: hitungTotalHarga() → mengembalikan total harga.

Tidak membutuhkan return value jika fungsi hanya menampilkan output.
Contoh: Menu() → hanya mencetak daftar menu.

2. Tipe data nilai kembalian & parameter hitungTotalHargaNoAbsen

Tipe return: int atau double (tergantung implementasi)

Parameter:

pilihanMenu → menentukan menu apa yang dipilih

jumlahPesanan → berapa banyak pesanan

3. Modifikasi fungsi agar menerima kodePromo

Logikanya:

Jika "DISKON50" → totalHarga = totalHarga * 0.5

Jika "DISKON30" → totalHarga = totalHarga * 0.7

Lainnya → tampilkan "invalid"

4. Bagaimana memesan beberapa menu sekaligus?

Solusi:

Gunakan loop (for/while) untuk input banyak menu.

Simpan semua pesanan di array atau list.

Untuk setiap menu, panggil fungsi hitungTotalHargaNoAbsen()

Jumlahkan semua total menjadi totalAkhir.




1. Mengapa varargs ditulis String... namaPengunjung?

Karena:

Varargs (...) memungkinkan menerima jumlah argumen yang tidak terbatas.

Parameternya otomatis menjadi array di dalam fungsi.

2. Modifikasi method daftarPengunjung dengan for-each

Secara konsep:

for (String p : namaPengunjung) {
    System.out.println(p);
}

3. Bisakah fungsi memiliki dua varargs?

Tidak bisa.
Aturan Java:

Hanya boleh satu varargs dalam satu fungsi.

Varargs harus menjadi parameter terakhir.

Contoh yang salah:

void tes(int... a, String... b) // ERROR


Contoh benar:

void tes(String a, int... b)

4. Apa yang terjadi jika varargs dipanggil tanpa argumen?

Program tidak error.
Varargs akan menjadi array kosong.

Output yang muncul:

Tidak menampilkan apa-apa (loop tidak masuk)

Atau hanya header sesuai program




1. Tahapan eksekusi program dari awal sampai menghasilkan output

Program dijalankan → JVM memanggil main().

User memasukkan panjang, lebar, tinggi.

Program memanggil fungsi hitungLuas().

Menghitung luas → mengembalikan nilai.

Program memanggil hitungVolume().

Menghitung volume → mengembalikan nilai.

main() mencetak hasil luas & volume.

Program selesai.

2. Output jika panjang = 4, lebar = 3, tinggi = 5

Luas Persegi Panjang = 4 × 3 = 12

Volume Balok = 4 × 3 × 5 = 60

Output:

Luas Persegi Panjang = 12
Volume Balok = 60

3. Menjelaskan output program yang diberikan (jawaban teori)

Karena kodenya tidak ditampilkan di soalmu, jawaban umumnya:

Program akan menjalankan fungsi sesuai urutan pemanggilan

Mengolah input

Menghasilkan output perhitungan

Eksekusi kembali ke main

Jika kamu upload screenshot programnya, aku jelaskan detail per baris.

4. Kapan fungsi harus menggunakan parameter / return value?

Menggunakan parameter ketika fungsi butuh input dari luar agar fleksibel.

Tanpa parameter jika fungsi sudah punya informasi lengkap di dalamnya.

Dengan return value jika hasil perhitungan dibutuhkan kembali.

Tanpa return value jika fungsi hanya menampilkan sesuatu.

5. Kapan sebuah fungsi sebaiknya menggunakan parameter?

Contoh Percobaan 5:

hitungLuas(panjang, lebar) → perlu parameter

hitungVolume(panjang, lebar, tinggi) → perlu parameter
Karena nilai panjang, lebar, tinggi berubah-ubah.

6. Kapan fungsi sebaiknya memiliki return value?

hitungLuas → perlu return (hasil digunakan lagi)

hitungVolume → perlu return

main → tidak butuh return (program hanya mengatur alur)

