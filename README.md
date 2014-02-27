# Spring Data Couchbase + Spring Boot Example Application

This is a simple demo application which shows how to use Spring Data Couchbase and Spring Boot together agains the
`beer-sample` couchbase sample dataset.

Make sure to have the following view in place before querying the URIs:

Design Document: "beer", View Name: "all"
```javascript
function (doc, meta) {
  if(doc.type == "beer") {
    emit(doc.name, null);
  }
}
```

Start the application either by deploying it or just running the `example.Boot#main()` method in your IDE. Navigate
the browser to `/beer` to get started. Change the `DatabaseConfig` configuration file according to your environment.