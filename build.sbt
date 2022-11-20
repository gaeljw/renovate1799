val jdkVersion = "11"

lazy val root = (project in file("."))

name := "renovate1799"

scalaVersion := "2.13.10"

scalacOptions += s"-target:$jdkVersion"

val kafkaVersion = "2.8.1"

libraryDependencies ++= Seq(
  "org.apache.kafka" % "kafka-clients" % kafkaVersion,
  "io.github.embeddedkafka" %% "embedded-kafka" % kafkaVersion % Test,
)
