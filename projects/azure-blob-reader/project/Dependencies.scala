import sbt._

object Dependencies {
  val sparkVersion = "3.3.0"
  val hadoopVersion = "3.3.1"
  val azureIdentityVersion = "1.4.5"

  val sparkCore = "org.apache.spark" %% "spark-core" % sparkVersion % "provided"
  val sparkSQL = "org.apache.spark" %% "spark-sql" % sparkVersion % "provided"
  val hadoopAzure = "org.apache.hadoop" % "hadoop-azure" % hadoopVersion
  val azureIdentity = "com.azure" % "azure-identity" % azureIdentityVersion
  lazy val munit = "org.scalameta" %% "munit" % "0.7.29"
}
