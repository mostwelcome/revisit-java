package com.psl.demo1;

public class Number {
	int firstNumber;
	int secondNumber;
	double result;

	public Number(int fn, int sn) {
		firstNumber = fn;
		secondNumber = sn;
	}

	double sum() {
		result = firstNumber + secondNumber;
		return result;
	}

	double sub() {
		result = firstNumber - secondNumber;
		return result;
	}

	double mul() {
		result = firstNumber * secondNumber;
		return result;
	}

	double div() {
		try {
			if (secondNumber <= 0) {
				throw new DevideByZeroException("Second Number canot be zero");
			} else {
				result = firstNumber / secondNumber;
				return result;
			}
		} catch (DevideByZeroException e) {
			System.out.println(e);
		}
		return result;
	}
}
