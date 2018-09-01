package hu.frontrider.kgit.helper

expect class FileReader() {
    fun getBytes(path: String): ByteArray
    fun writeBytes(path: String, bytes: ByteArray)
}

expect class Compressor() {
    fun compress(byteArray: ByteArray): ByteArray
    fun expand(byteArray: ByteArray): ByteArray
}