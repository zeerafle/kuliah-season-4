# Edisi Java

- Java Standard Edition (Java SE) untuk pengembangan aplikasi di sisi klien
- Java Enterprise Edition (Java EE) untuk pengembangan aplikasi di sisi server
- Java Micro Edition (Java ME) untuk pengembangan aplikasi di mobile

# Java Runtime Environtment (JRE)

Adalah software yang mengeksekusi aplikasi berbasis Java. Java Virtual Machine (JVM) adalah koleksi program untuk mengeksekusi java bytecode di platform manapun

# Elemen Dasar dari Java

## Keyword

Tidak boleh digunakan sebagai variabel karena merupakan bagian dari instruksi atau perintah di java

![[Pasted image 20220214193758.png]]

## Variabel dan Tipe Data

- Data direpresentasikan oleh variabel dan setiap variabel yang digunakan harus ==dideklarasikan terlebih dahulu==
- Jika tidak maka akan terjadi kesalahan pada saat kompilasi
- Setiap ==nama deklarasi biasa disebut identifier==

### Aturan Pokok dalam Deklarasi Variabel/Identifier

- Diawali oleh huruf/abjad
- Karakter selanjutnya boleh huruf angka dan simbol
- Tidak boleh tanda baca (?!+-,dsb)
- Tidak boleh ada spasi
- Selain keyword
- Saat deklarasi disertai dengan tipe data
- Nama variabel harus deskriptif, menyatakan arti dan tujuan

### Kategori Tipe Data

- Tipe data primitif. Tipe data dasar untuk data tunggal:
	- Boolean
	- char
	- byte, etc.
- Tipe data kompleks/referensi. Tipe data bentukan, kumpulan dari tipe primitif
	- String
	- Array: `int[] x = new int[5]`

### Literal/Nilai dan Tetapan

1. Nilai bilangan bulat
	- Bilangan biasa
	- Bilangan octal
	- Bilangan hexadecimal
2. Nilai bilangan real
	- Titik desimal
	- Eksponen
3. Nilai boolean. True or false
4. Nilai untuk karakter. bisa dinyatakan dalam kutip tunggal
5. Nilai string. dapat diperoleh dengan menempatkan deretan karakter diantara dua tanda kutip, misalnya: "laporan pertanggung jawaban akhir tahun"

### Perubahan Tipe Data

Casting. Misalnya bilangan bulat (int) diubah ke karakter (char). ==`System.in` menerima deretan "bit" yang dianggapnya bilangan bulat (integer).== Sehingga pada contoh dibawah tipe di-*casting* ke char

```java
char c = (char) System.in.read();
```

| Dari tipe | Ke Tipe                               |
| --------- | ------------------------------------- |
| byte      | short, char, int, long, float, double |
| short     | int, long, float, double              |
| char      | int, long, float, double              |
| int       | long, float, double, char             |
| long      | float, double                         |
| float     | double                                | 

Apabila pengubahan tidak diperbolehkan maka bisa dipaksa dengan memasang tipe data tujuan dalam tanda kurung.

### Operator

#### Operator Ekspresi

- Operator aritmetika: +-\*/%
- operator penugasan
	- x=y=z=0;
	- x += y;
	- x -= y;
	- x \*= y;
	- x /= y;
	- y = x++;
	- y = ++x;
- operator logika:
	- Operator relasi: > < == >= !
	- Operator boolean:
		- & (AND)
		- | (OR)
		- ^ (XOR)
		- && (AND (suku kanan tidak dievaluasi bila suku kiri sudah false))
		- || (OR (suku kanan tidak devaluasi bila suku kiri sudah true))
		- ! (NOT)
		- ?: (Operator persyaratan)

### Memberi Komentar

Comment satu baris : `//`
Comment multi baris : `/*ini komen*/`

# Simple Java Program

```java
public class WelcomWorld {
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}
```

---

# Latihan

Tulislah suatu program java sederhana untuk menampilkan tiga string
- Saya Pasti Bisa
- pemrograman itu menyenangkan
- Aku Bahagia Kuliah di Informatika

Tulis suatu program java untuk menampilkan "Belajar JAVA itu Menyenangkan" sebanyak 5 kali

Tulislah suatu program java untuk menampilkan pola berikut:
![[Pasted image 20220214124429.png]]