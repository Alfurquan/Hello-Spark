import org.apache.spark.sql.SparkSession

object Main extends App {
  val spark = SparkSession.builder()
      .appName("Simple Spark App")
      .master("local[*]")
      .getOrCreate()

    val data = Seq(("Alice", 30), ("Bob", 25), ("Cathy", 35))
    val df = spark.createDataFrame(data).toDF("Name", "Age")
    df.show()
}