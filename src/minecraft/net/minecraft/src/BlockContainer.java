package net.minecraft.src;

public abstract class BlockContainer extends Block
{
    protected BlockContainer(int par1, Material par2Material)
    {
        super(par1, par2Material);
        isBlockContainer = true;
    }

    protected BlockContainer(int par1, int par2, Material par3Material)
    {
        super(par1, par2, par3Material);
        isBlockContainer = true;
    }

    /**
     * Called whenever the block is added into the world. Args: world, x, y, z
     */
    public void onBlockAdded(World par1World, int par2, int par3, int par4)
    {
        super.onBlockAdded(par1World, par2, par3, par4);
        par1World.setBlockTileEntity(par2, par3, par4, func_72274_a(par1World));
    }

    public void func_71852_a(World par1World, int par2, int par3, int par4, int par5, int par6)
    {
        super.func_71852_a(par1World, par2, par3, par4, par5, par6);
        par1World.removeBlockTileEntity(par2, par3, par4);
    }

    public abstract TileEntity func_72274_a(World world);

    /**
     * Called when the block receives a client event - see World.sendClientEvent. By default, passes it on to the tile
     * entity at this location. Args: world, x, y, z, event number, parameter
     */
    public void receiveClientEvent(World par1World, int par2, int par3, int par4, int par5, int par6)
    {
        super.receiveClientEvent(par1World, par2, par3, par4, par5, par6);
        TileEntity tileentity = par1World.getBlockTileEntity(par2, par3, par4);

        if (tileentity != null)
        {
            tileentity.receiveClientEvent(par5, par6);
        }
    }
}
