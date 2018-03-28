package com.bonc.ssha.Spa.prac;

import java.util.Arrays;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.FlatMapFunction;
import org.apache.spark.api.java.function.Function2;
import org.apache.spark.api.java.function.PairFunction;

import scala.Tuple2;

public class CreateRDD {
	public static void main(String[] args) {
		SparkConf conf = new SparkConf().setAppName("Spexample");
        JavaSparkContext sc = new JavaSparkContext(conf);
        JavaRDD<String>input = sc.textFile("/opt/beh/hello.txt");
        JavaRDD<String>word = input.flatMap(new FlatMapFunction<String, String>() {
            public Iterable<String> call(String s) throws Exception {
                return Arrays.asList(s.split(" "));
            }
        });
        JavaPairRDD<String,Integer> counts = word.mapToPair(new PairFunction<String, String, Integer>() {
            public Tuple2<String, Integer> call(String s) throws Exception {
                return new Tuple2(s,1);
            }
        }).reduceByKey(new Function2<Integer, Integer, Integer>() {
            public Integer call(Integer x, Integer y) throws Exception {
                return x+y;
            }
        });
        counts.saveAsTextFile("/opt/beh/output.txt");
		
	}
}
