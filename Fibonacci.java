package uebung02;

import static pr.MakeItSimple.print;
import static pr.MakeItSimple.println;
import static pr.MakeItSimple.readInt;

public class Fibonacci {
	public static void main(String[] args) {

		println("Gewünschte Länge der Fibonacci Folge: ");

		int laenge = readInt();

		if (laenge > 2) {

			println("\nFibonacci Folge wird berechnet...\n");

			int[] folge = new int[laenge];

			folge[0] = 0;
			folge[1] = 1;

			int i = 2;

			print(folge[0] + ", " + folge[1]);

			while (i < laenge) {
				folge[i] = folge[i - 1] + folge[i - 2];

				print(", " + folge[i]);

				i++;

			}

			println();
			// print("\n");

			i = 0;

			while (i < laenge) {

				if (i + 1 != laenge) {
					print(folge[i] + ", ");
				} else {
					print(folge[i]);
				}

				i++;

			}

			if (laenge > 46) {
				println("\n(Ergebnis ungültig! Int Overflow. Ab Index 47 sind die Werte nicht korrekt!)");
			}
		} else {
			println("\nEingabe ungültig! Nur positive Zahlen > 2.");
		}
	}
}