import sbt._
import sbt.Keys._

object LiftProjectBuild extends Build {

  import BuildSettings._

  lazy val root = Project("lift-squeryl-app", file("."))
    .settings(liftAppSettings: _*)
    .settings(libraryDependencies ++=
      Seq(
        "net.liftweb" %% "lift-webkit" % Ver.lift % "compile",
        "net.liftweb" %% "lift-squeryl-record" % Ver.lift % "compile",
        "net.liftmodules" %% ("squerylauth_"+Ver.lift_edition) % "0.1-SNAPSHOT" % "compile",
        "net.liftmodules" %% ("extras_"+Ver.lift_edition) % "0.3" % "compile",
        "org.eclipse.jetty" % "jetty-webapp" % Ver.jetty % "container",
        "ch.qos.logback" % "logback-classic" % "1.0.13" % "compile",
        "org.scalatest" %% "scalatest" % "1.9.2" % "test",
        "com.h2database" % "h2" % "1.3.167"
      )
    )
}
