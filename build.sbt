name := "sbt-scoverage"

organization := "com.sksamuel.scoverage"

version := "0.95.9-pagero"

scalaVersion := "2.10.3"

scalacOptions := Seq("-unchecked", "-deprecation", "-feature", "-encoding", "utf8")

sbtPlugin := true

libraryDependencies ++= Seq(
  "com.sksamuel.scoverage" %% "scalac-scoverage-plugin" % "0.95.9"
)

publishTo := Some(Resolver.url("Pagero releases",
  new URL("http://pogit/nexus/content/repositories/releases"))(Resolver.ivyStylePatterns))

publishMavenStyle := false

publishArtifact in Test := false

licenses +=("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0.html"))
