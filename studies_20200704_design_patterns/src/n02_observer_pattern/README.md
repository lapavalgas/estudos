# Design Patterns

## Observer Pattern 
### What are?
<!-- Formal defenition -->
The Observer Pattern is a kind of behavior pattern which is concerned with the assignment of responsibilities between objects. The behavior patterns characterize complex control flows that are difficult to follow at run-time. They shift your focus away from the flow of control to let you concentrate just on the way objects are interconnected. The **Observer Pattern** defines a one-to-many dependency between objects so that when one object change state, all of its dependents are notified and updated automatically. Where Subjects (or Observables) update Observers using a commom interface in a loosley coupled way (the Subject know nothing about observers).  *also know as dependents, Publish-Subscribe*. 


### Where to pay attention?
<!-- What is important here? -->
Is a one-to-many relationship; one subject object has many observers. Looking for this relations make easy know who arre subject and who are observer in the context.

Publisher + Subscribers = Observer Pattern
Some objects subscribe, and until it is a subscriber will retieve data from subject object thats send datas. The observer patters is the subscribers. 
Basically is: The object call to subscribe, the subject object put them in the list and now if have data changes all objects in the list will be notifications. If some objects asks to be removed as an observer, the subject object removes it from the set of observers. So the observer, observe data change in other object.

- Unexpected updates, Because observers have no knowledge of each other's presence, they canbe blind to the ultimate cost of changing the subject. This problem is aggravated by the fact that the simple update protocolprovides no details on what changed in the subject. 

- can be expensive many subjects and few observers. 

- to observe two Subject is needed to expand *Update()* method in the observer to let observer know which subject is sendinf the notification. Can simple pass by parameter in the *Update()* method.

- complex scenarios might boost a implement of a Change Manager that ensures the right time to Update() the Observers (see Mediator Pattern and Singleton, both are the ChangeManager in this context)

- some languages implement Subject and Observer as the same interface, sometimes the root class Object can implement this and all Classes in this language can perfom how a Subject or Observer

### Why use?
<!-- in topics contexts benefits and so on -->
- to avoid (pulling) mutiple request for state change in the subject ; so the pattern push the state change
- can keep objects in different layers of implementations because the objects aren't  tightly coupled
- put classes and objects to work together.
- To keep objects in the know when something they might care about happens. And objects can even decide at runtime whether they want to be kept informed. 
- When two objects are loosely coupled, they can interact, but have very little knowledge of each other. The observer Pattern provides an object design where subjects and observers are loosely coupled.
- We never need to modify the subject to add new types of observers. And can reuse subjects or observers independently of each other. 
- To keep every thing loosley coupled. So allow us to build flexible OO systems that can handle change because they minimize the interdependency between objects.
- Observer Pattern are used to allow MVC pattern and user interfaces GUI for listeners and events

- Abstract coupling between Subject and Observer.
- Support for broadcast communication.


### When use?
<!-- Context to use -->
1. When an abstraction has two aspects, one dependent on the other. Encapsulating these aspects in separate objects lets you vary and reuse them independently.
2. When a change to one object requires changing others, and you don't know how many objects need to be changed.
3. When an object shoud be able to notify other objects without making assumptions about who these objects are. In other words, you don't want these objects tightly coupled.

### Diagrams
<img src="" alt="" width="700" height="426">
<img src="" alt="" width="700" height="426">
<img src="" alt="" width="700" height="426">
- basically an interface **Subject** *has-a* list of interface of **Observers**, or knows it's any number of observers.
- so the **ConcreteSubject** *implements* the **Subject** and the **ConcreteObserver** *implements* the **ConcreteObserver***
- Any time the **ConcreteSubject** change state it's can call the *Update()* method of all **ConcreteObserver** sending the data
- And finally the **ConcreteObserver** maintains the ConcreteSubject reference that allows decline to be an Observer.

#### Naming conventions
<!-- Explain the name conventions -->

### Java and lib examples
<!-- Java lib examples -->
java.util.Observable/Observer <!-- not good at all, doesn't implement an interface, and other problems that limit its usefulness and reuse! How? When we extends the class we can't extends another one... And to be protected this violate de design principle 'favor composition over inheritance' -->
java.beans.PropertyChangeListener (interface)
java.swing.JButton/AbstractButton
RMI ?!

## References
<a href="design_patterns.pdf">p.0; GOF: Design Pattern reference</a> <br>
<a href="java-Design-Patterns.pdf">p.0; Java Design Patterns: Reusable solutions to a common problems </a> <br>
<a href="Head First Design Patterns.pdf">p.75; Head First Design Patterns</a> <br>