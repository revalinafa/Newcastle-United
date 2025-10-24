# RESPONSI 1 CLUB NEWCASTLE UNITED FC 
**Nama:** Revalina Fidiya Anugrah  
**NIM:** H1D023011  
**Shift Awal:** D  
**Shift Akhir:** B  

---

## 📱 Deskripsi Proyek
Proyek ini merupakan tugas **Responsi 1 Mobile** untuk mata kuliah Pemrograman Mobile.  
Aplikasi ini menampilkan informasi lengkap mengenai **Newcastle United FC**, termasuk:
- Profil klub
- Sejarah klub
- Data pelatih (Head Coach)
- Daftar pemain (Team Squad)

Semua data pelatih dan pemain diambil dari **API resmi football-data.org**.  
Aplikasi dibangun menggunakan **Kotlin** di **Android Studio** dengan struktur yang sesuai materi praktikum.

---

## 🌍 Sumber Data
Data diambil dari endpoint API berikut:
https://api.football-data.org/v4/teams/67

Pada aplikasi ini, ID klub yang digunakan adalah **Newcastle United FC**.  
Data JSON hasil request API diolah menggunakan Retrofit untuk menampilkan:
- Nama pelatih
- Foto pelatih (manual, karena gambar tidak disediakan API)
- Daftar pemain lengkap beserta posisi dan negara asal

---

## ⚙️ Alur Data Aplikasi
1. **Pemanggilan API:**  
   Aplikasi mengirim request HTTP GET ke endpoint `https://api.football-data.org/v4/teams/67` menggunakan Retrofit.  
   Token API dimasukkan ke dalam **Header Authorization**.

2. **Penerimaan Response JSON:**  
   Data yang diterima berupa objek JSON berisi informasi tim, pelatih, dan daftar pemain.

3. **Parsing Data:**  
   Data di-*deserialize* ke model Kotlin (data class) menggunakan Gson.

4. **Penyajian Data:**  
   - Halaman **Coach Fragment** menampilkan nama pelatih dan foto.
   - Halaman **Player Fragment** menampilkan daftar pemain dengan warna card sesuai posisi:
     - 🟡 **Goalkeeper** – Kuning  
     - 🔵 **Defender** – Biru  
     - 🟢 **Midfielder** – Hijau  
     - 🔴 **Forward** – Merah  

---

## 🎨 Tampilan Aplikasi
<img width="1080" height="2400" alt="Screenshot_20251024_175937" src="https://github.com/user-attachments/assets/ff358cf5-dcc2-4bc0-bfd1-bd55f300498e" />

- **Halaman Utama:** Menampilkan nama dan logo Newcastle United FC.  
- **Halaman Sejarah:** Memuat riwayat klub dari masa ke masa.  
- **Halaman Pelatih:** Menampilkan informasi pelatih utama dari API.  
- **Halaman Pemain:** Menampilkan daftar pemain aktif dengan kategori posisi berwarna.  

Ikon aplikasi menggunakan **logo Newcastle United FC** dengan latar belakang sesuai kreativitas.

---

## 📸 Video Demo Aplikasi
🔗 

---

## 🛠️ Teknologi yang Digunakan
- **Kotlin**  
- **Android Studio**  
- **Retrofit2 & Gson Converter** (untuk komunikasi API)  
- **CardView dan RecyclerView** (untuk menampilkan daftar pemain)  
- **ViewBinding / Fragment Navigation**  


---

## 📎 Repositori GitHub
🔗 [https://github.com/revalinafa/Newcastle-United](https://github.com/revalinafa/Newcastle-United)

---

### 💬 “Howay the Lads!”  
Aplikasi ini dibuat sebagai bentuk penerapan materi praktikum dan dedikasi untuk klub **Newcastle United FC**.


