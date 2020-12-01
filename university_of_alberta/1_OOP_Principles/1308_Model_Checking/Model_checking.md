# Model Checking

Model checking is a systematic check of your system's state model in all its possible states. Basically, you check all the various states of your software and find that there are any errors by simulating different events that would change the states and variables of your software. So you check if the state model of your software contains some flaw. These checks are done using model checking software.

Model checkers generate a State Model from your code. A state model is an abstract state machine that can be in one of various states. The model checker then checks that the state model conforms to certain behavioral properties. For example, the model checker can examine the state model for flaws like grace conditions, exploring all the possible states of your model. 

There are three different phases to performing model checking,

**1** the modeling phase,

**2** the running phase,

**3** and the analysis phase.

The modeling phase comes first. This is where you enter the model description. This will be provided in whatever programming language your system uses. You also describe the desired properties. During the modeling phase, you can perform some Saturday checks. These are quick checks that should be easy to do because they usually come from very clear and simple logic. It's like testing if a light bulb is working by flipping a switch on and off. It's clear to see when the light bulb is malfunctioning. It's beneficial to get rid of these simpler errors before using any model checkers so that you can focus on specifying the more complex properties to check. 

The second phase is the running phase, this is when you run the model checker to see how your model conforms to the desired properties that you've wrote in the modeling phase. 

The last phase is the analysis phase. This is where you check if all the desired properties are satisfied and if any are violated. Violations are called counterexamples. Your model checker will provide descriptions of violations in your system so that you can analyze how it got to that state.

Using the information from the model checker, you advice yourself where to fix any problems, then run through the phases again. You do this until you can be sure that your software is correct with respect to the desired properties.

Model checking is a very useful verification technique, there are many ways to test your system's behaviour, like unit testing, beta testing, and simulations. But model checking can help find errors that these tests can't. If you're looking to use model checkers to develop your programs, there are many different free model checkers available for developers that use different languages. Model checking is now another technique that you can use to make sure that you are not only creating well-designed software, but software that meets desired properties and behavior. Using model checking after you used the designed techniques you've learned in this course, we'll ensure that your software is behaving the way you intended.