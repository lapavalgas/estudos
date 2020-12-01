# Conceptual integrity | Design Principles
**Conceptual integrity** is about creating consistent software. It's making decisions about how your system will be designed and implemented, so that even if multiple people worked on the software, it would seem as if there was only one mind guiding all the work. Now, it's important to understand that conceptual integrity does not mean that the developers in your team don't get to voice their opinions about the software. It's more about everyone agreeing to use certain design principles and conventions. There are multiple ways to achieve conceptual integrity. One important way is communication.
```
Conceptual integrity it is better to have a system omit certain anomalous features and improvements, but to reflect one set of design ideas, than to have one that contains many good but independent and uncoordinated ideas. 
The Mythical Man-Month, Fred Brooks
```
Simply put, conceptual integrity is about designing and implementing the software in a consistent manner, as if it were written by one person.  Practicing conceptual integrity in your software can help guide your team when they are writing software. If each team member sees that the design and logic of the software is consistent and easy to follow, it will help them know how and where to change the software to meet new requirements. 

## Code reviews
Another way to ensure conceptual integrity is **code reviews**. Code reviews are systematic examinations of written code. It's similar to peer review in writing. It's often used to find mistakes in the software, but also to keep different developers consistent with each other.Developers evaluate each other's' code line by line to uncover issues.

## Design principles and Programming constructs
Certain **design principles and programming constructs** can also help in maintaining conceptual integrity. Consider Java interfaces. An interface defines a type, with behaviors that implementing classes of that type should all have in common. This creates consistency in your software, thereby also increasing the conceptual integrity of your software.

Os quatro princípios de design de softwares
Abstraction
Encapsulation
Decomposition
Generalization

## Design patterns
The **Design patterns**. They provide conventional structures for your classes to solve a design issue and lead to consistency.

## Design or Architecture underlying
Having a well defined **design or architecture underlying** your software. While software design is typically associated with guiding the internal design of software running as a single process, software architecture describes how software, running as multiple processes, work together, and how they relate to each other.

## Unifying concepts
**Unifying concepts** is also another approach to maintaining conceptual integrity. It is taking seemingly different things and finding common ground so that each concepts can be seen and treated in similar ways.

## small core group that accepts commits
Having a **small core group that accepts commits** to the code base is another approach in achieving conceptual integrity. This is similar to exercising code reviews, but it restricts the review to only core members of your software team. These members will be responsible for ensuring that any software changes follow the overall architecture and design of the software. Restricting this decision to only either a single person or a small group will solve any design issues and lead to consistency.
-- --- --
