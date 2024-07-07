const express = require('express');
const app = express();
const bookController = require('./books/book');

app.get('/books', bookController.getAllBooks);
app.get('/books/:id', bookController.getBookById);
app.post('/books', bookController.createBook);
app.put('/books/:id', bookController.updateBook);
app.delete('/books/:id', bookController.deleteBook);

app.listen(3000, () => {
  console.log('Book service listening on port 3000');
});
