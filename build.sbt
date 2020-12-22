
scalaVersion := "2.12.12"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.2" % "test"

// library name
name := "elfscala"

// library version
version := "0.1"

// groupId, SCM, license information
organization := "io.github.schoeberl"
homepage := Some(url("https://github.com/schoeberl/elf-scala"))
scmInfo := Some(ScmInfo(url("https://github.com/schoeberl/elf-scala"), "git@github.com:schoeberl/elf-scala.git"))
developers := List(Developer("schoeberl", "schoeberl", "martin@jopdesign.com", url("https://github.com/schoeberl")))
licenses += ("BSD-2-Clause", url("https://opensource.org/licenses/BSD-2-Clause"))
publishMavenStyle := true

// disable publishw ith scala version, otherwise artifact name will include scala version 
// e.g cassper_2.11
crossPaths := false

// add sonatype repository settings
// snapshot versions publish to sonatype snapshot repository
// other versions publish to sonatype staging repository
publishTo := Some(
  if (isSnapshot.value)
    Opts.resolver.sonatypeSnapshots
  else
    Opts.resolver.sonatypeStaging
)
