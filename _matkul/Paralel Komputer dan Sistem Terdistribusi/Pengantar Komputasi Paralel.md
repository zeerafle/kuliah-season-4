# Pendahuluan

Paralel komputer adalah salah satu teknik melakukan komputasi secara bersamaan dengan memanfaatkan beberapa komputer independen secara bersamaan. Karena kebutuhan mengolah data yang besar dan proses kalkulasi numerik mendorong pengembangan pemrosesan secara paralel.

Pemrograman paralel adalah teknik pemrograman komputer yang memungkinkan eksekusi perintah/operasi secara bersamaan baik dalam prosesor tunggal ataupun banyak (prosesor ganda) CPU. Berarti bahasanya juga yang mendukung object-oriented.

Jika komputer terhubung dengan komputer-komputer lain dalam satu jaringan digunakan secara bersamaan namanya adalah sistem terdistribusi.

Tujuan utama dari pemrograman paralel adalah untuk meningkatkan performa komputasi.

![[Pasted image 20220223143527.png]]

![[Pasted image 20220223143642.png]]

# Taksonomi Flynn

- **SISD (Single Instruction, Single Data)** adalah satu-satunya yang menggunakan [[Arsitektur Von Neumann]], yaitu sebuah komputer yang tidak memiliki cara untuk melakukan paralelisasi terhadap instruksi atau data. Contohnya adalah PC tradisional atau mainframe tua.
	![[Pasted image 20220223143841.png]]
- **SIMD (Single Instruction Multiple Data)**. Mampu memproses banyak aliran data dengan satu instruksi. Kaya banyak tapi sebernanya tunggal. Ini masih masuk dalam komputasi tunggal. Contohnya GPU
	![[Pasted image 20220223144011.png]]
- **MISD (Multiple Instruction, Single Data)** menggunakan banyak prosesor dengan setiap prosesor mengolah data yang sama tapi instruksinya berbeda beda.
	![[Pasted image 20220223144209.png]] ![[Pasted image 20220223144237.png]]
- **MIMD (Multiple Instruction, Multiple Data)**, banyak prosesor banyak data. Tidak hanya komputasi paralel tapi juga sistem terdistribusi.
	![[Pasted image 20220223144339.png]]