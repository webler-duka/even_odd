package hu.webler;

import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		System.out.println("Sorold a számokat (szóközzel elválasztva): ");
		
		Scanner in = new Scanner(System.in);
		EvenOdd handler = new EvenOdd(Stream.of(in.nextLine().split(" ")).map(Integer::valueOf).toArray(Integer[]::new));
		
		System.out.printf("páros: %d\n", handler.even);
		System.out.printf("páratlan: %d\n", handler.odd);
		
		in.close();
	}
}
