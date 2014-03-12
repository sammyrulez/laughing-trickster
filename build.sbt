import com.typesafe.sbt.SbtStartScript

name :="laughing-trickster"

version := "1.0"

scalaVersion := "2.10.1"

resolvers += "twitter-repo" at "http://maven.twttr.com"

seq(SbtStartScript.startScriptForClassesSettings: _*)

libraryDependencies += "com.twitter" %% "finagle-http" % "6.2.0"

libraryDependencies += "org.codehaus.jackson" % "jackson-core-asl" % "1.9.13"

libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.0.M8"

libraryDependencies += "org.specs2" % "specs2_2.10" % "1.13"





