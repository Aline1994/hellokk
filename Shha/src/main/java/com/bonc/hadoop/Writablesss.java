package com.bonc.hadoop;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.io.WritableUtils;

public class Writablesss implements Writable{
	
	String name;
	int age;

	public void write(DataOutput out) throws IOException {
		// TODO Auto-generated method stub
		WritableUtils.writeString(out, name);
		out.writeInt(age);
	}

	public void readFields(DataInput in) throws IOException {
		// TODO Auto-generated method stub
		name = WritableUtils.readString(in);
		age = in.readInt();
	}
	public static void main(String[] args) {
		Text t = new Text("hadoop");
		System.out.println(t.getLength());
		System.out.println(t.getBytes().length);
		System.out.println(t.find("do"));
		System.out.println(t.find("o"));
		ByteBuffer buf = ByteBuffer.wrap(t.getBytes(),0,t.getLength());
		int cp;
		while(buf.hasRemaining()&&(cp = Text.bytesToCodePoint(buf))==-1){
			System.out.println(Integer.toHexString(cp));
		}
	}
}
