package betterselection.mixin;

import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.screens.ChatScreen;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/**
 * The chat screen passes clicks to its text box itself instead of going through the normal screen code, so it
 * never notes that a drag started and the text box never receives the mouse drag. Without this, dragging to
 * select does nothing in chat (it already worked in other text boxes).
 */
@Mixin(ChatScreen.class)
public abstract class ChatScreenMixin extends Screen {
    @Shadow
    protected EditBox input;

    protected ChatScreenMixin(Component title) {
        super(title);
    }

    @Inject(method = "mouseClicked", at = @At("RETURN"))
    private void startDraggingInInput(double mouseX, double mouseY, int button, CallbackInfoReturnable<Boolean> cir) {
        if (cir.getReturnValueZ() && button == 0 && this.input.isMouseOver(mouseX, mouseY)) {
            this.setDragging(true);
        }
    }
}
