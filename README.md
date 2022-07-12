# Testing without Mocks

## Mocks are a powerful tool
Mocks are a powerful tool in testing as they allow us to isolate the unit we want to test, the SUT - System Under Test.
With great power comes great responsibility. Now we have to decide how big our unit is.

## Mocks aren't Mocks! What are Mocks anyway?
Mocks are just one of many kinds of Test Doubles, and they are probably not what you think they are.

Test Doubles
- Stub
- Fake
- Dummy
- Spy
- Mock

https://martinfowler.com/articles/mocksArentStubs.html

## To Mock (slang)
Even though it's important to distinguish these types, it has become idiomatic to say 'to mock' over 'to replace with testdouble'.
Probably because it's shorter and expressive. I will use the same notation here.

## Attributes of Mocks

### Test Doubles lock in relations
The primary purpose of tests is to enable us to refactor our code. 
As long as the tests don't change, and don't break, we're confident that the code still does what it did before the change.
However: When we use a test double, we lock-in the relation between the thing that is replaced by our mock, and the thing that calls it.
That lock-in prevents us from safely changing the interface between those. 
When we make a change to that interface, the test will break, even if we didn't break our code.

So we need to be wary of the relations we lock in.
I tend to push those outwards, closer to the IO.
I want to maximize the area that refutes mocks, in order to refactor it freely.

However there's also a different view, where you use mocks as a design tool.
The Idea is that you design the interface of collaborating roles before they even exist, using a mock.
This supports outside-in design and allows going in breadth first, before going deeper.
But this presupposes that you have good design knowledge, and that you know what it is you're building.
I'd argue that most of the time we learn what it is we're building while building it.
So relations change, responsibilities change, roles change.

## What to mock, or: How big should a unit be?

## Mocking Antipatterns
Mocking in it self is already a code smell. A codesmell indicates that something might be wrong with the code, but is not necessary the case.
https://medium.com/javascript-scene/mocking-is-a-code-smell-944a70c90a6a

### Mocking third party code
*Only Mock Types You Own*

>Mock Objects is a design technique so programmers should only
write mocks for types that they can change. Otherwise they cannot
change the design to respond to requirements that arise from the
process. Programmers should not write mocks for fixed types,
such as those defined by the runtime or external libraries. Instead
they should write thin wrappers to implement the application
abstractions in terms of the underlying infrastructure. Those
wrappers will have been defined as part of a need-driven test.
We have found this to be a powerful insight to help programmers
understand the technique. It restores the pre-eminence of the
design in the use of Mock Objects, which has often been
overshadowed by its use for testing interactions with third-party
libraries.


http://jmock.org/oopsla2004.pdf

http://www.mockobjects.com/2007/04/test-smell-everything-is-mocked.html
https://blog.thecodewhisperer.com/permalink/when-is-it-safe-to-introduce-test-doubles
https://www.youtube.com/watch?v=bvRRbWbQwDU&list=PLlmVY7qtgT_lkbrk9iZNizp978mVzpBKl&index=2

http://www.jamesshore.com/v2/blog/2018/testing-without-mocks
https://www.jamesshore.com/v2/projects/lunch-and-learn/testing-without-mocks#:~:text=This%20week%2C%20it's%20testing%20without,they're%20being%20called%20correctly.

https://www.youtube.com/watch?v=EZ05e7EMOLM

---

Mock Roles

Needed Driven Development


from Mock Roles, not Objects
