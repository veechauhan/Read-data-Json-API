name := """API-SOLUTION-IN-PLAY"""
organization := "solution"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.10"

libraryDependencies += guice
libraryDependencies ++= Seq(
  ws,
  "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test,
  "io.spray" %% "spray-json" % "1.3.6"
)
