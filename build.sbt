name := "blaze-client-post-error"

version := "1.0"

scalaVersion := "2.12.2"

val http4sVersion = "0.17.0-M2"

libraryDependencies ++= Seq(
  "org.http4s" %% "http4s-dsl" % http4sVersion,
  "org.http4s" %% "http4s-blaze-server" % http4sVersion,
  "org.http4s" %% "http4s-blaze-client" % http4sVersion
)