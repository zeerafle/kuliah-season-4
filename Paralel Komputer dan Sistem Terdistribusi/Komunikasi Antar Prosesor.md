# Komunikasi Antar Prosesor

Parallel processing berbeda dengan multitasking, karena multitasking juga bisa dilakukan oleh prosesor tunggal.

Multiprosesor yaitu suatu sistem dengan ==lebih dari satu CPU yang memiliki sebuah memori bersama==. Prosesor berkomunikasi dengan prosesor lain dengan menulis pesan ke-memori global dimana prosesor kedua ==dapat membaca pesan tersebut pada lokasi memori yang sama==.

Semua prosesor dapat melakukan komputasi secara paralel dan masing-masing dapat mengakses memori melalui bus. Bus bertanggung jawab ==melayani permintaan pemakaian memori yang ... secara simultan oleh beberapa prosesor==. Bus bertanggung jawab untuk meyakinkan bahwa semua prosesro dilayani secara adil dengan waktu tunda (delay) akses yang minimum

Jika prosesor tidak mempunyai koneksi langsung ke prosesor lain, komunikasi menggunakan prosesor perantara..

Jika selama eksekusi program sering terjadi komunikasi antar prosesor, maka jumlah waktu tunda komunikasi prosesor tersebut akan bertambah

Waktu komunikasi sebuah multikomputer terdiri dari:
- Waktu transmisi. waktu yang dibutuhkan untuk transmisi secara fisik sejumlah bit message melalui
- Waktu proses. waktu yang dibutuhkan untuk memproses suatu komputasi
- Waktu tunggu. waktu yang diperlukan untuk menunda pengiriman pesan. Ada antrian (mana yang harus didulukan)
- Waktu proses

Parameter yang penting dari topologi multikomputer ini adalah
- jumlah saluran yang terhubung pada setiap antar muka prosesor, yang disebut keterhubungan (connectivity) topologi. 
- diameter dari topologi, yaitu jumlah maksimum saluran yang dibutuhkan untuk mengirim suatu message pada jarak terjauh prosesor.

## Multicore

Prosesor lebih menekankan pada multiple core, belum termasuk dalam komputasi paralel.

Skema multicore yang dikembangkan Intel maupun AMD. Menggunakan basis pemrosesan ==sequensial== tetapi dengan level atas pemrosesan yang ==tidak tunggal== seperti pada komputasi PC pada umumnya. Komputasi multicore masih bisa compatible dengan perangkat lunak yang ada sebelumnya