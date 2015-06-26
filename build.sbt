name := """software-evaluation"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)
lazy val myProject = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs
 // "org.webjars" %% "webjars-play" % "2.3.0-2",
//"org.webjars" % "bootstrap" % "3.3.4",
//"org.webjars.bower" % "angular" % "1.4.0"
)



// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator

