package hu.frontrider.kgit.data

data class GitReference(val name: String, val target: GitObject)

data class GitObject(val hash: String)

data class GitUser(val name: String)