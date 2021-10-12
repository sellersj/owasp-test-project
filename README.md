# owasp-test-project

This is for testing a multi-module app that has a test jar

This seems to fail when a module depends on another for both it's regular source as well as it's test jar.

Example command to check if it will work
```
mvn -X -B org.owasp:dependency-check-maven:6.4.1:check org.owasp:dependency-check-maven:6.4.1:aggregate 
  -Dformat=ALL -DskipProvidedScope=true -DautoUpdate=false -DnuspecAnalyzerEnabled=false 
  -DassemblyAnalyzerEnabled=false -DnodeAuditAnalyzerEnabled=false -DnodeAnalyzerEnabled=false 
  -DrubygemsAnalyzerEnabled=false -DbundleAuditAnalyzerEnabled=false 
```