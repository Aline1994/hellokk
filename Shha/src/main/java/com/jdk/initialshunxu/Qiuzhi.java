package com.jdk.initialshunxu;

public class Qiuzhi {
	
	public static void main(String[] args) { 
		 int[] data = new int[] { 4, 2, 7, 5, 8, 1, 3, 6 }; 
		 System.out.print("��ʼ����\t"); 
		 print(data); 
		 System.out.println(""); 
		  
		 mergeSort(data, 0, data.length - 1); 
		   
		 System.out.print("\n�����: \t"); 
		 print(data); 
		 } 
		  
		 public static void mergeSort(int[] data, int left, int right) { 
		 if (left >= right) 
		  return; 
		 //��·�鲢 
		 // �ҳ��м����� 
		 int center = (left + right) / 2; 
		 System.out.println("center: "+center);
		 // �����������еݹ� 
		 mergeSort(data, left, center); 
		 // ���ұ�������еݹ� 
		 mergeSort(data, center + 1, right); 
		 // �ϲ� 
		 merge(data, left, center, center + 1, right); 
		 System.out.print("������:\t"); 
		 print(data); 
		 } 
		  
		 /** 
		 * ������������й鲢���鲢ǰ��2�����������򣬹鲢����Ȼ���� 
		 * 
		 * @param data 
		 *  ������� 
		 * @param leftStart 
		 *  ������ĵ�һ��Ԫ�ص����� 
		 * @param leftEnd 
		 *  ����������һ��Ԫ�ص����� 
		 * @param rightStart 
		 *  �������һ��Ԫ�ص����� 
		 * @param rightEnd 
		 *  ���������һ��Ԫ�ص����� 
		 */
		 public static void merge(int[] data, int leftStart, int leftEnd, 
		  int rightStart, int rightEnd) { 
		 int i = leftStart; 
		 int j = rightStart; 
		 int k = 0; 
		 // ��ʱ���� 
		 int[] temp = new int[rightEnd - leftStart + 1]; //����һ����ʱ�������������ʱ��������� 
		 // ȷ�Ϸָ������������Ƿ�ȡ�������һ��Ԫ�� 
		 while (i <= leftEnd && j <= rightEnd) { 
		  // ������������ȡ����С�ķ�����ʱ���� 
		  if (data[i] > data[j]) { 
		  temp[k++] = data[j++]; 
		  } else { 
		  temp[k++] = data[i++]; 
		  } 
		 } 
		 // ʣ�ಿ�����η�����ʱ���飨ʵ��������whileֻ��ִ������һ���� 
		 while (i <= leftEnd) { 
		  temp[k++] = data[i++]; 
		 } 
		 while (j <= rightEnd) { 
		  temp[k++] = data[j++]; 
		 } 
		 k = leftStart; 
		 // ����ʱ�����е����ݿ�����ԭ������ // ��ԭleft-right��Χ�����ݱ����ƻ�ԭ���飩 
		 for (int element : temp) { 
		  data[k++] = element; 
		 } 
		 } 
		  
		 public static void print(int[] data) { 
		 for (int i = 0; i < data.length; i++) { 
		  System.out.print(data[i] + "\t"); 
		 } 
		 System.out.println(); 
		 } 
		} 