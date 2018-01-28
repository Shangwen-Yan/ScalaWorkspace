package cn.tedu.spark

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object Demo1 {
  def main(args: Array[String]): Unit = {
    //创建配置对象
    val conf = new SparkConf();
    //设定应用名称
    conf.setAppName("SparkDemo1")
    //设定mater地址
    conf.setMaster("spark://hadoop01:7077")
    //基于conf创建出sc对象
    val sc = new SparkContext(conf);
    
    //执行处理
    val rdd = sc.textFile("/data/words.txt");
    var resultRdd = rdd.flatMap { _.split(" ") }.map((_,1)).reduceByKey(_+_);
    resultRdd.saveAsTextFile("/data/result");
  }
}