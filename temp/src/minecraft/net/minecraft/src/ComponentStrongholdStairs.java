// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentStronghold, EnumDoor, StructureBoundingBox, ComponentStrongholdCrossing, 
//            StructureStrongholdPieces, ComponentStrongholdStairs2, StructureComponent, Block, 
//            BlockHalfSlab, World

public class ComponentStrongholdStairs extends ComponentStronghold
{

    private final boolean field_75024_a;
    private final EnumDoor field_75023_b;

    public ComponentStrongholdStairs(int p_i3850_1_, Random p_i3850_2_, int p_i3850_3_, int p_i3850_4_)
    {
        super(p_i3850_1_);
        field_75024_a = true;
        field_74885_f = p_i3850_2_.nextInt(4);
        field_75023_b = EnumDoor.OPENING;
        switch(field_74885_f)
        {
        case 0: // '\0'
        case 2: // '\002'
            field_74887_e = new StructureBoundingBox(p_i3850_3_, 64, p_i3850_4_, (p_i3850_3_ + 5) - 1, 74, (p_i3850_4_ + 5) - 1);
            break;

        default:
            field_74887_e = new StructureBoundingBox(p_i3850_3_, 64, p_i3850_4_, (p_i3850_3_ + 5) - 1, 74, (p_i3850_4_ + 5) - 1);
            break;
        }
    }

    public ComponentStrongholdStairs(int p_i3851_1_, Random p_i3851_2_, StructureBoundingBox p_i3851_3_, int p_i3851_4_)
    {
        super(p_i3851_1_);
        field_75024_a = false;
        field_74885_f = p_i3851_4_;
        field_75023_b = func_74988_a(p_i3851_2_);
        field_74887_e = p_i3851_3_;
    }

    public void func_74861_a(StructureComponent p_74861_1_, List p_74861_2_, Random p_74861_3_)
    {
        if(field_75024_a)
        {
            StructureStrongholdPieces.func_75199_a(net.minecraft.src.ComponentStrongholdCrossing.class);
        }
        func_74986_a((ComponentStrongholdStairs2)p_74861_1_, p_74861_2_, p_74861_3_, 1, 1);
    }

    public static ComponentStrongholdStairs func_75022_a(List p_75022_0_, Random p_75022_1_, int p_75022_2_, int p_75022_3_, int p_75022_4_, int p_75022_5_, int p_75022_6_)
    {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.func_78889_a(p_75022_2_, p_75022_3_, p_75022_4_, -1, -7, 0, 5, 11, 5, p_75022_5_);
        if(!func_74991_a(structureboundingbox) || StructureComponent.func_74883_a(p_75022_0_, structureboundingbox) != null)
        {
            return null;
        } else
        {
            return new ComponentStrongholdStairs(p_75022_6_, p_75022_1_, structureboundingbox, p_75022_5_);
        }
    }

    public boolean func_74875_a(World p_74875_1_, Random p_74875_2_, StructureBoundingBox p_74875_3_)
    {
        if(func_74860_a(p_74875_1_, p_74875_3_))
        {
            return false;
        } else
        {
            func_74882_a(p_74875_1_, p_74875_3_, 0, 0, 0, 4, 10, 4, true, p_74875_2_, StructureStrongholdPieces.func_75197_b());
            func_74990_a(p_74875_1_, p_74875_2_, p_74875_3_, field_75023_b, 1, 7, 0);
            func_74990_a(p_74875_1_, p_74875_2_, p_74875_3_, EnumDoor.OPENING, 1, 1, 4);
            func_74864_a(p_74875_1_, Block.field_72007_bm.field_71990_ca, 0, 2, 6, 1, p_74875_3_);
            func_74864_a(p_74875_1_, Block.field_72007_bm.field_71990_ca, 0, 1, 5, 1, p_74875_3_);
            func_74864_a(p_74875_1_, Block.field_72079_ak.field_71990_ca, 0, 1, 6, 1, p_74875_3_);
            func_74864_a(p_74875_1_, Block.field_72007_bm.field_71990_ca, 0, 1, 5, 2, p_74875_3_);
            func_74864_a(p_74875_1_, Block.field_72007_bm.field_71990_ca, 0, 1, 4, 3, p_74875_3_);
            func_74864_a(p_74875_1_, Block.field_72079_ak.field_71990_ca, 0, 1, 5, 3, p_74875_3_);
            func_74864_a(p_74875_1_, Block.field_72007_bm.field_71990_ca, 0, 2, 4, 3, p_74875_3_);
            func_74864_a(p_74875_1_, Block.field_72007_bm.field_71990_ca, 0, 3, 3, 3, p_74875_3_);
            func_74864_a(p_74875_1_, Block.field_72079_ak.field_71990_ca, 0, 3, 4, 3, p_74875_3_);
            func_74864_a(p_74875_1_, Block.field_72007_bm.field_71990_ca, 0, 3, 3, 2, p_74875_3_);
            func_74864_a(p_74875_1_, Block.field_72007_bm.field_71990_ca, 0, 3, 2, 1, p_74875_3_);
            func_74864_a(p_74875_1_, Block.field_72079_ak.field_71990_ca, 0, 3, 3, 1, p_74875_3_);
            func_74864_a(p_74875_1_, Block.field_72007_bm.field_71990_ca, 0, 2, 2, 1, p_74875_3_);
            func_74864_a(p_74875_1_, Block.field_72007_bm.field_71990_ca, 0, 1, 1, 1, p_74875_3_);
            func_74864_a(p_74875_1_, Block.field_72079_ak.field_71990_ca, 0, 1, 2, 1, p_74875_3_);
            func_74864_a(p_74875_1_, Block.field_72007_bm.field_71990_ca, 0, 1, 1, 2, p_74875_3_);
            func_74864_a(p_74875_1_, Block.field_72079_ak.field_71990_ca, 0, 1, 1, 3, p_74875_3_);
            return true;
        }
    }
}
