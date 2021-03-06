package net.minecraft.src;

import net.minecraft.server.MinecraftServer;

public class CommandServerSaveAll extends CommandBase
{
    public CommandServerSaveAll()
    {
    }

    public String func_71517_b()
    {
        return "save-all";
    }

    public void func_71515_b(ICommandSender par1ICommandSender, String par2ArrayOfStr[])
    {
        MinecraftServer minecraftserver = MinecraftServer.func_71276_C();
        par1ICommandSender.func_70006_a(par1ICommandSender.func_70004_a("commands.save.start", new Object[0]));

        if (minecraftserver.func_71203_ab() != null)
        {
            minecraftserver.func_71203_ab().func_72389_g();
        }

        try
        {
            for (int i = 0; i < minecraftserver.field_71305_c.length; i++)
            {
                if (minecraftserver.field_71305_c[i] != null)
                {
                    WorldServer worldserver = minecraftserver.field_71305_c[i];
                    boolean flag = worldserver.field_73058_d;
                    worldserver.field_73058_d = false;
                    worldserver.func_73044_a(true, null);
                    worldserver.field_73058_d = flag;
                }
            }
        }
        catch (MinecraftException minecraftexception)
        {
            func_71522_a(par1ICommandSender, "commands.save.failed", new Object[]
                    {
                        minecraftexception.getMessage()
                    });
            return;
        }

        func_71522_a(par1ICommandSender, "commands.save.success", new Object[0]);
    }
}
