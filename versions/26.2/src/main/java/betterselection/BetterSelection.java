package betterselection;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.Mod;

/** Client-only mod. All behaviour lives in the text box mixin; this class only exists so FML has an entry point. */
@Mod(value = BetterSelection.MOD_ID, dist = Dist.CLIENT)
public final class BetterSelection {
    public static final String MOD_ID = "betterselection";
}
