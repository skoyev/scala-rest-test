import sbt._

object ApplicationBuild extends Build {

  val appName         = "scala-rest-test"
  val appVersion      = "0.1"

  val appDependencies = Seq(
    "org.reactivemongo" %% "play2-reactivemongo" % "0.10.2"
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here
  )
}
