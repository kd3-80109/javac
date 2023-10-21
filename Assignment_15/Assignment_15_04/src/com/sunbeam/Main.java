package com.sunbeam;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) {
		try (FileReader fr = new FileReader(
				"/home/sunbeam/Documents/day15/workspace-sts-3.9.18.RELEASE/Assignment_15_03/Output.txt")) {
			try (BufferedReader br = new BufferedReader(fr)) {
				String line;
				while ((line = br.readLine()) != null) {
					System.out.println(line);
				}
			}
		} catch (Exception e) {

		}

	}

}
