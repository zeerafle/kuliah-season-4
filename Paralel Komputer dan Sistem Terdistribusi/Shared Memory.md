# Shared Memory

Adalah komunikasi antar proses tercepat karena semua proses ==menggunakan blok memori yang sama==. Shared memory memungkinkan dua atau lebih proses mengakses memory yang sama disebut *malloc* dan mengembalikan pointer ke memori aktual yang sama.

Ketika proses ganti memori akan ada pemberitahuan untuk proses yang lain.

Shared memory juga menghindari copy data yang tidak penting. Pada arsitektur shared memory, beberapa process menggunakan satu resource memory secara bersama. Setiap proses memiliki hak akses yang sama pada suatu memory

![[Pasted image 20220304162410.png]]

Arsitektur NUMA (Non Uniform Memory Access), pada arsitektur ini, CPU yang mengakses memory.

