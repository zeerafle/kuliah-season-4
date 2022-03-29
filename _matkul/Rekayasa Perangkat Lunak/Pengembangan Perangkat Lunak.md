- Tingkah laku
- Interface
- Batasan desain
- Kriteria validasi

# Proses

Kerangka kerja untuk tugas-tugas yang dibutuhkan software dengang kualitas tinggi

# Model Proses

Strategi pengembangan perangkat luank yang melingkupi lapisan proses, metode & alat bantu yangh digunakan serta fase-fase dalam pengembangan perangkat lunak.

# Fase - Fase Pengembangan Perangkat Lunak

## Definition Phase

Fokus pada data apa yang mau diproses softwarenya. Ada 6.
3. Interface

## Development Phase

Berfokus pada bagaimana. Setelah tau apa saja data yang pada fase definisi disini mulai dilakukan konstruksi. Disini software sudah jadi.

## Maintenance Phase

Berfokus pada "Change" (Perubahan). Ada penambahan fitur, perbaikan, atau pencegahan.

# Tahapan Pengembangan Perangkat Lunak

Hasil kegiatan yang dilakukan pada fase pertama diatas. Design, implementation masuk ke fase ke dua (development).

## Analysis

Teknik pemecahan masalah yang menguraikan sebuah sistem menjadi komponen-komponennya dengan tujuan mempelajari seberapa bagus komponen-komponen tersebut bekerja dan berinteraksi untuk meraih tujuan mereka.

- Analisis Masalah. Cari tau masalahnya dulu
- Analisis Kelemahan. Setelah tau masalahnya cari kelemahannya
- Analisis Kelayakan.
	- Sisi biaya: Solusi yang ditawarkan diperhitungkan apakah misalnya biaya yang dibutuhkan untuk mengerjakan software ini akan kembali
	- Sisi kebutuhan: Selaku pengembang dan klien apakah mumpuni untuk bisa menjalankan software yang dibuat
- Analisis Kebutuhan Pengembangan Sistem. Analisis jika sudah yakin untuk membuat softwarenya.
	1. Menemukan dan menganalisis masalah
		Identifikasi & analisis:
			- Gejala
			- Masalah
			- Sumber Masalah
	2. Menemukan persyaratan
		- Analissa dokumen, form, prosedur
		- Analisa domain masalah
	1. Dokumentasi dan analisis persyaratan
		-
	![[Pasted image 20220215141001.png]]

## Design

Setelah selesai melakukan analisis, disini dibuat tahapan rincinya. Spesifikasi desain Umum dan RInci:

- desain database : ERD
- desain proses : dataflow diagram
- desain user interface (input, output form dan report)
- desain hardware, software dan jaringan.
 
## Implementation

Menerjemahkan hasil desain logis dan fisik ke dalam kode-kode program komputer.

## Testing

Uji coba perangkat lunak yang terfokus pada logika internal dari perangkat lunak

## Maintenance

- Koreksi
- Peningkatan
- Adaptasi
- Pencegahan

# Model Proses Perangkat Lunak

- Model waterfall
- Model Rapid Application Development
- Model Prototype
- Model Evolusioner
	- Incremental
		Model incremental berdasar pada perilisan software awal ke user, terima feedback, kemudian kembangkan ke beberapa versi sampai sistem memadai.
		![[Pasted image 20220215143853.png]]

		Langkah-langkahnya:
		1. Spesifikasi - analisis
		2. Development - design, implementation
		3. Validation - validasi/maintenance

		Kelebihan:
		1. Biaya merubah kebutuhan customer lebih murah. Karena tidak perlu di ulang dari awal seperti model waterfall
		2. Customer lebih mudah memberi feedback dari pengembangan yang sudah selesai daripada dokumen desain perangkat lunak.
		3. Perangkat lunak akan sering di rilis ke customer bahkan fungsionalitasnya belum lengkap. Dengan begini customer bisa mulai menggunakan perangkat lunak nya.

	- Spiral
		model spiral adalah gabungan waterfall dan prototyping. Model prototypeing fokus pada penyajian atau presentasi kepada user kemudian dievaluasi. Model waterfall fokus kepada proses pengembangan yang sistematis atau berurutan

		Tahapan Spiral Model
		1. Tahap liason. Berhubungan dengan komunikasi antara pihak yang terlibat. Tujuannya adalah memperbaiki dan mengembangkan software sesuai kebutuhan. Tahap analisis
		2. Tahap planning - tahap analisis
		3. Tahap analisis resiko - tahap analisis
		4. Tahap rekayasa - design, testing, implementation
		5. Tahap evaluasi - maintenance

		**Kelebihan dalam menggunakan model spiral :**
		
		1.  Pembangunan dan perubahan perangkat lunak yang terjadi dapat diselesaikan secara sistematis
		2.  Mudah dalam mengestimasi biaya karena proses pembuatan prototype yang jelas dan terencana dalam tahapan yang sistematis
		3.  Manajemen dan analisa risiko yang lebih cepat dan mudah
		4.  Mudah dalam melakukan perubahan kebutuhan dan dokumentasi
		5.  Produksi software bisa terjadi lebih cepat
		
		**Kekurangan dalam menggunakan model spiral :**
		
		1.  Tidak cocok dan sulit diimplementasikan dalam projek kecil
		2.  Memakan waktu yang cukup lama
		3.  Membutuhkan best practice atau pengalaman sebelumnya karena proses yang sangat kompleks
		4.  Resiko dalam tahap planning cukup besar. Misalnya terjadi perbedaan dalam jadwal pengembangan dan anggaran belanja.