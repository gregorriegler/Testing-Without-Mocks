
https://martinfowler.com/articles/mocksArentStubs.html
http://jmock.org/oopsla2004.pdf
https://medium.com/javascript-scene/mocking-is-a-code-smell-944a70c90a6a
http://www.mockobjects.com/2007/04/test-smell-everything-is-mocked.html
https://blog.thecodewhisperer.com/permalink/when-is-it-safe-to-introduce-test-doubles
https://www.youtube.com/watch?v=bvRRbWbQwDU&list=PLlmVY7qtgT_lkbrk9iZNizp978mVzpBKl&index=2

http://www.jamesshore.com/v2/blog/2018/testing-without-mocks
https://www.jamesshore.com/v2/projects/lunch-and-learn/testing-without-mocks#:~:text=This%20week%2C%20it's%20testing%20without,they're%20being%20called%20correctly.

https://www.youtube.com/watch?v=EZ05e7EMOLM

---

Mock Roles

Needed Driven Development

## Only Mock Types You Own
Mock Objects is a design technique so programmers should only
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


##Mock Objects should only be used at the boundaries of the system
We believe the opposite, that Mock Objects are most useful when
used to drive the design of the code under test. This implies that
they are most useful within the system where the interfaces can be
changed. Mocks and stubs can still be useful for testing
interactions with third-party code, especially for avoiding test
dependencies, but for us this is a secondary aspect to the
technique.

from Mock Roles, not Objects