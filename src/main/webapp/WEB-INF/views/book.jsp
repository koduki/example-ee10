<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Book Information</h1>
        <p>Title: ${book.title}</p>
        <p>Author(s): ${book.author}</p>
        <p>ISBN: ${book.isbn}</p>
    </body>
</html>
