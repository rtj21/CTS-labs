1. Template
	The template pattern can be mainly found in the TemplateWeatherStation which calls the methods in a specific order.

2. Strategy
	The Strategy pattern consists in choosing the right plan at runtime in InfoWeatherStation with its reference to the interface which can atke any of the derived classes.

3. Observer
	The observer was implemented with push notifications so the CentralWeatherStation has a list of clients which implement the interface Handler that has the method with which to react to the push notification

4. Chain of responsibility
	The essence of the chain of responsibility can be seen in all the classes which do one action then call another entity to handle the situation in their own way

5. Command
	The command pattern can be spotted in the FireDepartment class which has an array with all the commands it needs to execute and which manages those actions to execute asynchronously.

6. State
	The characteristic that makes State stand out is in the way the objects will change their state autonomously depending on the situation at hand (in GridPath the state will be changed if the detectedSmoke attribute is true)