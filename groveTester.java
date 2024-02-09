public class groveTester
{
    public static void main(String[] args)
    {
        grove grove1 = new grove("grove 1", 22);
        System.out.println(grove1);
        //Expected Output: 0

        for (int i = 0; i < 7; i++)
        {
            tree spruceTree = new tree(i + 1, 33, "spruce");
            grove1.plantTree(spruceTree);
        }

        System.out.println(grove1);
        //Expected Output: 7

        grove1.removeTree(3);
        grove1.removeTree(5);

        System.out.println(grove1);
        //Expected Output: 5

        tree mapleTree = new tree(8, 17, "maple");
        grove1.plantTree(mapleTree);

        System.out.println(grove1);
        //Expected Output: 6
    }
    
}