package Q4;
public class countnumbers {
	
    public static int Countnumbers(int number) {
        if (number == 0) {
            return 1; // If the number is 0, it has one digit
        }
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}