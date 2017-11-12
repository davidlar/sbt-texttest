
sbtPlugin := true

organization := "org.texttest"

name := "sbt-texttest"

//publishMavenStyle := false

//bintrayRepository := "sbt-texttest"

//bintrayVcsUrl := Some("http://github.com/emilybache/sbt-texttest")

licenses += ("MIT", url("https://github.com/emilybache/sbt-texttest/blob/master/license.txt"))

libraryDependencies += "commons-io" % "commons-io" % "2.5"

enablePlugins(ReleasePlugin)

crossSbtVersions := Vector("0.13.16", "1.0.3")
