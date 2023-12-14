addSbtPlugin("dev.guardrail" % "sbt-guardrail" % "1.0.0-SNAPSHOT")

libraryDependencies ++= Seq(
  "dev.guardrail" %% "guardrail-scala-pekko-http" % "0.1.0-SNAPSHOT",
  "dev.guardrail" %% "guardrail-core" % "1.0.0-SNAPSHOT",
  "dev.guardrail" %% "guardrail-scala-support" % "1.0.0-SNAPSHOT",
)

resolvers += "Sonatype OSS Snapshots" at "https://s01.oss.sonatype.org/content/repositories/snapshots"
