package com.bonc.ssha.Spa.prac;

import org.apache.hadoop.conf.Configuration;

public class GetCon {
	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.addResource("../Configuration.xml");
		System.out.println(conf.get("color"));
		System.out.println(conf.get("size"));
		System.out.println(conf.get("weight"));
	}
}
