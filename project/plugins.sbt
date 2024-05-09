lazy val zioSbtVersion = "0.4.0-alpha.26"

addSbtPlugin("org.scala-js"                      % "sbt-scalajs"               % "1.16.0")
addSbtPlugin("org.portable-scala"                % "sbt-scalajs-crossproject"  % "1.3.2")
addSbtPlugin("org.scalameta"                     % "sbt-scalafmt"              % "2.5.0")
addSbtPlugin("com.eed3si9n"                      % "sbt-buildinfo"             % "0.11.0")
addSbtPlugin("org.scoverage"                     % "sbt-scoverage"             % "2.0.6")
addSbtPlugin("com.thoughtworks.sbt-api-mappings" % "sbt-api-mappings"          % "3.0.2")
addSbtPlugin("com.github.cb372"                  % "sbt-explicit-dependencies" % "0.2.16")
addSbtPlugin("de.heikoseeberger"                 % "sbt-header"                % "5.9.0")
addSbtPlugin("ch.epfl.scala"                     % "sbt-bloop"                 % "1.5.6")
addSbtPlugin("com.geirsson"                      % "sbt-ci-release"            % "1.5.7")
addSbtPlugin("com.timushev.sbt"                  % "sbt-updates"               % "0.6.3")

addSbtPlugin("dev.zio" % "zio-sbt-website" % zioSbtVersion)
addSbtPlugin("dev.zio" % "zio-sbt-ci"      % zioSbtVersion)
