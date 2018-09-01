package hu.frontrider.kgit.helper

actual class FileReader actual constructor() {

    actual fun getBytes(path: String): ByteArray {

    }

    actual fun writeBytes(path: String, bytes: ByteArray) {}
}

actual class Compressor actual constructor() {
    actual fun expand(byteArray: ByteArray): ByteArray {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    actual fun compress(byteArray: ByteArray): ByteArray {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}