addSbtPlugin("com.geirsson"      % "sbt-scalafmt" % "0.6.6")
addSbtPlugin("com.typesafe.sbt"  % "sbt-git"      % "0.9.2")
addSbtPlugin("de.heikoseeberger" % "sbt-header"   % "2.0.0")
addSbtPlugin("me.lessis"         % "bintray-sbt"  % "0.3.0")

libraryDependencies += "org.scala-sbt" % "scripted-plugin" % sbtVersion.value
