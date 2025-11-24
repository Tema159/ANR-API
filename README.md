# Dependency

### plugin.yml
```yaml
depend:
  - ANR
```

### paper-plugin.yml
```yaml
dependencies:
  server:
    ANR:
      required: true
```

Add the repository with the dependency to your build file from [this link](https://jitpack.io/#Tema159/ANR-API/v1.1.0e)

# Usage

```java
Api anrApi = Anr.get();
```
