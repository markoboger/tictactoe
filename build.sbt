val scala3Version = "3.2.2"

lazy val root = project
  .in(file("."))
  .settings(
    name := "tictactoe",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.10",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.10" % "test"
  )
