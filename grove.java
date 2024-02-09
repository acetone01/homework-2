public class grove
{
    public tree[] trees;
    public String groveName;
    public int tCount;

    public grove(String groveName, int maxSize)
    {
        this.groveName = groveName;
        this.trees = new tree[maxSize];
        this.tCount = 0;
    }

    public int plantTree(tree tree)
    {
        if (tCount < trees.length)
        {
            trees[tCount] = tree;
            return tCount ++;

        }else {return -1;}
    }

    public tree removeTree(int index)
    {
        if (index >= 0 && index < tCount)
        {
            tree removeTree = trees[index];

            for (int i = index; i < tCount - 1; i++)
            {
                trees[i] = trees[i + 1];
            }
            trees[--tCount] = null;
            return removeTree;
        }else {return null;}
    }

    public String toString()
    {
        return String.valueOf(tCount);
    }
}