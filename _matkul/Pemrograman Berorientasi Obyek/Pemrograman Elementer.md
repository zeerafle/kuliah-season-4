# Menulis Program Sederhana

Menulis suatu program, melibatkan algoritma, ditulis menjadi kode. Algoritma menolong programmer untuk merencanakan suatu program sebelum menjadi bahasa pemrograman.

Contoh:

- baca radius
- Hitung luas menggunakan formula : luas = radius x radius x pi
- Tampilkan luas

![[2022-02-21_12-05.png]]

# Membaca Masukan dari Konsol

Gunakan kelas `Scanner`. Gunakan `System.in` untuk menerima masukan.

```java
Scanner masaukan = new Scanner(System.in);
```

`new Scanner(System.in)` menciptakan suatu obhjek bertipe Scanner. Objek ini dimasukkan ke variabel `masukan`.

![[Pasted image 20220221121922.png]]

# Konstanta Bernama

Nilai suatu variable bisa berubah selama eksekusi suatu program, tetapi suatu konstanta bernama merepresentasikan data permanen yang tidak pernah berubah.

```java
Final tipedata NAMAKONSTANTA = NILAI;
```