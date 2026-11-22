# Приклади запитів до API книгарні

## GET — перелік усіх книг
```bash
curl http://localhost:8080/api/books
```

## GET — фільтр за жанром
```bash
curl "http://localhost:8080/api/books?genre=Поезія"
```

## GET — одна книга за id
```bash
curl http://localhost:8080/api/books/1
```

## GET — неіснуюча книга → 404
```bash
curl -i http://localhost:8080/api/books/999
```

## POST — створити нову книгу (201)
```bash
curl -i -X POST http://localhost:8080/api/books \
  -H "Content-Type: application/json" \
  -d '{"title":"Нова книга","author":"Автор","price":199.00,"year":2024,"genre":"Проза","coverUrl":"/covers/x.jpg","description":"Опис нової книги"}'
```

## PUT — оновити книгу (200 / 404)
```bash
curl -i -X PUT http://localhost:8080/api/books/1 \
  -H "Content-Type: application/json" \
  -d '{"title":"Оновлена назва","author":"Оновлений автор","price":300.00,"year":2024,"genre":"Проза","coverUrl":"/covers/updated.jpg","description":"Оновлений опис"}'
```

## DELETE — видалити книгу (204 / 404)
```bash
curl -i -X DELETE http://localhost:8080/api/books/2
```
