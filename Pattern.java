import java.util.Scanner;

/**
 * Created by saurabh on 12/8/16.
 */
public class Pattern {

    private int totalBoxes;
    private int mazeWidth, mazeHeight;

    Pattern (int blocks)
    {
        totalBoxes = blocks;
    }

    Pattern (int width, int height )
    {
        mazeWidth = width;
        mazeHeight = height;
    }

    public void DrawBox()
    {
        BoxPart1();
        BoxPart2();
        BoxPart2();
        BoxPart1();

        System.out.print("\n");
    }

    public void BoxPart1()
    {
        for(int i=1; i<=totalBoxes; i++)
        {
            System.out.print("+");

            for(int j=1; j<=6; j++)
                System.out.print("-");
        }
        System.out.println("+");
    }

    public void BoxPart2()
    {
        for (int i=1; i<=totalBoxes; i++)
        {
            System.out.print("|");

            for(int j=1; j<=6; j++)
                System.out.print(" ");
        }
        System.out.println("|");
    }

    public void DrawMaze()
    {
        for(int i=1; i<=mazeWidth; i++)
            System.out.print(" __   ");

        System.out.print("\n");

        int flag = 0;

        for(int j=1; j<=mazeHeight*2; j++)
        {
            if(flag == 0)
            {
                for(int k=1; k<mazeWidth; k++)
                    System.out.print("/  \\__");
                System.out.print("/  \\");
                System.out.print("\n");
                flag = 1;
            }
            else
            {
                for(int i=1; i<=mazeWidth; i++)
                    System.out.print("\\__/  ");

                System.out.print("\n");
                flag = 0;
            }

        }
    }

}
