# Client-Server-chat-using-double-encryption-and-decryption

The main objective of the program is to send message from a client to server using  Caesar cipher & AES encryption-decryption methods.By using the socket programming technique in JAVA.We are using double encryption here that is when the client sends a message to the server it is first encrypted with the caesar cipher and the encrypted message is again encrypted using AES encryption.The message is then send to the server side where the decryption takes place,here AES decryption takes place at first then the decrypted code will be again decrypted by using caesar cipher method which will give the plaintext to the end user at the server side.This keeps continuing in both the directions till both of them end their conversation.
