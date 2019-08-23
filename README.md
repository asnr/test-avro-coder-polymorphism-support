Quick prototype to debug a Avro coder/decoder issue in Apache Beam.

Based off the scaffolding

```
$ mvn archetype:generate -DarchetypeGroupId=org.apache.beam -DarchetypeArtifactId=beam-sdks-java-maven-archetypes-starter -DarchetypeVersion=2.13.0 -DgroupId=com.getcruise -Dversion="0.1" -Dpackage=org.apache.beam.starter -DinteractiveMode=false -DartifactId=test-avro-coder-polymorphism-support

```

Run the Beam pipeline locally with

```
$ mvn compile exec:java -Dexec.mainClass=org.apache.beam.starter.StarterPipeline
```

and the toy code/decode program with

```
$ mvn compile exec:java -Dexec.mainClass=org.apache.beam.starter.TryCodeDecode
```
