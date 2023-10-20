package Assignment_14_05;
import java.util.*;
public class Main {
	static <T> int countIf(T[] arr , T key , Check<T> c) {
		int count = 0;
		for (T element : arr)
		{
			if (c.Compare(element, key))
			{
				count++;
			}
		}return count;

	}

	public static void main(String[] args) {
		Double[] arr = { 44.45, 77.56, 99.62, 22.35, 55.10, 44.45 };
		Double key = 55.56;

		int cnt = countIf(arr, key, (x, y) -> x > y);
		System.out.println("Count = " + cnt);
	}

	}


