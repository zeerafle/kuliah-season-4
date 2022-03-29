# Teknik Deteksi Error

Ketika suatu frame ditransmisikan, terdapat tiga class probabilitas yang dapat muncul pada akhir penerimaan:

- Klas 1 (P1) : frame tiba tanpa bit-bit error
- Class 2 (P2) : frame tiba dengan satu atau lebih bit-bit error yang tidak terdeteksi
- Class 3 (P3) :

Persamaan probabilitas diatas dapat dinyatakan sebagai:

$$P1=(1-PB)^{nf}$$

Teknik deteksi error menggunakan *error-detecting-code*, yaitu tambahan bit yang ditambah oleh transmitter.
Tiga teknik yang umum dipakai sebagai deteksi error:

- Parity check
- Cyclic Redudancy Check
- Longitudinal Redudancy Check

## Parity Check

Deteksi bit error yang paling sederhana parity bit pada akhir tiap word dalam frame. Terdapat dua jenis parity bit ini

- Even parity : jumlah dari binary '1' yang genap untuk trasnmisi synchronous
- Odd parity : jumlah dari binary '1' yang ganjil

Parity check mengecek kecocokan antara bit yang dikirim kedua cpu. Kelemahannya adalah jika susunan nya berbeda namun jumlah bit 1 nya sama maka tidak dianggap sebagai error.

<iframe width="560" height="315" src="https://www.youtube.com/embed/pUBdJi6eVYA" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

## Longitudinal Redudancy Check (LRC)

Merupakan pengembangan dari kelemahan parity check.

Contoh. Akan dilakukan pentransmisian string "DATA" dengan teknik LRC paritas ganjil. Data tersebut diubah menjadi sebuah blok yang terbagi menjadi empat baris. Masing-masing karakter direpresentasikan dengan biner kemudian dihitung paritasnya baik secara longitudinal maupun horizontal

![Pasted image 20220318154253.png](Pasted%20image%2020220318154253.png)

## Cyclic redudancy Check (CRC)

Diberikan suatu k-bit frame atau message, transmitter membentuk serangkaian n-bit, yang dikenal sebagai frame check sequence (FCS)

Contoh, dengan pembagian berjenjang

M = 11100101
P = 

![Pasted image 20220318155935.png](Pasted%20image%2020220318155935.png)
![Pasted image 20220318155619.png](Pasted%20image%2020220318155619.png)
![Pasted image 20220318160454.png](Pasted%20image%2020220318160454.png)