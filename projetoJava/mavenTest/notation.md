Comandos Maven

### Criar um projeto novo
```bash
mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.5 -DinteractiveMode=false
```

### Buildar um projeto
```bash
mvn package
```

### Testar o executavel do projeto
```bash
java -cp target/my-app-1.0-SNAPSHOT.jar com.rangers.app.App
```

### Limpar dependencias
```
mvn clean dependency:copy-dependencies package
```


### Links úteis (para mim mesmo)
https://projectlombok.org/features/
https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html
https://www.youtube.com/watch?v=xmxmfpBE6F8
https://sdkman.io/install/