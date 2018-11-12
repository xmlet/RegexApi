[![Maven Central](https://img.shields.io/maven-central/v/com.github.xmlet/regexApi.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22com.github.xmlet%22%20AND%20a:%22regexApi%22)

# RegexApi

<div align="justify"> 
    This library is a Java DSL for the regular expression syntax. This library was created with the help of the <i>xmlet</i>
    infrastructure, using <a href="https://github.com/xmlet/XsdAsmFaster">XsdAsmFaster</a>. The classes generated were based
    in a manually created XML Schema Definition file, i.e. XSD file, which describes the whole regular expression syntax
    directly supported by Java. The names given to each operation were meant to make it easier to read and understand the
    regular expression operations. This library was created in order to simplify the usage and the interpretation of regular 
    expressions.
</div>

## Installation

<div align="justify"> 
    First, in order to include it to your Maven project, simply add this dependency:
    <br />
    <br />
</div>

```xml
<dependency>
    <groupId>com.github.xmlet</groupId>
    <artifactId>regexApi</artifactId>
    <version>1.0.0</version>
</dependency>
``` 

## How does RegexApi works?

<div align="justify"> 
    This Regex DSL contains classes that represent all the regular expressions operations described in the 
    <a href="https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html">Java 8 Pattern class documentation</a>.
    The attributes of the expressions were converted to XSD attributes and the operations were converted to XSD elements.
    This results in the definition of regular expressions as shown in the following code snippet:
</div>

```java
class Example{
    public void testFromFirstUntilLastRegex(){
        String toMatch = "abcd rXsXtXz";
        Regex regex = new Regex(expr -> expr.matchRegex()
                                .fromFirstUntilLast().attrFirst("a").attrLast("d")
                                .or()
                                .fromFirstUntilLast().attrFirst("r").attrLast("z"));
        
        List<String> result = regex.match(toMatch);

        Assert.assertEquals(8, result.size());
        Assert.assertEquals("a", result.get(0));
        Assert.assertEquals("b", result.get(1));
        Assert.assertEquals("c", result.get(2));
        Assert.assertEquals("d", result.get(3));
        Assert.assertEquals("r", result.get(4));
        Assert.assertEquals("s", result.get(5));
        Assert.assertEquals("t", result.get(6));
        Assert.assertEquals("z", result.get(7));
    }
}
```

<div align="justify"> 
    The code presented above was extracted from the <a href="https://github.com/xmlet/Regex">Regex</a> 
    project present in the <a href="https://github.com/xmlet/Regex/blob/master/src/test/java/CharacterClassesTest.java">CharacterClassesTest</a>.
    In this concrete example we define a regular expression that states that will match:
    <br />
    <br />
     <ul>
        <li>
            <i>fromFirstUntilLast().attrFirst("a").attrLast("d")</i> - Any character between <i>a</i> and <i>d</i>.
        </li>
        <li>
            or() - A match occurs either by a match happening in the previous expression <b>or</b> a match in the following expression. 
        </li>
        <li>
            <i>fromFirstUntilLast().attrFirst("r").attrLast("z")</i> - Any character between <i>r</i> and <i>z</i>.
        </li>
     </ul>
     This chaninig of method calls result in the following regular expression:
     <b>[a-d]|[r-z]</b>
</div>