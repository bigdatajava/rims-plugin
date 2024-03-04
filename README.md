# rims-plugin
`RIMS-plugin` is a project that enables workflow approval in IDEA. It is possible to designate workers and set approval nodes.

In IDEA, the ability to view workflow is essential for effective project management. A comprehensive workflow typically includes production issue tracking, testing process, defect tracking, and development process. Production issue tracking allows teams to monitor and address any problems that arise during the production phase. It provides a centralized system to log and track issues, ensuring timely resolution and minimizing disruptions to the project timeline.

This plugin provides the implementation of the aforementioned functionalities.



## Installing

`RIMS-plugin` can be installed directly from the IDE, via **Settings | Plugins | Install plugin from disk... | 🔍 "RIMS"**.



## Building

*Prerequisites: [JDK 8 or higher](http://openjdk.java.net/install/).*

To build RIMS, clone and run the Gradle task [`buildPlugin`](https://github.com/JetBrains/gradle-intellij-plugin#tasks) like so:

- `git clone https://github.com/bigdatajava/rims-plugin && cd rims-plugin`
- For Linux and Mac OS: `./gradlew buildPlugin`
- For Windows: `gradlew.bat buildPlugin`

The build artifact will be placed in `build/distributions/`.

*Miscellaneous: rims-plugin is built using [Gradle](https://gradle.com/) with the [Gradle Kotlin DSL](https://docs.gradle.org/5.1/userguide/kotlin_dsl.html) and the [gradle-intellij-plugin](https://github.com/JetBrains/gradle-intellij-plugin).*



## Contributing

AceJump is supported by community members like you. Contributions are highly welcome!

> For documentation on plugin development, see the [IntelliJ Platform SDK](http://www.jetbrains.org/intellij/sdk/docs/).

## Release notes

Please [see here]([Commits · bigdatajava/rims-plugin (github.com)](https://github.com/bigdatajava/rims-plugin/commits/master/)) for a detailed list of changes.

## Contact me

bigdatajava@163.com



## License

[MIT License](https://github.com/bigdatajava/rims-plugin/blob/master/LICENSE) Copyright (C) `bigdatajava@163.com`



## Thanks

[IntelliJ IDEA](https://www.jetbrains.com/idea/)  is undoubtedly the top-choice IDE for software developers. I switched to using IntelliJ IDEA 3 years ago and have never looked back.It has certainly made my life easier. I am producing more with less effort.
