# CEVATask
This project is an assessment given by CEVA Logistics as part of the recruitment process for a full stack developer role.
This is the first component of this assessment which assesses the candidate's ability to create a web API that can consume a POST request in the form of a .json file, 
create a directory within the client's file system for that file and store that .json within that directory.

These are the classes I used for this assessment:

```ConfigProperties```
This class is used to read the ``applications.properties`` file to determine the file path where we will create our .json file based off the API requests

``UserController``
This class is the controller class. The controller class has an instance of the ``UserService`` and uses this to handle the ``POST`` request coming in from the client

``UserLogic``
This class handles all the logic required to create the directory, write the file to the file system and handle our ``.json`` object. 

``User``
This is a model class that we use to map our .json to a POJO

``UserService``
The service class allows us to handle the client's request, it communicates with the logic class to execute the ``.json`` file creation within our file system. 

Below is a ``POST`` request sent to our web API which then creates a ``.json`` file in our filesystem based off this request. Based off the default ``applications.properties``, the file will be stored within our main resources folder.

![image](https://user-images.githubusercontent.com/51204670/175796154-78ccc7c4-d099-4f31-a0ee-a033a166fe32.png)
# OUTPUT:
![image](https://user-images.githubusercontent.com/51204670/175797025-aa103989-3ce4-4b98-aa97-5e03767a0d52.png)

# TODO:

- Write unit tests (did not follow TDD in this assessment, but it would be beneficial to do so in the future
- Currently, the outputted ``.json`` file is not ordered. This is due to the way that the ``JSONObject`` class in java is written.
I did some looking around and figured there is a way to preserve the order of the fields using classes such as a ``LinkedHashMap``, 
although this is not part of the scope of the project.
If required, I would love to utilise the strategy design pattern to create different formatters for the outputs file (i.e. ordered outputs, unordered, prettified, etc)


