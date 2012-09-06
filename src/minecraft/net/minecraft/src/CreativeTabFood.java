package net.minecraft.src;

final class CreativeTabFood extends CreativeTabs
{
    CreativeTabFood(int par1, String par2Str)
    {
        super(par1, par2Str);
    }

    public int getRepresentativeItemIndex()
    {
        return Item.appleRed.shiftedIndex;
    }
}
