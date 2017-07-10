class RotationalCipher(val shiftKey: Int) {

    companion object {
        private val LOWERS = "abcdefghijklmnopqrstuvwxyz"
        private val UPPERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    }

    fun encode(text: String): String {
        return text.map { char ->
            when (char) {
                in LOWERS -> LOWERS[(LOWERS.indexOf(char) + shiftKey) % LOWERS.length]
                in UPPERS -> UPPERS[(UPPERS.indexOf(char) + shiftKey) % UPPERS.length]
                else      -> char
            }
        }.joinToString("")
    }

}
