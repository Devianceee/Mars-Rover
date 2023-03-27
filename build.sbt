import sbt.Keys.libraryDependencies

ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

val CatsVersion       = "2.7.0"
val CatsEffectVersion = "3.3.12"
val ScalatestVersion  = "3.2.12"

val mainDependencies = Seq(
  "org.typelevel" %% "cats-core" % CatsVersion,
  "org.typelevel" %% "cats-effect" % CatsEffectVersion,
  "org.scalactic" %% "scalactic" % ScalatestVersion,
  "com.github.pureconfig" %% "pureconfig" % "0.17.2"
)

val testDependencies = Seq(
  "org.scalatest" %% "scalatest" % ScalatestVersion % "test"
)

lazy val root = (project in file("."))
  .settings(
    name := "mars-rover",
    libraryDependencies ++= mainDependencies ++ testDependencies,
    idePackagePrefix := Some("org.itv.marsrover")
  )
