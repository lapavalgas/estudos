# Coupling and Cohesion | Design Principles
## Intro
Once you design complexity exceeds what developers can mentally handle, bugs will occur more often. So you must have a way of evaluating your design complexity. **Since design complexity applies to both classes and the methods within them, we will use the term module to refer to any sort of program unit like these (classes and methods)**. *The metrics* you will use to evaluate design complexity are *coupling* and *cohesion*. **Coupling** (Acoplamento) focuses on complexity between a module and other modules. **Cohesion** (Coesão) focuses on complexity within a module. 
-- --- --
## Coupling
**Coupling** focuses on complexity between a module and other modules. **tightly coupled:** is like puzzles. **loosely coupled:** is like lego. You want lego, or loosely and low coupling, because this is ease to connect to another modules. These two ideas will help you to better apply object-oriented design principles and achieve a more manageable system. When evaluating the coupling of a module, you need to consider degree, ease, and flexibility.

**Degree** is the number of connections between the module and others. With coupling, you want to keep the degree small. For instance, if the module needed to connect to other modules through a few parameters or narrow interfaces, then degree would be small and coupling would be loose. 

**Ease** is how obvious are the connections between the module and others. With coupling, you want the connections to be easy to make without needing to understand the implementations of the other modules.

**Flexibility** is how interchangeable the other modules are for this module. With coupling, you want the other modules easily replaceable for something better in the future. 
-- --- --
## Cohesion
**Cohesion** represents the clarity of the responsibilities of a module. If your module performs one task and nothing else or has a clear purpose, your module has **high cohesion**. On the other hand, if your module tries to encapsulate more than one purpose or has an unclear purpose, your module has **low cohesion**. You want **High Cohesion**
-- --- --
### You want modules with **low coupling** and **high cohesion**.
In general, there's a balance to be made between low coupling and high cohesion in your designs. For a complex system, the complexity can be distributed to between the modules or within the modules. As modules are simplified to achieve high cohesion, they may need to depend more on other modules thus increasing coupling. As connections between modules are simplified to achieve low coupling, the modules may need to take on more responsibilities thus lowering cohesion.