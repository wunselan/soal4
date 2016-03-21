Soal Praktikum Pemrograman Lanjut IF-E 2016 BAB IV (Encapsulation)
===  
####Soal 
Sebuah idol group ingin melakukan pendataan terhadap member-membernya, buatlah program untuk melakukan pendataan tersebut dan menampilkannya.  
Class yang harus ada :

* Main class
* Member class

Setiap objek member minimal memiliki : 

* Nama
* Team
* Umur
* Nilai Penampilan
* NIlai Suara 
* NIlai attitude

**Semua atribut tidak bisa diakses oleh kelas lain selain kelas Member, berarti modifier apa yang digunakan?**

Setiap objek member bisa melakukan :

* accessor dan muttator untuk semua atribut
* khusus atribut **nilai**, accessor adalah untuk **nilai rata-rata ** bukan nilai satu-persatu.

Pada Main class :

* Ada method (bisa method baru atau langsung didalam main method) yang digunakan untuk menampilkan semua data member, **gunakan perulangan pada arraylist**.
* Minimal ada 3 member, namun jumlah member **harus dinamis** , (clue : gunakanlah *List* atau *ArrayList*).

Keluaran program : 
```
---------------------Daftar Member-------------------
Nama : "nama member"
Team : "team member"
Umur : "umur member"
Rata-rata nilai : "total nilai member"
-----------------------------------------------------------
Nama : "nama member"
Team : "team member"
Umur : "umur member"
Rata-rata nilai : "total nilai member"
-----------------------------------------------------------
.
.
.
dst.
```
####Cara pengerjaan :

* Isi data diri dengan mengedit **data-diri.md**
* Masukkan file .java pada folder **src** (hanya file .java saja) hilangkan pendefinisian package pada setiap file .java
* Masukkan screenshot pada folder **screenshot**
* Jangan lupa comment untuk setiap method

**Jika pekerjaan plagiasi, maka nilai tugas ini akan di 0 kan untuk semua pihak yang terlibat.**