package Fibonacci;

public class Fibonacci {
	public static void main(String[] args) {

		System.out.println("Desired length of the Fibonacci sequence: ");

		int length = Integer.parseInt(System.console().readLine());

		if (length > 2) {

			System.out.println("\nFibonacci sequence is calculated...\n");

			int[] folge = new int[length];

			folge[0] = 0;
			folge[1] = 1;

			int i = 2;

			System.out.print(folge[0] + ", " + folge[1]);

			while (i < length) {
				folge[i] = folge[i - 1] + folge[i - 2];

				System.out.print(", " + folge[i]);

				i++;

			}

			System.out.print("\n");

			i = 0;

			while (i < length) {

				if (i + 1 != length) {
					System.out.print(folge[i] + ", ");
				} else {
					System.out.print(folge[i]);
				}

				i++;

			}

			if (length > 46) {
				System.out.println("\n(Result invalid! Int Overflow. From index 47 the values are not correct!)");
			}
		} else {
			System.out.println("\nInput invalid! Only positive numbers > 2.");
		}
	}
}
