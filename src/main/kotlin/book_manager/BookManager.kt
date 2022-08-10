package book_manager

class BookManager {

    private val books = mutableListOf<Book>()
    private var mylisteners = mutableListOf<OnBookInsertedListener>()

    fun addBook(book: Book) {

        Thread.sleep(2000)

        val anyBook = any(book)

        if (!anyBook) {
            books.add(book)
            mylisteners.forEach {
              it.onInsert(book)
            }
        }
    }

    fun addOnBookInsertedListener(listener: OnBookInsertedListener){
        mylisteners.add(listener)
    }

    fun removeAllListener(){
        mylisteners.clear()
    }

    fun addAllBook(bookss: List<Book>) {
        books.addAll(bookss)
    }

    fun getCount(): Int {
        return books.size
    }


    private fun any(book: Book): Boolean {
        return books.any { it.id == book.id }

        /*books.forEach {
            if (book.id == it.id) {
                return true
            }
        }
        return false*/
    }


}