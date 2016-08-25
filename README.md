## `S`imple `L`ogging

#### How to use:

```java
S.L("test");
```
result in console: `D/DBG: test`

```java
S.L("w:%s, h:%s", width, height);
```
result in console: `D/DBG: w:-2147482880, h:-2147482624`

```java
S.L(this, "test");
```
result in console: `D/DBG: test` and **Toast** with text: `test`

#### How to add:
Add repository link in project's `build.gradle`:
```groovy
allprojects {
    repositories {
        ...
        maven {url "https://jitpack.io"}
    }
}
```
Add dependency in module's `build.gradle`:
```groovy
dependencies {
    ...
    compile 'com.github.rexee:s:1.0'
}
```
