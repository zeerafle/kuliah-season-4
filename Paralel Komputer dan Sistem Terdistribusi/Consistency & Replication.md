## Replikasi

**Replikasi** adalah suatu teknik untuk melakukan copy dan pendistribusian data dan objek-objek serta melaksanakan sinkronisasi antara objek sehingga konsistensi data dapat terjamin.

Keuntungan replikasi: replikasi mendukung ketersediaan data setiap waktu dan dimanapun diperlukan.

Secara umum dibagi 2:
- Reliability

	Satu sistem, atau bahkan lebih dari satu, dapat terjadi tabrakan tanpa akses ke data yang mengalami interrupt. Memiliki salinan data dan mengijinkan data yang corrupt agar mudah dalam proses pendeteksian dan perbaikan.
	
- Performance

	Beberapa salinan data dapat membantu dari sisi skala sehingga mampu menangani sistem yang lebih besar menangani client

Keuntungan lain yaitu:

- Memungkinkan beberapa lokasi menyimpan data yang sama.
- Aplikasi transaksi online terpisah dari aplikasi pembacaan
- Memungkinkan otonomi yang besar
- Data dapat ditampilkan pembacaan
- Membawa data mendekati lokasi pengguna
- Penggunaan replikasi sebagai bagian dari strategi standby server

Kebutuhan replikasi:

- Meng-copy dan mendistribusikan data dari satu atau lebih lokasi
- Mendistribusikan hasil copy data berdasarkan jadwal
- Mendistribusikan perubahan data ke server lain
- Memungkinkan beberapa pengguna di beberapa lokasi untuk melakukan perubahan dan kemudian menggabungkan data yang telah dimodifikasi
- Membangun aplikasi data yang menggunakan perlengkapan online maupun offline
- Membangun aplikasi Web sehingga pengguna dapat melihat volume data yang besar.

Pertimbangan dalam perencanaan replikasi:

- Kebutuhan data yang akan diubah dan siapa yang mengubah
- Pendistribusian data memerlukan konsistensi, otonomi dan kesinambungan
- Kelengkapan replikasi yang meliputi kebutuhan user, infra struktur teknik,jaringan dan keamanan serta karakteristik data
- Jenis replikasi dan pilihannya
- Topologi replikasi dan bagaimana mewujudkannya agar sesuai dengan jenis replikasi

### Jenis Replikasi

Bedasarkan jenisnya replikasi dibagi atas beberapa macam, antara lain:

- Snapshot Replication 
- Transactional Replication
- Marge Replication

#### Snapshot Replication

Mendistribusikan data yang dapat dilihat pada saat tertentu tanpa melakukan update. Biasanya digunakan pada saat memerlukan tampilan data (read-only). Contoh : daftar harga, katalog, data yang digunakan untuk pengambilan keputusan.

Replikasi snapshot ini membantu pada saat:

- Data sebagian besar statis dan tidak sering berubah
- Dapat menerima copy data yang telah melewati batas waktu yang ditentukan
- Datanya sedikit

#### Transactional Replication

Replikasi transaksional adalah distribusi periodik otomatis dari perubahan antar database. Data disalin dalam waktu dekat atau secara periodik dari server utama ke database penerima, atau sebaliknya. Replikasi Transaksional di gunakan untuk memelihara kekonsistenan transaksi yang terjadi. Contoh : daftar transfer, debit, atau kredit dari database nasabah ke server utama bank.

## Konsistensi

Konsistensi semantik menunjukkan karakteristik sistem yang menspesifikasi semantik dari pengguna ganda yang mengakses berkas yang sama secara simultan. Konsistensi semantik berhubungan langsung dengan algoritma pada proses sinkronisasi.

### Konsistensi dalam Sistem Terdistribusi

Beberapa contoh penting konsistensi Semantik:

- **UNIX Semantics**. Apa yang ditulis pengguna pada sebuah open files dapat dilihat pengguna lain yang juga sedang membuka berkas yang sama Sharing memungkinkan pengguna untuk berbagi pointer.
- **Session Semantics**. Apa yang ditulis pengguna pada sebuah open files tidak dapat dilihat pengguna lain yang juga sedang membuka berkas yang sama. Setelah berkas itu di-close, perubahan yang terjadi karena ada pengguna yang menulis berkas dapat dilihat.
- **Immutable-Shared Files Semantics**. Sebuah immutable berkas tidak dapat dimodifikasi. Walaupun beberapa pengguna mengakses immutable file, isi berkas tidak dapat diubah.

### Jenis Model Konsistensi

Ada beberapa jenis model konsistensi, yaitu :
1. Model konsistensi berpusat pada data (Data- Centric Consistency Models)
2. Model konsistensi berpusat pada client (Client- Centric Consistency Models)

#### Data-Centric Consistency Models

Model konsistensi dapat membatasi nilai pada saat proses Read sehingga proses pengembalian data data dapat dilakukan. Beberapa diantaranya dibatasi, semakin terbatas pembatasan nilai yang ada semakin mudah diterapkan. Ada dua model yang umum digunakan dalam Data-Centric Consistency, yaitu: *Sequential Consistency* dan *Casual Consistency*

##### Sequential Consitency

Digunakan untuk shared memory pada sistem multiprosesor. Dalam data store dikatakan sequentialy consistent apabila hasil dari tiap eksekusi adalah sama jika operasi read dan write untuk seluruh proses di data store diekseskusi pada beberapa perintah yang terurut (sequential) dan operasi untuk setiap proses terlihat pada urutan yang diperintah secara spesifik oleh program.

Ilustrasi: (a) Konsistensi secara terurut, namun konsisten. (b) Tidak menggunakan keterurutan konsistensi

![](attachments/Pasted%20image%2020220602000847.png)

#### Client-Centric Consistency Models

Kita berasumsi bahwa tidak ada proses update secara simultan terhadap penyimpanan data. Kita perhatikan untuk Domain Name System atau World Wide Web:

- Di dalam sistem ini, mayoritas operasi itu terbaca, dan sangat utama semua menulis dilaksanakan oleh penguasa pusat (pemilik-pemilik halaman web, hostmasters), jadi kita tidak pernah mempunyai write-write conflicts.
- Jika tidak ada update berlangsung dalam jangka waktu lama, semua replika akan secara berangsur-angsur dijadikan konsisten (data lama akan dihapus dari cache).
- Proses ini disebut sebagai eventual consistency.

![](attachments/Pasted%20image%2020220602001044.png)

### Protokol dalam Konsistensi

Protokol ppada konsistensi digunakan untuk menguraikan lebih dalam mengenai model konsistensi. Ada tiga protokol yaitu:

- **Primary-based protocol**. Remote-write protocols & local-write protocols
- **Replicated-write protocols**. Active replication & quorum-based protocols
- **Cache coherence protocols**