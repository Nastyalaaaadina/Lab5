import java.util.Scanner;

public class Lab5 {public static void main(String args[]){
    int n = 0; //length of array
    int [] arr = new int[100]; //array of Integer numbers
    Scanner scan = new Scanner(System.in);
    String input = "";
    System.out.println("Hello! Print your number here (one string - one number, in the end type 'quit'):");
    while(!input.equals("quit"))
    {
        input = scan.next();
        if(!input.equals("quit")) {
            arr[n] = Integer.parseInt(input);
            n++;
        }
    }
    System.out.print("Type number to delete: ");
    int x;
    input = scan.next();
    x = Integer.parseInt(input);

    System.out.print("Before deleting number " + x + ": ");
    for(int i = 0; i < n; i++)
        System.out.print(arr[i] + " ");
    int [] newArr = new int[100];
    int newN = 0;
    for(int i = 0; i < n; i++)
    {
        if (!(arr[i] == x))
        {
            newArr[newN] = arr[i];
            newN++;
        }
    }

    System.out.print("\nAfter deleting: ");
    for(int i = 0; i < newN; i++)
    {
        System.out.print(newArr[i] + " ");
    }
}
}
