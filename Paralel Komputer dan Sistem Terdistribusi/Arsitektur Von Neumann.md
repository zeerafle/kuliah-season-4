# Komputasi Von Neumann

Komputer saat ini single core mengadopsi arsitektur yang dibuat oleh John Von Neumann.

![Pasted image 20220302140921.png](attachments/Pasted%20image%2020220302140921.png)

## Elemen Arsitektur Von Neumann

- **Prosesor**. pusat dari kontrol dan pemrosesan
- **Memori**. untuk menyimpan informasi
- **Perangkat I/O**.

### Prosesor

Perkembangan CPU: Tabung vacuum > transistor > IC > Chip

#### ALU

**Arithmatic and Logic Unit atau Unit Aritmatika dan Logika** berfungsi utuk melakukan semua perhitungan aritmatika dan logika yang terjadi sesuai dengan instruksi program

Bagaimana ALU bekerja

![](attachments/Pasted%20image%2020220302141808.png)

#### Control Unit

Control unit berfungsi <mark>mengatur dan mengendalikan semua peralatan yang ada pada sistem komputer</mark>. Disebut juga mandor nya prosesor.

#### Register

Mirip memori tapi dalam ukuran kecil. Disebut juga cache memori. Di prosesor AMD tidak menggunakan ini, keuntungannya proses lebih cepat tapi juga cepat panas.

- **Program Counter (PC)**
- **Instruction Register (IR)**
- **General Purpose Register**

#### BUS

- ISA
- PCI
- AGP
- USB

## Von Neumann VS Havard

![](attachments/Pasted%20image%2020220302142927.png)

### Arsitektur Harvard

- Arsitektur Havard menggunakan memori terpisah untuk program dan data dengan alamat dan busa data yang berdiri sendiri.