package com.yuhang.rdd.operator.transform

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}
/*
    sortBy  该操作用于排序数据。在排序之前，可以将数据通过 f 函数进行处理，之后按照 f 函数处理
的结果进行排序，默认为升序排列。排序后新产生的 RDD 的分区数与原 RDD 的分区数一
致。 中间存在 shuffle 的过程
 */
object Spark12_RDD_Operator_Transform {

    def main(args: Array[String]): Unit = {

        val sparkConf = new SparkConf().setMaster("local[*]").setAppName("Operator")
        val sc = new SparkContext(sparkConf)

        // TODO 算子 - sortBy
        val rdd = sc.makeRDD(List(6,2,4,5,3,1), 2)

        val newRDD: RDD[Int] = rdd.sortBy(num=>num)

        newRDD.saveAsTextFile("output")

        sc.stop()

    }
}
