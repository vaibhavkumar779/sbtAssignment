name := "hello"
version := "1.0"
scalaVersion := "2.12.15"

lazy val common = project.in(file("common"))
    .settings(
        libraryDependencies ++= Seq("org.json4s" %% "json4s-native" % "4.0.3",
                                    "org.slf4j" % "slf4j-log4j12" % "1.7.32",
                                    "puppetlabs" % "typesafe-config" % "0.2.0",
                                    "org.typelevel" %% "discipline-scalatest" % "2.1.5" % Test,
                                    "org.mockito" %% "mockito-scala" % "1.16.46" % Test)
    )


lazy val persistence = project.in(file("persistence"))
    .settings(
        libraryDependencies ++= Seq("com.typesafe.slick" %% "slick" % "3.3.3",
                                    "org.postgresql" % "postgresql" % "42.3.1",
                                    "com.h2database" % "h2" % "1.4.200" % Test)
    ).dependsOn(common)

lazy val root = project.in(file(".")).aggregate(common,persistence)