# owasp-test-project

This is for testing a multi-module app that has a test jar

To check, this can be run like
```
mvn -X -B org.owasp:dependency-check-maven:RELEASE:check org.owasp:dependency-check-maven:RELEASE:aggregate 
  -Dformat=ALL -DskipProvidedScope=true -DautoUpdate=false -DnuspecAnalyzerEnabled=false 
  -DassemblyAnalyzerEnabled=false -DnodeAuditAnalyzerEnabled=false -DnodeAnalyzerEnabled=false 
  -DrubygemsAnalyzerEnabled=false -DbundleAuditAnalyzerEnabled=false 
```