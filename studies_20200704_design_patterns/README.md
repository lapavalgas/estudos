# Design Patterns

## Keep in mind the object oriented principles :
1. Abstraction
2. Encapsulation
3. Polymorphism
4. Inheritance

- **Encapsulate what varies.** Identify the aspects of your code application that vary and separate them from what stays the same. **Take the parts that vary encapsulate them, so that later you can alter or extend the parts tha vary without affecting those that don't.**. 

- **Program to interfaces, not implementations.** Program to an interface, not an implementation. Or, rephrase: program to a supertype.

- **Favor composition over inheritance.** Favor composition over inheritance.

- **Strive for loosely coupled design** between objects that interact.

## What are?
Designing is an art and it comes with experience. As developer, it is our responsibility to design the code in such a way which allow our code to be flexible, maintainable, and re-usable. But there are some set of solutions written by some of the advanced and experienced developers while facing and solving similar designing problems. These solutions are know as Design Patterns. The design patterns is the experience in   designing the object oriented code.

Design Patterns are general reusable solutions to commonly occurring problems. These are the best  practices, used by the experienced developers. Patterns are not complete code, but it can use as a template which can be applied to a problem. We can think of patterns as a formal document which contains recurring design problems and its solutions.

## Pattern has four essential elements:
1. **Pattern name**, is used to provide a single and meaningful name to the pattern which defines a design problem and a  solution for it. Helps itself to be referred to others easily.

2. **Problem** describes when to apple the patterns. It explains the problem and its context. It might describe specific design problems such as how to represent algorithms as objects. 

3. The **solution** describes the element that make up the design, their relationships, responsibilities, and collaborations. The solution work as a template to the problem context.

4. And the **result and consequences** of applying the pattern. Since reuse is often a factor in object-oriented design, the consequences of a pattern include its impact on a system’s flexibility, extensibility, or portability. Listing these consequences explicitly helps you understand and evaluate them.

## Why use?
- **Flexibility**: Using design patterns your code becomes flexible. It helps to provide the correct level of abstraction due to which objects become loosely coupled to each other which makes your code easy to change.

- **Reusability**: Loosely coupled and cohesive objects and classes can make your code more reusable. This kind of code becomes easy to be tested as compared to the highly coupled code

- **Shared Vocabulary**: Shared vocabulary makes it easy to share your code and thought with other team members. It creates more understanding between the team members related to the code.

- **Capture best practices**: Design patterns capture solutions which have been successfully applied to problems. By learning thesepatterns and the related problem, an inexperienced developer learns a lot about software design.

## How to select and use one?
First, you need to identify the kind of design problem you are facing. A design problem can be categorized into creational, structural, or behavioral. Based to this category you can filter the patterns and selects the appropriate one. 

## Categorization of patterns
1. **Creational patterns** are used to design the instantiaion process of objects. The creational pattern uses the inheritance to vary the object creation.
There are tworecurring themes in these patterns. First, they all encapsulate knowledge about which concrete classes the system uses. Second, they hide instances of these classes are created and put togheter. All the system at large knows about the objects is their interfaces as defined by abstract classes. Consequently, the creational patterns give you a lot of flexibility in what gets created, who creates it, how it gets created, and when.
There can be some cases when two or more patterns looks fit as a solution to a problem. At other times, the two patterns complement each other for example; Builder can be used with other pattern to implements which components to get built. These patterns are: **Abstract Factory**, **Builder**, **Factory Method**, **Prototype**, **Singleton**.

2. **Structural patterns** are cincerned with how classes and objects are composed to form larger structural class patterbs yse inhetitance to conpose interfaces or inplementations. As a simple example, consider how multiple inheritance mixes two or more classes into one. The result is a class that combines the properties of its parent classes. this pattern is particularly useful for naking independentlty developed class libraries work togheter. **Adapter**, **Bridhe**, **Composite**, **Decorator**, **Facade**, **Flyweight**, **Proxy**.

3. **Behavioral patterns** are cincerned with algorithms and the assignment of resonsability between objects. Behavioral patterns describe not just patterns of objects or classes but also the patterns of communication between them. These patterns characterize complex control flow that's difficult to follow at run-time. They shift your focus fron flow of control to let you concentrate just on the way objects are interconnected. Behavioral object patterns use pbject composition rathen than inheritance. Some describe how a group of peer objects coorporate to perorm a task that no single object can carry out by itself. An important issue here is how peer objects knows about each other. Peers could maintain explicit references to each other, but that would increase their coupling. In the extreme, every object would know about every other. The Meadiator pattern avoids this by introducing a  mediator object between peers. The  mediator provides the indirection needed for loose coupling. ** Chain of Responsibility**, **Command**, **Interpreter**, **Iterator**, **Mediator**, **Memento**, **Observer**, **State**, 
**Strategy**, **Template Method**, **Visitor**.

## References
<a href="design_patterns.pdf">p.11; GOF: Design Pattern reference</a> <br>
<a href="java-Design-Patterns.pdf">p.11; Java Design Patterns: Reusable solutions to a common problems </a> <br>
<a href="Head First Design Patterns.pdf">p.13; Head First Design Patterns</a> <br>