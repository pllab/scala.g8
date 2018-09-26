name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.12.6"

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.12" % "3.0.5" % "test" withSources() withJavadoc(),
  "org.scalacheck" %% "scalacheck" % "1.14.0" % "test" withSources() withJavadoc()
)

initialCommands := "import $organization$.$name;format="lower,word"$._"

