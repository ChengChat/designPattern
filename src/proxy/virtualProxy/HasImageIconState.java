package proxy.virtualProxy;

import javax.swing.*;
import java.awt.*;

public class HasImageIconState implements Icon {
    ImageProxyByStatePattern imageProxy;

    public HasImageIconState(ImageProxyByStatePattern imageProxy) {
        this.imageProxy = imageProxy;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        imageProxy.getImageIcon().paintIcon(c,g,x,y);
    }

    @Override
    public int getIconWidth() {
        return imageProxy.getImageIcon().getIconWidth();
    }

    @Override
    public int getIconHeight() {
        return imageProxy.getImageIcon().getIconHeight();
    }
}
