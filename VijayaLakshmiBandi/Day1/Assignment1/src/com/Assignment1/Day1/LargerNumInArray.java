package com.Assignment1.Day1;

public class LargerNumInArray {
	public static int getLargerNumber(int arrList[], int numOfElements) {
		int temp;
		for(int i = 0; i < numOfElements; i++) {
			for(int j = i + 1 ; j < numOfElements ; j++) {
				if(arrList[i] > arrList[j]) {
					temp = arrList[i];
					arrList[i] = arrList[j];
					arrList[j] = temp;
				}
			}
		}
		return arrList[numOfElements-1];
	}

	public static void main(String[] args) {
		int arrElements[] = {33,44,5,34,89,90};
		System.out.println("Largest number from an array is "+getLargerNumber(arrElements,arrElements.length));

	}
}
