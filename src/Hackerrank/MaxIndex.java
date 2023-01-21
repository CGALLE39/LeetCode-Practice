package Hackerrank;

public class MaxIndex {

    static void maximumIndex(int steps, int badIndex)
    {
        int i = 0, j = 1;
        int count = 0;
        int sum = steps * (steps + 1) / 2;
        boolean flag = false;

        while (count < steps)
        {
            i += j;
            j++;
            count++;

            if (i == badIndex)
            {
                flag = true;
                break;
            }
        }
        if (!flag == true)
        {
            System.out.print(sum);
        }
        else
        {
            System.out.print(sum - 1);
        }
    }

    //test
    public static void main (String[] args)
    {
        int steps = 2, badIndex = 4;
        maximumIndex(steps, badIndex);
    }
}

