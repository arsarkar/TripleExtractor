# TripleExtractor
Compile with mvn (mvn compile/install/package)

Run jar with arguments `<LANG> <rdf-file-path> <output-file-path>`


vs-code launch:
```
{
    "version": "0.2.0",
    "configurations": [
        {
            "type": "java",
            "name": "Launch App",
            "request": "launch",
            "mainClass": "com.example.App",
            "args": 
            [
                "RDF/XML",
                "src/main/resources/unspsc84-title.rdfs",
                "src/main/resources/unspsc84.txt"
            ],
            "projectName": "demo"
        }
    ]
}
```
For possible LANG options, see [](https://jena.apache.org/documentation/io/rdf-input.html)
