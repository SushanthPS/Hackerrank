import java.util.*;
public class linkedList
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++)
            list.add(scan.nextInt());

        int query = scan.nextInt();
        while (query-- > 0)
        {
            switch (scan.next())
            {
                case "Insert" -> list.add(scan.nextInt(), scan.nextInt());
                case "Delete" -> list.remove(scan.nextInt());
            }
        }
        for(int num:list)
            System.out.print(num+" ");

    }

}
