package hu.webler;

import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
	/*
		A program bemenetként egy sorban egesz szamokat var, szokozzel levalasztva.
		Megszamolja, hogy a megadott szamok kozott hany paros es hany paratlan van. Az eredmenyt kiirja.
	*/
	public static void main(String[] args) {
		System.out.println("Sorold a szamokat (szokozzel elvalasztva): ");

		Scanner in = new Scanner(System.in);
		EvenOdd handler = new EvenOdd(Stream.of(in.nextLine().split(" ")).map(Integer::valueOf).toArray(Integer[]::new));

		System.out.printf("paros: %d\n", handler.even);
		System.out.printf("paratlan: %d\n", handler.odd);

		in.close();
	}
}
