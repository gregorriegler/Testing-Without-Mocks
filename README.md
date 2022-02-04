There is a Database Object, which is a global, And it has an arbitrary delay.
Has 
- Db.persist(Object) 
- Db.findAll()
- Db.clear()
You do not own it, and you are not allowed to change it.
But you may use it in your tests.
Use self written test doubles if necessary.
*) Idea, telescope Db ... Have to use Infrastructure.getInstance().getDb() to get the Db (the point is not use mocks on the types you don't own) 

Step 1:
Create a Service that can create and persist new Books to this Db.
A Book has a name, and an ISBN.

Step 2:
Service can find all books

(Step 3:
Can find a book by its id) 

Step 3:
Every 10th book you create should be marked as an anniversary book.

Step 4:
Every 100th book, the anniversary is not just any anniversary book, but a special golden anniversary.

Covers: 
- Create proper Repository Abstraction
- Logic Sandwich
- Fake

Possible steps:
1.) Write Test that stores a book in the Db, assert against Db.
 - No refactorings or test doubles necessary, no business logic.

2.) Write Test that finds stored books in the Db, assert against service.findAll.
- No refactorings or test doubles necessary, no business logic. becomes blackbox test.

3.) for the anniversary change, would have to create book 10 times. very slow.
 - First refactor our a repository that can add (extract delegate)

4.) Notice how the BookServiceTest is almost a Contract Test for the Repository abstraction.
Can copy that, slight changes lead to the Contract test.

5.) Now extend the Contract Test for a new FakeBookRepository. Implementation is quite easy.

6.) Can use the new Fake in the BookServiceTest, which becomes faster.

7.) BookService ends up with a Logic Sandwich. Possibility to extract and delegate a domain service, or to the Book itself.

8.) Test Anniversary fully with DomainService... much easier.

9.) The golden anniversary forces the DomainService even more.
    Parallel Change here: First add assertion for anniversary by type.
    Lots of preparatory refactorings here. Careful!