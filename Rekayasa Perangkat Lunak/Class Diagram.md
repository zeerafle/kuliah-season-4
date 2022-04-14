---
toc: true
---

Class diagram mendeskripsikan semua objek yang terdapat dalam <mark>sistem</mark> dan <mark>relasi</mark>, membantu visualisasi, dan untuk deployment dan component diagram.

## Apa Yang Ada dalam Class

- Class
- Relasi
- Constrain (batasan)
- Inheritance (pewarisan)

## Multiplicity

Kalau di ERD disebut kardinalitas. Yaitu menunjukkan relasi jumlah objek.

## Visibility Class Diagram

Ketampakan atribut atau method

## Relationship

### Generalisasi

Pakai inheritance (pewarisan)


### Asosiasi

- Satu arah:
  Menggambar pesan urutan kejadian yang terjadi dari <mark>hanya salah satu</mark> kelas dan yang lain pasif
- Dua arah:
  Yang ini dua-duanya aktif

### Depedensi

Sebuah kelas mengacu ke kelas lain. Misal, class `peminjaman buku` membuat objek `buku`

### Agregasi

Relasi yang lebih kuat dari [Asosiasi](Class%20Diagram.md#Asosiasi). Suatu kelas merupakan bagian kuat dari kelas lain, namun opsional.

### Komposisi

Relasi paling kuat. Sautu kelas merupakan bagian wajib dari kelas yang lain.

### Realisasi

Yaitu implementasi, penerapan Interface