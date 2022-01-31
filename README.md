#Logger assignment

## Task:
Give an input file which is a log file contains lines of log entries as shown below. This log file contains lines of log entries where a single line denotes either the start or finish of an event. The type of log can be APPLICATION_LOG which tells that the log is produced by Application Server. The task is to read this file and create events.

#### Example contents of logfile.txt:

    {"id":"scsmbstgra", "state":"STARTED", "type":"APPLICATION_LOG", "host":"12345", "timestamp":1491377495212}
    {"id":"scsmbstgrb", "state":"STARTED", "timestamp":1491377495213}
    {"id":"scsmbstgrc", "state":"FINISHED", "timestamp":1491377495218}
    {"id":"scsmbstgra", "state":"FINISHED", "type":"APPLICATION_LOG", "host":"12345", "timestamp":1491377495217}
    {"id":"scsmbstgrc", "state":"STARTED", "timestamp":1491377495210}
    {"id":"scsmbstgrb", "state":"FINISHED", "timestamp":1491377495216}

After reading the above file, an event with id "scsmbstgra" can be created. Along with this, the duration of the event is to be stored. Duration can be calculated by taking the difference of the log entries(Finished log timestamp - Started log timestamp). If the duration is more than 4ms, then assign an alert to this event. For the event with id "scsmbstgra", the duration will be 1491377495217 - 1491377495212 = 5ms. The alert for this event would be set as true. Other variables such as type and host if application must be stored in an event. This event must be stored in a HSQLDB.

## Running the application
This is a maven project. 

#### For running test and building a jar
    mvn clean install
    
#### For running the application
    java -jar /jarLocation /LogFileLocation
    
The command must look like this:

    java -jar target/org.cs-0.0.1-SNAPSHOT.jar /home/harshita/eclipse-workspace/csLogger/src/main/java/com/harshita/cs/logfile.txt

