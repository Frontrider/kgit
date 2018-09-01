package hu.frontrider.kgit.helper

import hu.frontrider.kgit.data.GitReference

class ObjectReader {

    fun getCommit(reference:GitReference){
        val hash = reference.target.hash
        val bytes = FileReader().getBytes("objects/${hash.removeRange(2, hash.length)}/$hash")
        val uncompressedbytes = Compressor().expand(bytes)
        println(uncompressedbytes)
    }
}