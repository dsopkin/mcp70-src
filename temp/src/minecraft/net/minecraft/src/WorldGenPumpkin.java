// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            WorldGenerator, World, Block, BlockGrass

public class WorldGenPumpkin extends WorldGenerator
{

    public WorldGenPumpkin()
    {
    }

    public boolean func_76484_a(World p_76484_1_, Random p_76484_2_, int p_76484_3_, int p_76484_4_, int p_76484_5_)
    {
        for(int i = 0; i < 64; i++)
        {
            int j = (p_76484_3_ + p_76484_2_.nextInt(8)) - p_76484_2_.nextInt(8);
            int k = (p_76484_4_ + p_76484_2_.nextInt(4)) - p_76484_2_.nextInt(4);
            int l = (p_76484_5_ + p_76484_2_.nextInt(8)) - p_76484_2_.nextInt(8);
            if(p_76484_1_.func_72799_c(j, k, l) && p_76484_1_.func_72798_a(j, k - 1, l) == Block.field_71980_u.field_71990_ca && Block.field_72061_ba.func_71930_b(p_76484_1_, j, k, l))
            {
                p_76484_1_.func_72961_c(j, k, l, Block.field_72061_ba.field_71990_ca, p_76484_2_.nextInt(4));
            }
        }

        return true;
    }
}
