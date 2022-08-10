import book_manager.Book
import book_manager.BookManager
import book_manager.OnBookInsertedListener

fun main() {

    val bookManager = BookManager()

    val book = Book(1, "Sanvel", "Raffi")
    val book1 = Book(2, "Sanvel", "Raffi")
    val book2 = Book(3, "Sanvel", "Raffi")
    val book3 = Book(4, "Sanvel", "Raffi")
    val book4 = Book(5, "Sanvel", "Raffi")


    bookManager.addOnBookInsertedListener(MyListener())

    bookManager.addBook(book)
}

class MyListener : OnBookInsertedListener {
    override fun onInsert(book: Book) {
        println(book.name)
    }
}