# owasp-test-project

This is for testing a multi-module app that has a test jar

Note: this seems to work okay

To check, this can be run like
```
mvn -X -B org.owasp:dependency-check-maven:6.4.1:check org.owasp:dependency-check-maven:6.4.1:aggregate 
  -Dformat=ALL -DskipProvidedScope=true -DautoUpdate=false -DnuspecAnalyzerEnabled=false 
  -DassemblyAnalyzerEnabled=false -DnodeAuditAnalyzerEnabled=false -DnodeAnalyzerEnabled=false 
  -DrubygemsAnalyzerEnabled=false -DbundleAuditAnalyzerEnabled=false 
```