Yes, this is bad code. This is bad on purpose, so that programmers who need to practice TDD and refactoring
have a low barrier to getting started.

## Scenario
You are a newly hired programmer to a company that sells point cards.
When you were interviewing, the hiring manager said that you will be doing unit tests on this role.
On your first day, you found out that they don't know about xUnit frameworks, and by "unit testing" they meant tests that programmers do before submitting the code for testing by the Testing Department. You asked your team lead if this was a joke, but they just glared at you like you were trying to show off and one up them on your first week.

## Your Task
Figure out what the program is doing, and get the PointCardReader class in a test harness.

## FAQ
> Can I change the parameters of the methods?

Yes. When you are assigned to a project, you have to own the code no matter how ugly you think it is. If you think you can make the code better, then by all means... Imbibe a craftsman's attitude and make it something you can be proud of.

> I want to test a private method. Can I elevate its access level?

This question has been debated since the inception of unit testing. I side with Michael Feathers on this one: Given a choice between maintaining encapsulation and better code coverage, choose the latter. Would you rather have a well-encapsulated class without tests?

> My solution is different from yours

Good. Let us know how you solved it so that we can learn from you. You can post your solution in the issue tracker directly, or by putting a link to your fork.


## Running
To build the runnable:
```
$ mvn package
```

To run:
```
$ java -cp target/bean-reading-kata-1.0-SNAPSHOT.jar bytehala.kata.App
```
