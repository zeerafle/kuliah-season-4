# Pemodelan Sistem

Adalah proses pengembangan model abstrak dari suatu sistem, dengan setiap model ==menyajikan pandangan atau perspektif yang berbeda dari sistem tersebut==. Pemodelan sistem berarti merepresentasikan sistem menggunakan semacam notasi grafis. Pemodelan sistem membantu analis untuk memahami fungsionalitas sistem dan model yang digunakan untuk berkomunikasi dengan pelanggan.

![[Pasted image 20220308134304.png]]

Deskripsi sistem didapat dari model requirement. Model desain menjadi jembatan antara tahap analisis dan tahap desain.

![[Pasted image 20220308134511.png]]

Di kiri: analisis
DI kanan: design

Jika sistem tidak terlalu besar, kita hanya menggambarkan ERD, DFD, dan Data Dictionary

# Fungsi Pemodelan Analisis

Memberikan gambaran logis perangkat lunak, data yang diperlukan dan model perilaku dari sistem perangkat lunak yang dikembangkan

## Metode Pemodelan Analisis

- Berorientasi Proses - diagram workflow
- Berorientasi aliran data - data flow diagram
- Berorientasi objek - UML

## Tahapan Pemodelan Analisis

- Mendefinisikan pernyataan ruang lingkup (mendefinisikan requirement)
- Mendefinisikan objek-objek dan operasi
- Melakukan pemodelan data
- Melakukan pemodelan fungsi
- Melakukan pemodelan perilaku
- Mendefinisikan 

### Pemodelan Fungsi

Digunakan DFD, karena:
- Dapat mendefinisikan batasan sistem
- Membantu memeriksa kebenaran dan kelengkapan aliran informasi
- Merupakan dasar perancangan dengan memunculkan proses-proses pengolahan data
- Dapat digunakan untuk menggambarkan aktivitas proses secara paralel

#### Data Flow Diagram

DFD memperlihatkan gambaran tentang masukan-proses-keluaran dari suatu sistem/PL, yaitu obyek-obyek data yang mengalir ke dalam

Intinya, merepresentasikan:
- Bagaimana

##### Komponen DFD

![[Pasted image 20220308135752.png]]

###### Terminator

Mewakili entitas eksternal (objek diluar sistem, tetapi yang berkomunikasi dengan sistem). Terdapat dua jenis:
- Terminator Sumber
- Terminator Tujuan

![[Pasted image 20220308140021.png]]

Terminator bisa berupa orang, pelaku, organisasi, atau perusahaan tetapi ==di luar kendali sistem yang sedang dibuat modelnya==. Terminator dapat juga berupa departemen, divisi, atau ==sistem di luar sistem yang berkomunikasi dengan sistem yang sedang dikembangkan==.

###### Proses

- Komponen yang menggambarkan bagian dari sistem yang mentransformasikan input menjadi output.
- Proses diberi nama untuk menjelaskan proses/kegiatan apa yang sedang/akan dilaksanakan
- Pemberian nama proses dilakukan dengan menggunakan kata kerja transitif
- Ada empat kemungkinan yang dapat terjadi dalam proses sehubungan dengan input dan output:
	![[Pasted image 20220308140616.png]]

Kesalahan umum dalam menggambarkan proses dfd:

- *Black hole* tidak ada output
- *Miracle* tidak ada input

###### Data Flow

- Aliran data digunakan untuk menerangkan perpindahan data atau paket data/informasi dari satu bagian sistem ke bagian lainnya
- Digambarkan dengan anak panah
- Selain menunjukkan arah, alur data pada model yang dibuat oleh profesional sistem dapat merepresentasikan bit, karakter, dll.
- Bisa juga merepresentasikan data/informasi yang tidak berkaitan dengan komputer
- Setiap aliran data diberi nama sesuai dengan informasi yang terkandung. Menggunakan kata benda, misal. Laporan Penjualan

Empat konsep yang perlu diperhatikan:
1. **Konsep paket data**. Kalau ada dua atau lebih data dari satu sumber mengalir ke tujuan yang sama ==harus dianggap sebagai satu alur data tunggal==
	![[Pasted image 20220308141301.png]]
2. **Konsep alur data menyebar (Diverging data flow)**.
3. **Konsep alur data mengumpul (Converging Data Flow)**.
	![[Pasted image 20220308141556.png]]
4. **Konsep Sumber atau Tujuan Alur Data**. Semua alur data harus minimal mengandung satu proses
	![[Pasted image 20220308141826.png]]

###### Data Store

- Menggambarkan sekumpulan paket data dan diberi nama dengan kata benda jamak, misalnya: mahasiswa.
- Data store ini biasanya berkaitan dengan penyimpanan, seperti file, database, harddisk, agenda, buku alamat.
- Suatu data store dihubungkan dengan alur data hanya pada komponen proses, tidak dengan komponen DFD lainnya.
- Alur data yang menghubungkan data store dengan suatu proses:
	![[Pasted image 20220308142451.png]]
	- Jika data store ke proses, yang dilakukan adalah membaca data
	- Jika proses ke data store, yang dilakukan adalah menambah, mengedit, menghapus data

##### Tingkatan DFD

| Level diagram                     | Penyebutan lain                   |
| --------------------------------- | --------------------------------- |
| Context Diagram (level 0 diagram) | Context diagram                   |
| Level 1 DFD                       | Diagram Zero (diagram 0, level 1) |
| Level 2 DFD, Level 3 DFD, ...     | Diagram rinci (level 2, level 3)  | 

###### Context DIagram

- Diagram level tertinggi di DFD
- Menggambarkan aliran-aliran data ke dalam dan luar sistem
- Belum ada data store

![[Pasted image 20220308142958.png]]
###### Diagram Level 1

Terminator masih sama tapi proses-prosesnya makin rinci.

![[Pasted image 20220308143513.png]]

###### Diagram Rinci/Level 2

Kita dapat memperluas setiap proses pada top level dfd

![[Pasted image 20220308144744.png]]

###### Contoh Levelling

![[Pasted image 20220308145426.png]]

##### Langkah Pembuatan DFD

1. Identifikasi terlebih dahulu semua entitas luar yang terlibat di sistem
2. Identifikasi semua input dan output yang terlibat dengan entitas luar
3. 

---

# Mentcare System

## Diagram Level 0

![[Pasted image 20220322135434.png]]

Terminator adalah yang langsung berinteraksi dengan sistem (pengelolaan janji temu pasien). Ini yang melayani janji pasien yang datang.

Staff administrasi melakukan pendaftaran pasien, dapat memberikan. Setelah jadwal diberikan, apakah pasien hadir

![[Pasted image 20220322135418.png]]

Jumlah data flow pada diagram level 0 tidak boleh berubah saat masuk ke level 1
![[Pasted image 20220322135704.png]]

Jika pasien bisa mendaftar secara langsung maka pasien perlu dibuatkan entitas sendiri.

![[Pasted image 20220322145005.png]]