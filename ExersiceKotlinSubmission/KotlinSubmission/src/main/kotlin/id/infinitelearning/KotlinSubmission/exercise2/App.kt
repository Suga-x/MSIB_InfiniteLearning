package id.infinitelearning.KotlinSubmission.exercise2

fun main() {

    /** Latihan 1 List
    Buatlah sebuah variabel bertipe list dengan ketentuan:
    - List tersebut menampung bilangan genap dari 1 hingga 100
    Optional:
    - Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
     */
    // Buat di bawah sini
    var numberList2 = mutableListOf<Int>()
    for (i in 1..100){
        if (i % 2==0){
            numberList2.add(i)
        }
    }
    println(numberList2)

    /** Latihan 2 Map
    Buatlah variabel bertipe Map dengan kriteria:
    Daftar nama bulan dalam setahun,
    - Set Key nya dengan inisial nama bulan dan Value nya nama bulan, contoh
    - key "Jan", value January
    - key "Feb", value February
    - dst...
    Cetak semua nama bulan dengan fungsi forEach sehingga hasil output seperti:
    - Jan -> January
    - Feb -> February
    - Dst...

    Cetak nama bulan sekarang dan bulan lahir kamu dengan format string berikut:
    - "It's {$monthNow} now, I was born in {$birthMonth}"
     */
    // Buat di bawah sini
    val groupMap = mapOf(
        "jan" to "January",
        "feb" to "February",
        "mar" to "March",
        "apr" to "April",
        "mei" to "Mei",
        "jun" to "Juny",
        "jul" to "July",
        "aug" to "August",
        "sep" to "September",
        "oct" to "October",
        "nov" to "November",
        "dec" to "December"
    )
    for (x in groupMap.keys){
        println("${groupMap[x]} -> ${groupMap.getValue(x)}" )
    }
}