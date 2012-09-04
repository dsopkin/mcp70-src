// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.minecraft.client.Minecraft;

// Referenced classes of package net.minecraft.src:
//            TextureFX, Item, WorldClient, ChunkCoordinates, 
//            EntityClientPlayerMP, WorldProvider

public class TextureCompassFX extends TextureFX
{

    private Minecraft field_76865_g;
    private int field_76867_h[];
    private double field_76868_i;
    private double field_76866_j;

    public TextureCompassFX(Minecraft p_i3212_1_)
    {
        super(Item.field_77750_aQ.func_77617_a(0));
        field_76867_h = new int[256];
        field_76865_g = p_i3212_1_;
        field_76847_f = 1;
        try
        {
            BufferedImage bufferedimage = ImageIO.read((net.minecraft.client.Minecraft.class).getResource("/gui/items.png"));
            int i = (field_76850_b % 16) * 16;
            int j = (field_76850_b / 16) * 16;
            bufferedimage.getRGB(i, j, 16, 16, field_76867_h, 0, 16);
        }
        catch(IOException ioexception)
        {
            ioexception.printStackTrace();
        }
    }

    public void func_76846_a()
    {
        for(int i = 0; i < 256; i++)
        {
            int j = field_76867_h[i] >> 24 & 0xff;
            int k = field_76867_h[i] >> 16 & 0xff;
            int l = field_76867_h[i] >> 8 & 0xff;
            int i1 = field_76867_h[i] >> 0 & 0xff;
            if(field_76851_c)
            {
                int j1 = (k * 30 + l * 59 + i1 * 11) / 100;
                int k1 = (k * 30 + l * 70) / 100;
                int l1 = (k * 30 + i1 * 70) / 100;
                k = j1;
                l = k1;
                i1 = l1;
            }
            field_76852_a[i * 4 + 0] = (byte)k;
            field_76852_a[i * 4 + 1] = (byte)l;
            field_76852_a[i * 4 + 2] = (byte)i1;
            field_76852_a[i * 4 + 3] = (byte)j;
        }

        double d = 0.0D;
        if(field_76865_g.field_71441_e != null && field_76865_g.field_71439_g != null)
        {
            ChunkCoordinates chunkcoordinates = field_76865_g.field_71441_e.func_72861_E();
            double d2 = (double)chunkcoordinates.field_71574_a - field_76865_g.field_71439_g.field_70165_t;
            double d4 = (double)chunkcoordinates.field_71573_c - field_76865_g.field_71439_g.field_70161_v;
            d = ((double)(field_76865_g.field_71439_g.field_70177_z - 90F) * 3.1415926535897931D) / 180D - Math.atan2(d4, d2);
            if(!field_76865_g.field_71441_e.field_73011_w.func_76569_d())
            {
                d = Math.random() * 3.1415927410125732D * 2D;
            }
        }
        double d1;
        for(d1 = d - field_76868_i; d1 < -3.1415926535897931D; d1 += 6.2831853071795862D) { }
        for(; d1 >= 3.1415926535897931D; d1 -= 6.2831853071795862D) { }
        if(d1 < -1D)
        {
            d1 = -1D;
        }
        if(d1 > 1.0D)
        {
            d1 = 1.0D;
        }
        field_76866_j += d1 * 0.10000000000000001D;
        field_76866_j *= 0.80000000000000004D;
        field_76868_i += field_76866_j;
        double d3 = Math.sin(field_76868_i);
        double d5 = Math.cos(field_76868_i);
        for(int i2 = -4; i2 <= 4; i2++)
        {
            int k2 = (int)(8.5D + d5 * (double)i2 * 0.29999999999999999D);
            int i3 = (int)(7.5D - d3 * (double)i2 * 0.29999999999999999D * 0.5D);
            int k3 = i3 * 16 + k2;
            int i4 = 100;
            int k4 = 100;
            int i5 = 100;
            char c = '\377';
            if(field_76851_c)
            {
                int k5 = (i4 * 30 + k4 * 59 + i5 * 11) / 100;
                int i6 = (i4 * 30 + k4 * 70) / 100;
                int k6 = (i4 * 30 + i5 * 70) / 100;
                i4 = k5;
                k4 = i6;
                i5 = k6;
            }
            field_76852_a[k3 * 4 + 0] = (byte)i4;
            field_76852_a[k3 * 4 + 1] = (byte)k4;
            field_76852_a[k3 * 4 + 2] = (byte)i5;
            field_76852_a[k3 * 4 + 3] = (byte)c;
        }

        for(int j2 = -8; j2 <= 16; j2++)
        {
            int l2 = (int)(8.5D + d3 * (double)j2 * 0.29999999999999999D);
            int j3 = (int)(7.5D + d5 * (double)j2 * 0.29999999999999999D * 0.5D);
            int l3 = j3 * 16 + l2;
            int j4 = j2 < 0 ? 100 : 255;
            int l4 = j2 < 0 ? 100 : 20;
            int j5 = j2 < 0 ? 100 : 20;
            char c1 = '\377';
            if(field_76851_c)
            {
                int l5 = (j4 * 30 + l4 * 59 + j5 * 11) / 100;
                int j6 = (j4 * 30 + l4 * 70) / 100;
                int l6 = (j4 * 30 + j5 * 70) / 100;
                j4 = l5;
                l4 = j6;
                j5 = l6;
            }
            field_76852_a[l3 * 4 + 0] = (byte)j4;
            field_76852_a[l3 * 4 + 1] = (byte)l4;
            field_76852_a[l3 * 4 + 2] = (byte)j5;
            field_76852_a[l3 * 4 + 3] = (byte)c1;
        }

    }
}
