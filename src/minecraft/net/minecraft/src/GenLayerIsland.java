package net.minecraft.src;

public class GenLayerIsland extends GenLayer
{
    public GenLayerIsland(long par1)
    {
        super(par1);
    }

    /**
     * Returns a list of integer values generated by this layer. These may be interpreted as temperatures, rainfall
     * amounts, or biomeList[] indices based on the particular GenLayer subclass.
     */
    public int[] getInts(int par1, int par2, int par3, int par4)
    {
        int ai[] = IntCache.getIntCache(par3 * par4);

        for (int i = 0; i < par4; i++)
        {
            for (int j = 0; j < par3; j++)
            {
                initChunkSeed(par1 + j, par2 + i);
                ai[j + i * par3] = nextInt(10) != 0 ? 0 : 1;
            }
        }

        if (par1 > -par3 && par1 <= 0 && par2 > -par4 && par2 <= 0)
        {
            ai[-par1 + -par2 * par3] = 1;
        }

        return ai;
    }
}
