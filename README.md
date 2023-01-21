## :gear: reflecTester
Minimalist implementation of a library for Java unit test execution.

---

### :link: Requirements
- Maven
- Java 17+

---

### :cd: Setup
1- Open a terminal, clone this repository, navigate to the directory of the Java project you want to install, and run:
```
mvn install:install-file \
   -Dfile="/full-path-to-reflectester-clone-directory/reflectester/target/reflectester-1.0-SNAPSHOT.jar" \
   -DgroupId=com.github.foiovituh \
   -DartifactId=reflectester \
   -Dversion=1.0-SNAPSHOT \
   -Dpackaging=jar \
   -DgeneratePom=true
```

---

### :arrow_forward: How to use
1- Map your test class with @TestClass annotation, and test methods with @TestMethod (must be static, return void and have no arguments), for example:
```
@TestClass
public class ShoppingTrolleyTest {
    @TestMethod
    public static void testRequestAnEmployeeToGuardEmptyShoppingTrolleyShouldReturnTrue() {
    	final ShoppingTrolley shoppingTrolley = new ShoppingTrolley();
    	
    	final String testName = "testRequestAnEmployeeToGuardEmptyShoppingTrolleyShouldReturnTrue";
        final String testResult = shoppingTrolley.guardShoppingTrolley()
        		&& Assertor.checkIfCollectionAreNullOrEmpty(shoppingTrolley.getItems())
        			? "pass"
        			: "failed";
        
        System.out.println(testName + " => " + testResult);
    }
}
```
<br>

2- Instantiate a ReflecTester with any test classes name and call the run() method to execute all the defined tests:
```
public class ShoppingTrolleyTestExecutor {
    public static void main(String[] args) {
        final ReflecTester shoppingTrolleyTests = new ReflecTester(
                ShoppingTrolleyTest.class.getName()
        );
        
        shoppingTrolleyTests.run();
    }
}
```
---

### :busts_in_silhouette: Do you want help me?

If you have any ideas or wish to contribute to the project, contact me on Twitter @vituohto or send me a pull request! :)

---

### :white_flag: License
```
MIT License

Copyright (c) 2023 @vituohto

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
