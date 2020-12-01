# Design Patterns

## Strategy Pattern 
### What are?
**The strategy pattern is used to encapsulated behaviors**, so it's an **behavioral patterns type** of *Design Pattern*. Defines a family of algorithms, encapsulates each one, and makes them interchangebla. Strategy lets the algorithm vary independently from clients that use it. Client doesn't means the client side in client-server, but any class that actually uses the strategy. *Also know as a Policy*.

### Where to pay attention?
Pay careful attention to the relationship between the classes:
- is-a, (in UML the arrow --|> means is-a)
- has-a, (in UML the arrow --> means has-a)
- implements.
HAS-A can be better tha IS-A, the has-a relationship is an interesting one: each duck has a FlyBehavior and a QuackBehavior to which it delegates flying and quacking. When put two classes together like this you're using composition. Instead of inheriting their behavior, the ducks get their behavior by being composed with the right behavior object. This is an importante technic; in fact a **design principle**: *favor composition over inheritance*.
"*basic* the **inheritance is not the best for reuse code**"

### Why use?
- **interchangeble behaviors by plug-and-play**, sometimes can plug algorithm A, or B or C... Or whenever you want change what the algorithm make you doesn't need change the client (the object that claims/call/execute).
- **if the behavior change in some contexts** is better use this patterns and avoid a lots of 'if' 'else'.
- we can create **differents contexts** and then pass the required one to the client.

### When use?
1. Many classes differ only in their behavior. Strategy provide a way to configure a class with one of many behaviors.
2. you need different variants of an algorithm. For example, you might define algorithms reflecting different space/time trade-offs. Strategies can be used these variants are implemented as a class hierarchy of algorithms.
3. (good one) An algorithm use data that clients shoudn't know about. Use the Strategy pattern to avoid exposing complex, algorithm-specific data structures. 
4. a class defines many behaviors, and these appear as multiple conditional statements in its operations. Instead of many conditionals, move related conditional branches into their own strategy class.

### Diagrams
<img src="" alt="" width="700" height="426">
<img src="" alt="" width="700" height="426">
<img src="" alt="" width="700" height="426">
- basically the **Client** *has-a* **IBehaviorStrategy** 
- and **ConcreteBehaviorStrategy** *implements* **IBehaviorStrategy**

#### Naming conventions
Use *Behavior* to explicitly that the behavior have been encapsulate. Or, and better, using the *Strategy* name to implicity the pattern name in the classes/interfaces names. Examples:
- SomeDuck extends abstract DUCK has-a IDuckBehaviorStrategy | DuckBehaviorStrategy implements IDuckBehaviorStrategy
- SomeCharacter extends abstract CHARACTER has-a ICharacterBehaviorStrategy | CharacterBehaviorStrategy implements ICharacterBehaviorStrategy

### Java and lib examples
- java.util.Comparator#compare()
- javax.servlet.http.HttpServlet
- javax.servlet.Filter#doFilter()

## References
<a href="design_patterns.pdf">GOF: Design Pattern reference</a> <br>
<a href="java-Design-Patterns.pdf">Java Design Patterns: Reusable solutions to a common problems </a> <br>
<a href="Head First Design Patterns.pdf">Head First Design Patterns</a> <br>
<a href="https://www.youtube.com/watch?v=v9ejT8FO-7I&list=PLrhzvIcii6GNjpARdnO4ueTUAVR9eMBpc">Christopher Okhravi: Design Patterns in Object Oriented Programming / strategy pattern </a> <br>
<a href="https://www.youtube.com/watch?v=pxmqkzWPW6E">Full Cycle: Design Patterns youtube series / strategy pattern</a> <br>


