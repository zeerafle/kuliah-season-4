# Software Requirements: Analysis Concept & Principles

- Requirements
- Requirements Engineering
- RE-Process
- Teknik Komunikasi

## Requirements

Disebut juga dengan persyaratan atau kebutuhan mengarah pada ==kondisi atau kemampuan yang dimiliki oleh user untuk menyelesaikan masalah atau mencapai suatu tujuan==. Requirements juga merupakan kondisi yang harus diberikan oleh sistem untuk memenuhi kontrak, standar, spesifikasi, atau dokumen-dokumen yang diperlukan secara formal. Dua definisi diatas didokumentasikan.

Inilah yang harus analis hasilkan di tahap pertama ketika mulai mengembangkan perangkat lunak.

## Requirements Engineering

Rekayasa kebutuhan, disebut demikian karena kebutuhan yang sangat luas. Requirements Engineering adalah ==proses menjaga layanan yang customer persyaratkan dari sistemnya serta menentukan batasan bagaimana sistem beroperasi dan berkembang==. Requirements Engineering adalah spectrum tugas dan teknik yang mengarah ke pemahaman requirements.

### Requirements Types

- User requirements
	- Dibuat untuk costumer (kita yang menuliskan)
	- Menggunakan bahasa non-teknis
- System requirements
	- Dibuat untuk pengembang
	- Lebih rinci dari fungsi, layanan dan batasan operasional sistem.

#### Software Requirements 

Software requirements menjalaskan "apa" yaitu apa input, dan apa outputnya.

![[Pasted image 20220301141929.png]]

Dari gambaran requirements ini haruslah sudah lengkap.

Contoh [[Mentcare requirements document.pdf|dokumen requirement]]

Ada dua tipe software requirement:

- **Functional Requirement**. Peryataan layanan yang harus diberikan oleh sistem, bagaimana sistem bereaksi terhadap suatu input, dan bagaimana sistem bekerja pada sistuasi tertentu.
	- Contoh
		- System reqirement 1.1 diatas
		- Seorang user harus dapat daftar janji untuk masing masing klinik
		- Sistem akan menghasilkan daftar pasien yang akan hadir pada janji tadi
- **Non Functional Requirements**. Batasana layanan/fungsi yang diberikan oleh sistem. Mencakup batasan waktu, batasan pada proses pengembangan, standar, dll. Contoh system requirement 1.2 diatas pada batasan waktu printing
	- Contoh
		- **Product requirement**. Sistem harus available pada hari kerja
		- **Organizational Requirement**. Setiap user akan diotentikasi kartu ID mereka
		- **External requirement**. Privasi pasien

### Good Requirements

- **Atomic**. Usahakan satu requirement hanya untuk menjelaskan satu fungsi/layanan supaya detail.
- **Testable**. Dapat dites
- **Prioritized**. Dibuat berdasarkan prioritas
- **Consistent**.
- **Completed**
- **Unambigous**

| Bad requirements                                                     | Good requirements                                                                            |
| -------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| *"User akan dapat melakukan pencarian daftar janji di semua klinik"* | *"User akan dapat melakukan pencarian daftar janji di semua klinik berdasarkan nama pasien"* |

| Properti             | Pengukuran                                                                      |
| -------------------- | ------------------------------------------------------------------------------- |
| Kecepatan            | Transaksi yang diproses/detik, waktu tanggap user/event, waktu refresh layar    |
| Ukuran               | Kbyte, jumlah chip RAM                                                          |
| Kemudahan penggunaan | Waktu pelatihan, jumlah frame help                                              |
| Keandalan            | Waktu rata-rata kegagalan, probabilitas ketidaktersediaan                       |
| Ketahanan            | Waktu start ualng setelah kegagaln, presentase event yang menyebabkan kegagalan |
| Protabilitas         | Persentase pernyataan yang bergantung target, jumlah sistem target              | 

### Requirements Engineering Process

![[Pasted image 20220301151629.png]]

Output dari requirement engineering process adalah ==dokumen system requirements dan model proses==

## Teknik Komunikasi

- Meeting & Interview
	- Tidak ada persyaratan khusus
	- Merekam persyaratan dari semua stakeholder
	- Merupakan proses yang iteratif
- Fast scenario
	1. Fasilitatior ditetapkan
	2. Dilakukan di sisi netral
	3. Aturan main untuk perisapan dan partisipasi dibuat
	4. Agenda formal diusulkan
	5. Menggunakan media dalam mekanisme definisi
	6. manulis draft spesifikasi
- Quality FUnction Deployment (QFD)
	- Lebih berfokus pada kualitas
	- Teknik manajemen kualitas
	- Menkankan pada pemahaman apa yang berharga bagi pelanggan
	- Maneggunakan wawancara dan observasi pelanggan, survey dan pengujian data historis dalam aktivitas pengumpulan persyaratan
- Join Application Deployment (JAD)

 ## Teknik Dokumentasi

 - Forms
 - Reports
 - Policy Manual

---

Translate dan pelajari requirement tadi. Nanti akan dapat business requirement, apa saja yang dibutuhkan pengguna. Dengan melihat itu diharapkan kita bisa melakukan pemodelan.