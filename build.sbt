name := "DSD-WebServices"

version :="0.1.0-SNAPSHOT"

val cxfVersion: String = "3.1.4"

libraryDependencies ++= Seq(
  "org.apache.cxf" % "cxf-rt-bindings-soap" % cxfVersion
  ,"org.springframework" % "spring-context" % "4.1.6.RELEASE"
  ,"org.apache.cxf" % "cxf-rt-frontend-jaxws" % cxfVersion
  ,"org.apache.cxf" % "cxf-rt-transports-http" % cxfVersion
//,"eu.sipria.play" % "play-guice-cxf_play26_2.12" % "1.6.0"
  , "eu.imind.play" % "play-cxf_play24_2.10" % "1.2.1"
)


lazy val root = (project in file(".")).enablePlugins(PlayJava)