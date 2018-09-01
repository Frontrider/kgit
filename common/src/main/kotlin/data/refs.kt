package hu.frontrider.kgit.data

data class Tag(
        val reference: GitReference,
        val commit: GitCommit,
        val message: String
)

data class Branch(val reference: GitReference)

data class GitCommit(
        val snapshot: GitObject,
        val message: String,
        val comittee: GitUser,
        val parent: GitObject
)