Compile / guardrailTasks := List(
  ScalaServer(file("petstore.yaml"), pkg="foo", modules=List("pekko-http", "circe")),
)

val pekkoVersion      = "1.0.0"
val pekkoHttpVersion  = "1.0.0"
val catsVersion       = "2.6.1"
val circeVersion      = "0.14.1"
val scalatestVersion  = "3.2.9"
val jaxbApiVersion    = "2.3.1"

scalacOptions ++= Seq("-Ypartial-unification", "-deprecation")

libraryDependencies += "org.slf4j" % "slf4j-simple" % "1.7.30"

libraryDependencies ++= Seq(
  "org.apache.pekko"  %% "pekko-http"          % pekkoHttpVersion,
  "org.apache.pekko"  %% "pekko-http-testkit"  % pekkoHttpVersion,
  "org.apache.pekko"  %% "pekko-stream"        % pekkoVersion,
  "org.apache.pekko"  %% "pekko-testkit"       % pekkoVersion,
  "io.circe"          %% "circe-core"          % circeVersion,
  "io.circe"          %% "circe-generic"       % circeVersion,
  "io.circe"          %% "circe-parser"        % circeVersion,
  "javax.xml.bind"    %  "jaxb-api"            % jaxbApiVersion,
  "org.scalatest"     %% "scalatest"           % scalatestVersion % Test,
  "org.typelevel"     %% "cats-core"           % catsVersion,
)
