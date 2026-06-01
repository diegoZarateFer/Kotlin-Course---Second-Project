package test

import kotlinx.serialization.json.Json
import java.io.File

fun main() {

    val booksFile = File("books.json")
    val books = retrieveBooks(file = booksFile)
    for(book in books) {
        println(book)
    }

//    val books = mutableListOf<Book>(
//        Book(title = "Book 1", year = 1900, author = "Jean Jakes"),
//        Book(title = "Book 2", year = 2020, author = "John Smith"),
//    )

//    saveBooks(books = books, file = booksFile)



//    val file = File("items.json")
//    writeToFile(file)

//    val items = readFromFile(file)
//    for(item in items) {
//        println(item)
//    }
}

fun readFromFile(file: File): List<Item> {
    val content = file.readText().trim()
    return Json.decodeFromString<List<Item>>(content)
}

fun writeToFile(file: File) {

    val items = mutableListOf<Item>()
    while (true) {
        print("Enter id or 0 to exit: ")
        val id = readln().toInt()
        if (id == 0) break

        print("Enter name: ")
        val name = readln()

        val item = Item(id, name)
        items.add(item)
    }

    val serializedItems = Json.encodeToString(items)
    file.writeText(serializedItems)
}

fun saveBooks(books: List<Book>, file:File) {
    file.writeText(Json.encodeToString(books))
}

fun retrieveBooks(file: File): List<Book> {
    val serializedBooks = file.readText().trim()
    return Json.decodeFromString(serializedBooks)
}