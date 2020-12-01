# UML State Diagram | Modelling Behaviour

A state diagram is a technique that you can use to describe how your system behaves and responds. When an event occurs, you note how a system acts or behaves. 

State diagrams can describe a single object and illustrate how that object behaves in response to a series of events in your system. A state diagram illustrates object behavior by depicting the changing states of an object. These states change and respond to different events. A state is the way an object exists at a particular point in time. The state of an object is determined by the values of its attributes. 

For example, think of a car. A car with an automatic transmission can be in different states, park, reverse, neutral, and drive. When a car is in reverse, it can only behave in a certain way, it can move backwards. If want it to move in a forwards direction, you would have to change the state of the car accordingly. This is how you can think about the states of the objects in your system. When an object is in a certain state, it behaves in specific ways or has attributes set to specific values. Using UML state diagrams, you can express the different states of your objects and how the states will change when an event occurs.

each state has three important sections, a state name, state variables, and activities. Each state should at least have a state name. A state name is as it sounds, the name of the state, these names should be meaningful for the states of your object. 

ntry activities are actions that occur when the state is just entered from another state. Exit activities are actions that occur when the state is exited and moves on to another state. And do activities are actions that occur once, or multiple times while the object is in a certain state. 

State diagrams are useful for describing the behavior of a system or of a single object. For example, it can help you determine the different events that might occur during an object's lifetime. Like different user inputs, and how that object should behave when these events occur, like checking conditions and performing actions.

State diagrams can also help you to find issues in your system. Like discovering a condition that you did not plan for or help you to create tests. Knowing the different states of a system can help to make sure that your tests are complete and correct. State diagrams are a very powerful design technique that you can use to model your software's behavior. Using them, along with the other UML diagrams you've learned, will help you to create well designed software.