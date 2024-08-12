object CaesarCipher {

  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  // Function to encrypt text using Caesar cipher
  def encrypt(text: String, shift: Int): String = {
    text.toUpperCase.map { c =>
      if (alphabet.contains(c)) {
        val newIndex = (alphabet.indexOf(c) + shift) % alphabet.length
        alphabet(newIndex)
      } else {
        c // Non-alphabet characters remain unchanged
      }
    }
  }

  // Function to decrypt text using Caesar cipher
  def decrypt(text: String, shift: Int): String = {
    text.toUpperCase.map { c =>
      if (alphabet.contains(c)) {
        val newIndex = (alphabet.indexOf(c) - shift + alphabet.length) % alphabet.length
        alphabet(newIndex)
      } else {
        c // Non-alphabet characters remain unchanged
      }
    }
  }

  // Function to process data using a given cipher function
  def cipher(text: String, shift: Int, func: (String, Int) => String): String = {
    func(text, shift)
  }

  def main(args: Array[String]): Unit = {
    val originalText = "HELLO WORLD"
    val shift = 3

    // Encrypt the text
    val encryptedText = cipher(originalText, shift, encrypt)
    println(s"Encrypted Text: $encryptedText")

    // Decrypt the text
    val decryptedText = cipher(encryptedText, shift, decrypt)
    println(s"Decrypted Text: $decryptedText")
  }
}
