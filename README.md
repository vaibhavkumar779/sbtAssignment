## Group 1 (Aurora) : Vaibhav Kumar

- Create a module namely, common.
- Add library dependency for json4s-native, slf4j-logger and typesafe-config in that module
- Add test dependency for scalatest and mockito-scala in the same module
- Create another module namely, persistence
- Add library dependency for slick and postgresql database
- Add test dependency for h2 database in the persistence module.
- persistence module should depend on common module.
- add plugins to the project- codesquad-sbt-plugin and scalastyle-sbt-plugin
- Finally add one last module "root" and aggregate all other modules in this root module

scala version : 2.12.15 
java version : openjdk 11.0.11 2021-04-20
sbt version : 1.5.5

I have used Visual Studio Code for running the codes so used the extension Metal Scala
