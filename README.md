<h1>DDD Microservice Archetype</h1>

<h2>Install</h2>
Go to target/generated-sources/archetype and execute the following command "mvn install -X"
This will generate the .m2 archetype.

Now you can run the following command, in the folder where you want to create your project: <b>mvn archetype:generate -DarchetypeCatalog=local</b>

<b>Choose the archetype</b> -> <i>1: local -> com.keyrus:ddd-microservice-archetype (ddd-microservice-archetype)</i>
<br>And follow with the value for each parameter requested by the archetype
<br> Or execute this command -> 
<div><i>mvn archetype:generate \
-DarchetypeGroupId=io.moyada \
-DarchetypeArtifactId=domain-driven-design-archetype \
-DarchetypeVersion=1.0-SNAPSHOT</i></div>

<h2>Structure</h2>

