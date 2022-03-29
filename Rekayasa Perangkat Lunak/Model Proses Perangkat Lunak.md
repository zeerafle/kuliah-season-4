# Model Proses Perangkat Lunak

[[202202221514|Live note]]

## Model Waterfall

Model sequential. Tahapannya:

1. Analysis
2. Design
3. Code
4. Test

Dalam tahap analysis dan design dapat terjadi looping.

![[Pasted image 20220222134015.png]]

## Model Prototype

![[Pasted image 20220222134853.png]]

Model Prototype lebih berfokus untuk mempercepat proses analisis. Model ini memjembatani proses analisis yang susah. Ketika user tidak bisa menjelaskan dengan detail apa yang mereka inginkan.

Maka setelah didesain dengan cepat, dibuat protypenya, hasil prototype ini dikomunikasikan dengan client apa yang mereka inginkan. Jadi user terpancing untuk memberikan masukan perbaikan prototype (refining prototype). Dari sini langsung ke quick design dan berulang terus sampai tidak perlu perbaikan lagi.

Prototype tadi tidak gunakan namun productnya yang dibuat (disini fase implementation, testing) setelah itu product siap digunakan.

Kekurangan nya adalah proses maintenance ketika perlu dilakukan adaptasi atau perubahan. Karena didesain dengan serba cepat.

## Model RAD

![[Pasted image 20220222141246.png]]

Menekankan pada proses pengerjaan software yang singkat. Dalam pelaksanaannya menggunakan model prototype. Tahapannya berurutan. Harus punya komitment dalam tim untuk menyelesaikan pekerjaannya.

Budgetnya besar, karena perlu anggota tim yang bekerja secara cepat.

## Model Incremental

Model iteratif. 

![[Pasted image 20220222142848.png]]

Dari kebutuhan analysis dan design.

- Increment pertama. lebih berfokus pada fungsi utamanya
- Increment kedua. Mengerjakan fungsi berikutnya (di increment selanjutnya juga)

Hasilnya akan menjadi prototype untuk membantu menggali kebutuhan yang lebih detail. Tetapi yang membedakan adalah di model ini hasil dari increment pertama sudah merupakan produk yang bisa dipakai. Tujuan nya adalah si client akan menyampaikan fitur fitur apa yang sudah/belum bagus untuk selanjutnya di analisis pada increment kedua.

Kendala yang mungkin muncul adalah bagaiman mengintegrasikan increment pertama dengan increment berikutnya. Masalah waktu pengerjaannya adalah butuh waktu yang lama karena terjadi proses sequential di setiap increment nya.

## Model Spiral

Lebih menekankan pada analisis resiko. Cocok digunakan untuk projek skala besar, karena ada tahapan-tahapan yang tidak ada di model sebelumnya.

![[Pasted image 20220222144738.png]]

Model ini mengombinasikan model waterfall (dari tahapannya), model incremental (adanya iterasi, terus menghasilkan produk di increment selanjutnya), model prototype (proses development). Pada loop pertama hanya untuk mendapatkan requirement untuk merencanakan tahapan selanjutnya.

Ada tahapan analisis resiko, tenaga ahli, yang tidak bisa dikerjakan analis biasa.

**Tahapan**:

1. Analisis kebutuhan
2. Analisis resiko
3. Buat prototype
4. Simulasikan prototype untuk benchmark

Di loop keempat sudah bukan prototype lagi tapi adalah produk yang sudah bisa dipakai.

---

Buat tabel, disebelah kiri nama model-modelnya, bagian atasnya: requirement, team, waktu, skala, budget, resiko kegagalan

- Req:
- Team: apakah perlu banyak
- Waktu: apakah lama
- Skala: besar atau kecil
- Budget: minimum atau maks
- Resiko kegagalan: besar atau kecil
