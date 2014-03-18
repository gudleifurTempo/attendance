name := "attendance"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaCore,
  javaJpa,
  "com.atlassian.connect" % "ac-play-java_2.10" % "0.7.0-BETA10" withSources(),
  javaJdbc,
  javaEbean,
  cache
)     

play.Project.playJavaSettings

resolvers += "Atlassian's Maven Public Repository" at "https://maven.atlassian.com/content/groups/public"

resolvers += "Local Maven Repository" at "file://Users/gudleifurkristjansson/.m2/repository"
