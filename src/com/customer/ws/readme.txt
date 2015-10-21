
http://mark-kirby.co.uk/2013/creating-a-true-rest-api/


http://restcookbook.com/Basics/hateoas/

https://www.genuitec.com/products/myeclipse/learning-center/ws/rest-web-services-tutorial/

************
http://www.restapitutorial.com
***********


SEVERE: Exception starting Context with name [/restdemo]
org.apache.catalina.LifecycleException: Failed to start component 
[StandardEngine[Catalina].StandardHost[localhost].StandardContext[/restdemo]]


 <url-pattern>/*</url-pattern>
 
http://localhost:8080/restdemo/application.wadl

http://localhost:8080/restdemo/customers


http://www.restapitutorial.com/lessons/httpmethods.html
***POST***
The POST verb is most-often utilized to **create** new resources. 
In particular, it's used to create subordinate resources. 
That is, subordinate to some other (e.g. parent) resource.
 In other words, when creating a new resource, POST to the parent and the service takes care of associating 
 the new resource with the parent, assigning an ID (new resource URI), etc.

On successful creation, return HTTP status 201, returning a Location header with 
a link to the newly-created resource with the 201 HTTP status.

***POST is neither safe nor idempotent. 
It is therefore recommended for non-idempotent resource requests.
Making two identical POST requests will most-likely result in two resources containing the same information.

Examples:
    POST http://www.example.com/customers
    POST http://www.example.com/customers/12345/orders

***PUT***
PUT is most-often utilized for **update** capabilities, PUT-ing to a known resource URI with the request body 
containing the newly-updated representation of the original resource.
However, PUT can also be used to create a resource in the case where 
the resource ID is chosen by the client instead of by the server. 
In other words, if the PUT is to a URI that contains the value of a non-existent resource ID. 
Again, the request body contains a resource representation. Many feel this is convoluted and confusing. 
Consequently, this method of creation should be used sparingly, if at all.

Alternatively, use POST to create new resources and provide the client-defined ID in the body representation—
presumably to a URI that doesn't include the ID of the resource (see POST below).

On successful update, return 200 (or 204 if not returning any content in the body) from a PUT.
If using PUT for create, return HTTP status 201 on successful creation. 
A body in the response is optional—providing one consumes more bandwidth. 
It is not necessary to return a link via a Location header in the creation case 
since the client already set the resource ID.

***PUT is not a safe operation, in that it modifies (or creates) state on the server, but it is idempotent. 
In other words, if you create or update a resource using PUT and then make that same call again, 
the resource is still there and still has the same state as it did with the first call.

If, for instance, calling PUT on a resource increments a counter within the resource, 
the call is no longer idempotent. Sometimes that happens and it may be enough to document that the call is not idempotent. 
However, it's recommended to keep PUT requests idempotent. 
It is strongly recommended to use POST for non-idempotent requests.
Examples:

    PUT http://www.example.com/customers/12345
    PUT http://www.example.com/customers/12345/orders/98765
    PUT http://www.example.com/buckets/secret_stuff

============= 
