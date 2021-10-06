addSbtPlugin("com.eed3si9n" % "sbt-projectmatrix" % "0.8.0")

val sbtSoftwareMillVersion = "2.0.8"
addSbtPlugin("com.softwaremill.sbt-softwaremill" % "sbt-softwaremill-common" % sbtSoftwareMillVersion)
addSbtPlugin("com.softwaremill.sbt-softwaremill" % "sbt-softwaremill-publish" % sbtSoftwareMillVersion)

addSbtPlugin("org.jetbrains.scala" % "sbt-ide-settings" % "1.1.1")
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.7.0")
addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "1.0.0")
