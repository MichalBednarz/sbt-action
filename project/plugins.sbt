val contextBuddyVersion = "0.2.1-M45-5cef06ae"
resolvers +=  Resolver.url(
  "contextbuddy-snapshots",
  new URL(s"https://contextbuddy.s3.eu-central-1.amazonaws.com/snapshots/$contextBuddyVersion")
)(Resolver.ivyStylePatterns)

addSbtPlugin("com.virtuslab.contextbuddy" %% "sbtplugin" % contextBuddyVersion)
