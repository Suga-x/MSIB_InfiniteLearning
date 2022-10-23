package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    try {
        val Error = 100 / 0
        println(Error)
    } catch (e: Exception) {
        println("Error Status = $e")
    }

}