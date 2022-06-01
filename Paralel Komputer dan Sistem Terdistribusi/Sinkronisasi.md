## Clock Synchronization

Sifat algoritma untuk sinkronisasi dalam sistem terdistribusi :

- Informasi yang relevan tersebar di beberapa komputer
- Keputusan pembuatan proses hanya berdasarkan informasi local
- Peristiwa kegagalan dengan penyebab tunggal di dalam sistem harus dihindarkan
- Tidak tersedianya clock atau sumber waktu global yang akurat.

Sikronisasi merupakan bagian penting untuk kerjasama dalam :

- Pemakaian sumberdaya berbagi (Sharing resources)
- Pengurutan kejadian
- Kesepakatan clock tersebar

Contoh tidak adanya kesepakatan clock global

![](attachments/Pasted%20image%2020220601235205.png)

Cara yang paling mudah untuk menentukan waktu adalah dengan bertanya langsung ke server waktu (UTC), hanya saja akan banyak perbedaan dalam request. Mungkinkah mensinkronkan semua clock yang ada dalam sistem tersebar?

## Logic Clock

Walaupun penggunakan kata clock sudah meluas, kata yang lebih tepat adalah timer untuk merujuk komponen dari rangkaian tersebut. Selalu ada sedikit perbedaan yang terjadi dan mengakibatkan perbedaan waktu yang disebut clock skew. Salah satu algoritma logic clock adalah Algoritma Lamport.

### Algoritma Lamport

Menurut Lamport, sikronisasi clock tidak harus dilakukan dengan nilai mutlak clocknya, karena yang diperlukan dalam sikronisasi proses-proses adalah urutan proses tersebut. Jadi yang dipentingkan adalah konsistensi internal clock, bukan apakah clock tersebut harus sama persis dengan waktu real.

### Physical Clock

Pada beberapa sistem, waktu clock actual menjadi penting, contohnya real-time sistem. Untuk mendapatkan presisi yang sangat akurat diperlukan clock fisik eksternal. Physical clock dibagi menjadi 2 type: External clock synchronization dan Internal clock synchronization. Salah satu contoh sinkronisasi dengan physical clock adalah sistem waktu UTC (Universal Time Coordination).