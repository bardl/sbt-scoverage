resolvers += Resolver.url(
  "bintray-sbt-plugin-releases",
  url("http://dl.bintray.com/content/sbt/sbt-plugin-releases"))

addSbtPlugin("me.lessis" % "bintray-sbt" % "0.1.1")