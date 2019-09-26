🚀 TDD-kata-setup [![Actions Status](https://github.com/christian-draeger/kata-setup/workflows/master/badge.svg)](https://github.com/christian-draeger/kata-setup/actions)
=================

This is a template project with some ready to use testing setup to quick start TDD kata sessions...

![hacken](hacken.gif)

[Kata](https://en.wikipedia.org/wiki/Karate_kata) (Japanese: 形, or more traditionally, 型; lit. “form”) is a Japanese word describing detailed patterns of movements practiced either solo or in pairs.[1] Karate kata are executed as a specified series of a variety of moves, with stepping and turning, while attempting to maintain perfect form.
Traditionally, kata are taught in stages. Previously learned kata are repeated to show better technique or power as a student acquires knowledge and experience. It is common for students testing to repeat every kata they have learned but at an improved level of quality. As an reference to this practices you can train yourself doing [Test-Driven-Development](https://martinfowler.com/bliki/TestDrivenDevelopment.html) in a Karate Katas fashion.

This project includes working setups and examples for:
* __[Kotlin](https://kotlinlang.org/docs/reference/)__ with:
    * [KotlinTest](https://github.com/kotlintest/kotlintest/blob/master/doc/reference.md)
    * [JUnit5](https://junit.org/junit5/docs/current/user-guide/)
    * [Spek](https://www.spekframework.org/)
    * and assertion libraries like:
        * [Strikt](https://strikt.io/)
        * [AssertK](https://github.com/willowtreeapps/assertk)
* __[Java](https://docs.oracle.com/javase/specs/jls/se8/html/index.html)__ with:
    * [JUnit5](https://junit.org/junit5/docs/current/user-guide/)
    * and assertion libraries like:
        * [AssertJ](https://joel-costigliola.github.io/assertj/)
        * [Hamcrest](http://hamcrest.org/JavaHamcrest/)
* __[Groovy](https://groovy-lang.org/documentation.html)__ with:
    * [Spock](http://spockframework.org/spock/docs/1.3/all_in_one.html)
    * [JUnit5](https://junit.org/junit5/docs/current/user-guide/)
* __[Javascript](https://developer.mozilla.org/en-US/docs/Web/JavaScript)__ including support for _[TypeScript](https://www.typescriptlang.org/docs/home.html)_, _ES6_ and _ES5_ with:
    * [Jest](https://jestjs.io/docs/en/getting-started)

___

### Prerequisites

* JDK >= 8 installed

___

### 👨‍🍳 How-To:

#### 📁 get the project
There are multiple ways to get the setup running on your mashine.
You can **_either:_**
* use the **[Template](https://github.com/christian-draeger/kata-setup/generate)** if you want to create a completely new repository

    **_or_**

* **Fork** the project

    **_or_**

* **[download](https://github.com/christian-draeger/kata-setup/archive/master.zip)** it as Zip file.

#### 💫 Run all tests

    ./gradlew check
    

#### 📰 Choose a Kata
[Pick a Kata](/Katas) you want to master and start TDD'ing ♻️

___

#### 👌 Recommended

* [gdub](https://github.com/dougborg/gdub) installed
    * ℹ️ gdub (`gw` on the command line) invokes `./gradlew` on projects where a gradle wrapper is configured, and falls back to use the gradle from the $PATH if a wrapper is not available.
 
___

#### 🔧 Troubleshooting

##### ☕️ install JDK11 via [sdkman](https://sdkman.io/):
```bash
$ curl -s "https://get.sdkman.io" | bash
$ source "$HOME/.sdkman/bin/sdkman-init.sh"
$ sdk i java 11.0.4.hs-adpt
```


##### 🚧 using intelliJ and modern JS derivatives (fix syntax highlighting for ES6 and TS):

1. open Intellij preferences (on mac `⌘,`)
1. goto `Languages & Frameworks`
1. choose `JavaScript`
1. select JavaScript language version: `ECMAScript 6`

___

### 🤝 Contributions Welcome
If you're having some nice Katas or further ideas regarding the template/test setup feel free to send pull requests :neckbeard:
