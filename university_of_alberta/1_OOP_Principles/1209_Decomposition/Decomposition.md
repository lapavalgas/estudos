# OOP : Decomposition | Expressing Design Structure

Decomposition is taking a whole thing and dividing it up into different parts. Or, on the flip side, taking a bunch of separate parts with different functionalities and combining them together to form a whole.

There are three types of relationships found in decomposition: association, aggregation, and composition.

**Association** is some relationship. This means that there is a loose relationship between two objects. These objects may interact with each other for some time. For example, an object of a class may use services/methods provided by object of another class. 

In UML class diagram the ' 0..* ' means that an class can establish relationship between zero to any other class.

association: não são dependentes : 0..*   (os objetos apenas se relacionam, exemplo pessoa joga bola)

**Aggregation** is a has-a relationship where a whole has parts that belong to it. There may be sharing of parts among the wholes in this relationship. The has-a relationship from the whole to the parts is considered weak. What this means is although parts can belong to the wholes, they can also exist independently.

In UML class diagram the white ' <> ' diamond is fixed next to the class that 'has-a' the other.

aggregation: weak “has-a” pertence a uma parte : 0..* (todo aeroporto precisa de uma equipe técnica para ter serviços, mas não deixa de existir sem uma equipe técnica )

**Composition**  is an exclusive containment of parts, otherwise known as a strong has-a relationship. What this means is that the whole cannot exist without its parts. If loses any of its parts, the whole ceases to exist. If the whole is destroyed, then all of its parts are destroyed too. Usually, you can only access the parts through its whole. Contained parts are exclusive to the whole.

In UML class diagram the ' 1..* ' means that an class needs can establish relationship between one to any other class. But this means that if does not establish at least one relationship the main class will be die.

In UML class diagram the black ' <> ' diamond is fixed next to the class that 'has-a' the other. And more, that means this main class is the whole.

composition: strong “has-a” pertence a uma parte e não existem sem : 1..*  (no dicionário prefixo, raiz e sufixo são exemplos de composição)
