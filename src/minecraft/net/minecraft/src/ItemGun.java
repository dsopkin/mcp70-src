package net.minecraft.src;

public class ItemGun extends ItemBow {

	public ItemGun(int par1) {
		super(par1);
	}


    /**
     * called when the player releases the use item button. Args: itemstack, world, entityplayer, itemInUseCount
     */
    public void onPlayerStoppedUsing(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer, int useTime)
    {
        boolean isCreative = par3EntityPlayer.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, par1ItemStack) > 0;

        if (isCreative || par3EntityPlayer.inventory.hasItem(Item.arrow.shiftedIndex))
        {
            int useTimeForgone = getMaxItemUseDuration(par1ItemStack) - useTime;
            float power = (float)useTimeForgone / 20F;
            power = (power * power + power * 2.0F) / 3F;

            if ((double)power < 0.10000000000000001D)
            {
                return; //quick click
            }

            if (power > 1.0F)
            {
                power = 1.0F; //max power
            }

            EntityArrow entityarrow = new EntityArrow(par2World, par3EntityPlayer, power * 2.0F);

            if (power == 1.0F)
            {
                entityarrow.setIsMaxPower(true);
            }

            int j = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, par1ItemStack);

            if (j > 0)
            {
                entityarrow.setDamage(entityarrow.getDamage() + (double)j * 0.5D + 0.5D);
            }

            int k = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, par1ItemStack);

            if (k > 0)
            {
                entityarrow.setKnockbackStrength(k);
            }

            if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, par1ItemStack) > 0)
            {
                entityarrow.setFire(100);
            }

            par1ItemStack.damageItem(1, par3EntityPlayer);
            par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + power * 0.5F);

            if (isCreative)
            {
                entityarrow.playerOwned = 2;
            }
            else
            {
                par3EntityPlayer.inventory.consumeInventoryItem(Item.arrow.shiftedIndex);
            }

            if (!par2World.isRemote)
            {
                par2World.spawnEntityInWorld(entityarrow);
            }
        }
    }

}
